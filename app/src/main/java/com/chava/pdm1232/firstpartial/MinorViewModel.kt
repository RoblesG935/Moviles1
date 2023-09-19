package com.chava.pdm1232.firstpartial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MinorViewModel:ViewModel() {
    var numberMin = MutableLiveData(0)
    fun getNumber(): MutableLiveData<Int> = numberMin
    fun getNumber(number1: Int,number2: Int,numer3: Int){
        val numberMinor = minOf(number1,number2,numer3)
        numberMin.postValue(numberMinor)

    }
}