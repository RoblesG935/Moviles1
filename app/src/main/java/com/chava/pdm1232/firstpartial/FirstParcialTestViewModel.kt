package com.chava.pdm1232.firstpartial

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import java.time.temporal.TemporalAmount


class FirstParcialTestViewModel : ViewModel() {

    var productionT = mutableStateOf(0)
    var productionA = mutableStateOf(0)
    var percentP = mutableStateOf(0.0f)


    fun updateProductionT(total: Int) {
        productionT.value = total

    }

    fun addProductiona(amount: Int) {

        val currentProduction = productionA.value ?: 0
        productionA.value = currentProduction + amount

    }


    fun add1() {
        productionA.value += 5

    }

    fun add2() {
        productionA.value += 15

    }

    fun add3() {
        productionA.value += 30

    }

    fun add4() {
        productionA.value += 50


    }

    fun percentCalculator() {

        val total = productionT.value ?: 1
        val actual = productionA.value ?: 0
        val calculatedPercet = if (total != 0) {
            (actual.toFloat() / total.toFloat()) * 100

        } else {
            0.0f

        }
        percentP.value = calculatedPercet


    }
}
