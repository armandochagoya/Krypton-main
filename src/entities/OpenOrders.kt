package com.example.entities
import com.google.gson.annotations.SerializedName
import java.time.format.DateTimeFormatter

class OpenOrders {
    val "success": Boolean true,
    val "payload": Boolean[{
        @SerializedName("book")val book: "btc_mxn",
        @SerializedName("original_amount")val original_amount: Double"0.01000000",
        @SerializedName("unfilled_amount")val unfilled_amount: Double"0.00500000",
        @SerializedName("original_value")val original_value: Double"56.0",
        @SerializedName("created_at")val created_at: DateTimeFormatter"2016-04-08T17:52:31.000+00:00",
        @SerializedName("updated_at")val updated_at: DateTimeFormatter"2016-04-08T17:52:51.000+00:00",
        @SerializedName("price")val price: Double"5600.00",
        @SerializedName("oid")val oid: String"543cr2v32a1h68443",
        @SerializedName("origin_id")val origin_id: String"origin_id1",
        @SerializedName("side")val side: String"buy",
        @SerializedName("status")val status: String"partial-fill",
        @SerializedName("type")val type: String"limit"
    }, {
        @SerializedName("book")val book:String "btc_mxn",
        @SerializedName("original_amount")val original_amount:Double "0.12680000",
        @SerializedName("unfilled_amount")val unfilled_amount:Double "0.12680000",
        @SerializedName("original_value")val original_value:Double "507.2",
        @SerializedName("created_at")val created_at: DateTimeFormatter"2016-04-08T17:52:31.000+00:00",
        @SerializedName("updated_at")val updated_at:DateTimeFormatter "2016-04-08T17:52:41.000+00:00",
        @SerializedName("price")val price:Double "4000.00",
        @SerializedName("oid")val oid:String "qlbga6b600n3xta7",
        @SerializedName("side")val side:String "sell",
        @SerializedName("status")val status:String "open",
        @SerializedName("type")val type:String "limit"
    }, {
        @SerializedName("book")val book:String "btc_mxn",
        @SerializedName("original_amount")val original_amount:Double "1.12560000",
        @SerializedName("unfilled_amount")val unfilled_amount:Double "1.12560000",
        @SerializedName("original_value")val original_value:Double "6892.66788",
        @SerializedName("created_at")val created_at:DateTimeFormatter "2016-04-08T17:52:31.000+00:00",
        @SerializedName("updated_at")val updated_at:DateTimeFormatter "2016-04-08T17:52:41.000+00:00",
        @SerializedName("price")val price:Double "6123.55",
        @SerializedName("oid")val oid:String "d71e3xy2lowndkfm",
        @SerializedName("side")val side:String "sell",
        @SerializedName("status")val status:String"open",
        @SerializedName("type")val type:String "limit"
    }]
}