package com.example.entities
import com.google.gson.annotations.SerializedName

data class AvailableBooks(
    val book: String,
    @SerializedName("minimum_amount") val minimumAmount: Float,
    @SerializedName("maximum_amount") val maximumAmount: Float,
    @SerializedName("minimum_price") val minimumPrice: Float,
    @SerializedName("maximum_price") val maximumPrice: Float,
    @SerializedName("minimum_value") val minimumValue: Float,
    @SerializedName("maximum_value") val maximumValue: Float
)
    data class Fees(
        @SerializedName("flat_rate") val flatRate: FlatRate,
        @SerializedName("structure") val structure: List<Fee>,
    )

    data class FlatRate(
        @SerializedName("maker") val maker: Double,
        @SerializedName("taker") val taker: Double,
    )

    data class Fee(
        @SerializedName("volume") val volume: Double,
        @SerializedName("maker") val maker: Double,
        @SerializedName("taker") val taker: Double
    )
