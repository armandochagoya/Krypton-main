package com.example.entities
import com.google.gson.annotations.SerializedName

class AccountBalance {
    val success: Boolean,
    val payload: String
    {
        @SerializedName ("balances") val balances : String, [{
        @SerializedName("currency") val currency : "mxn"",
        @SerializedName("total") val total : String "100.1234",
        @SerializedName("locked") val locked: String "25.1234",
        @SerializedName("available") val available: String "75.0000"
        }, {
        @SerializedName("currency")val : "btc",
        @SerializedName("total") val: Float "4.12345678",
        @SerializedName("locked")val: Float "25.00000000",
        @SerializedName("available")val:Float "75.12345678"
        }, {
            @SerializedName("currency")val : String "eth",
            @SerializedName("total")val : String "50.1234",
            @SerializedName("locked")val : String "40.1234",
            @SerializedName("available")val : String"10.0000"
        }]
    }
}:BitsoModel()