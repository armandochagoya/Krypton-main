package com.example

import com.google.gson.annotations.SerializedName

private const val BASE_URL = "https://api.bitso.com/v3/"
private const val AVAILABLE_BOOKS = "available_books"

class Bitso {
    companion object {

        fun getPath(path: String) = BASE_URL + path
    }
}

enum class BitsoEndPoints {
    AvailableBooksEndPoint {
        override val path = "$BASE_URL$AVAILABLE_BOOKS"
    },
    TickerEndPoint {
        override val path = "${BASE_URL}available_books"
    },
    OrderBookEndPoint {
        override val path = "${BASE_URL}available_books"
    },
    TradesEndPoint {
        override val path = "${BASE_URL}available_books"
    };

    abstract val path: String


}

/*enum class BitsoEndPoints {
    AvailableBooks {
        override fun getPath(): String {
            return Bitso.BASE_URL + Bitso.AVAILABLE_BOOKS
        }
    };

    abstract fun getPath(): String
}*/

/*data class BitsoResponse<out T>(val success:Boolean, val payload:List<T>){


}*/
data class BitsoResponse<out T>(val success: Boolean, val payload: List<T>)



data class Ticker(
    val book: String, val volume: Float, val high: Float, val last: Float,
    val low: Float, val vwap: Float, val ask: Float, val bid: Float, @SerializedName("created_at") val createdAt: String
):BitsoModel()

data class OrderBook(
    val asks: List<Order>,
    val bids: List<Order>,
    val sequence: Long,
    @SerializedName("updated_at") val updatedAt: String
):BitsoModel()

data class Order(val oid: String, val book: String, val price: Float, val amount: Float)

data class Trades(
    val book: String, @SerializedName("created_at") val createdAt: String, val amount: Float,
    @SerializedName("maker_side") val makerSide: String, val price: Float, val tid: String
):BitsoModel()

open class BitsoModel(){}




