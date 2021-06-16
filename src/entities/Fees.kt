package com.example.entities
import com.google.gson.annotations.SerializedName

data class Fees {
    val btc_mxn: String,
    @SerializedName("taker_fee_decimal") val traker_fee_decimal: Double,
    @SerializedName("taker_fee_percent") val taker_fee_perdcent: Double,
    @SerializedName("maker_fee_decimal") val maker_fee_decimal: Double,
    @SerializedName("maker_fee_percent") val maker_fee_percent: Double,

    val eth_mxn: String,
    @SerializedName("taker_fee_decimal") val taker_fee_decimal: Double,
    @SerializedName("taker_fee_percent") val taker_fee_percent: Double,
    @SerializedName("maker_fee_decimal") val maker_fee_decimal: Double,
    @SerializedName("maker_fee_percent") val maker_fee_percent:Double,

    val withdrawal_fees: String,
    @SerializedName("btc") val btc:Double,
    @SerializedName("eth") val eth:Double
}: BitsoModel()