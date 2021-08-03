package com.example.landapp_sohee.datas

import java.io.Serializable
import java.util.*

class Room2(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) : Serializable {

    fun getFormattedPrice(): String {

        val uk = this.price / 10000
        val rest = this.price % 10000

        return when {
            this.price >= 10000 -> {
                "${uk}억 ${java.text.NumberFormat.getNumberInstance(Locale.KOREAN).format(rest)}"
            }
            else -> {
                "${java.text.NumberFormat.getNumberInstance(Locale.KOREAN).format(rest)}"
            }
        }
    }

    fun getFormattedFloor(): String {

        return when {
            this.floor >= 1 -> {
                "${this.floor} 층"
            }
            this.floor == 0 -> {
                "반지하"
            }
            else -> {
                "지하${this.floor}층"
            }
        }

//        return if (this.floor >= 1) {
//            "${this.floor} 층"
//        } else if (this.floor == 0) {
//            "반지하"
//        } else {
//            "지하${this.floor}층"
//        }
    }
}