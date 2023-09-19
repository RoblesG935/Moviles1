package com.chava.pdm1232.firstpartial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BarberViewModel : ViewModel() {
    val cutCount = MutableLiveData(0)
    val beardCount = MutableLiveData(0)
    val cnbCount = MutableLiveData(0)
    val total = MutableLiveData(0)

    fun getCutCount(): LiveData<Int> = cutCount
    fun getBeardCount(): LiveData<Int> = beardCount
    fun getCutAndBeard(): LiveData<Int> = cnbCount
    fun getTotal(): LiveData<Int> = total

    fun cut() {
        val currentCut = cutCount.value ?: 0
        cutCount.value = currentCut + 1
        calculateTotal()
    }

    fun beard() {
        val currentBeard = beardCount.value ?: 0
        beardCount.value = currentBeard + 1
        calculateTotal()
    }

    fun cnbeard() {
        val currentCnB = cnbCount.value ?: 0
        cnbCount.value = currentCnB + 1
        calculateTotal()

    }

    private fun calculateTotal() {
        val cutCost = (cutCount.value ?: 0) * 150
        val beardCost = (beardCount.value ?: 0) * 120
        val cnbCost = (cnbCount.value ?: 0) * 270


        val totalCost = cutCost + beardCost + cnbCost
        total.value = totalCost

    }
}



