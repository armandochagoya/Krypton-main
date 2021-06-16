package com.example

import com.example.entities.Response
import com.example.repository.BitsoRepositoryImpl
import io.ktor.application.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import kotlinx.coroutines.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    val client = HttpClient(CIO) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }
    runBlocking {
        val availableBooksEndPoint = BitsoEndPoints.AvailableBooksEndPoint
        when(val content = BitsoRepositoryImpl().getAvailableBooks()){
            is Response.Success -> {
                content.data.forEach {
                    println(it)
                }
            }
        }

        /*while(true){
            println("Hello world")
            delay(15000)
        }*/
        // Sample for making a HTTP Client request
        /*
        val message = client.post<JsonSampleClass> {
            url("http://127.0.0.1:8080/path/to/endpoint")
            contentType(ContentType.Application.Json)
            body = JsonSampleClass(hello = "world")
        }
        */
    }

}

data class JsonSampleClass(val hello: String)


//@Serializable


