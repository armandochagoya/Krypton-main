package com.example.repository

import com.example.BitsoResponse
import com.example.entities.AvailableBooks
import com.example.entities.Response

interface BitsoRepository {
    suspend fun getAvailableBooks():Response<List<AvailableBooks>>
}