package com.example.repository

import com.example.BitsoEndPoints
import com.example.BitsoResponse
import com.example.entities.AvailableBooks
import com.example.entities.Response
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import java.lang.Exception

class BitsoRepositoryImpl : BitsoRepository {
    private val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }


    override suspend fun getAvailableBooks() = GlobalScope.async {
        val response = client.get<BitsoResponse<AvailableBooks>>(BitsoEndPoints.AvailableBooksEndPoint.path)
        if (!response.success) Response.Fail(Exception("Didn't Success"))
        else Response.Success(response.payload)
    }.await()
}