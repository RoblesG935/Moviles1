package com.chava.pdm1232.firstpartial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * El viewModel siempre debe de heredar de la clase ViewModel
 */
class EvenOrOddViewModel : ViewModel() {
    var evenOrOddStatus = MutableLiveData<String>()
    fun getResultStatus(): MutableLiveData<String> = evenOrOddStatus
    var isEven = MutableLiveData<Boolean>()
    fun showImage():MutableLiveData<Boolean> = isEven


    fun calculateEvenOrOdd(number: Int) {
        if (number != 0) {


            if (number % 2 == 0) {
                evenOrOddStatus.postValue("El numero es par")
                isEven.postValue(true)
            } else if (number % 2 == 1) {
                evenOrOddStatus.postValue("El numero es impar")
                isEven.postValue(false)

            }
        } else {

            evenOrOddStatus.postValue("El numero es indefinido")

        }
    }


}


