package com.example.entities
import com.google.gson.annotations.SerializedName

class AccountStatus {
    val "success": Boolean true,
    val "payload": String
    {
        @SerializedName("client_id")val client_id:Number "1234",
        @SerializedName("first_name")val first_name:String "Claude",
        @SerializedName("last_name")val last_name:String "Shannon",
        @SerializedName("status")val status: String "active",
        @SerializedName("daily_limit")val daily_limit:Float "5300.00",
        @SerializedName("monthly_limit")val monthly_limit:Float "32000.00",
        @SerializedName("daily_remaining")val daily_remaining:Float "3300.00",
        @SerializedName("monthly_remaining")val monthly_remaining: Float "31000.00",
        @SerializedName("cash_deposit_allowance")val cash_deposit_allowance:Float "5300.00",
        @SerializedName("cellphone_number")val cellphone_number:Boolean "verified",
        @SerializedName("cellphone_number_stored")val cellphone_number_stored:Number"+525555555555",
        @SerializedName("email_stored")val email_stored:String"shannon@maxentro.py",
        @SerializedName("official_id")val official_id:String "submitted",
        @SerializedName("proof_of_residency")val proof_of_residency:String "submitted",
        @SerializedName("signed_contract")val signed_contract:String "unsubmitted",
        @SerializedName("origin_of_funds)val origin_of_funds:String "unsubmitted",
}