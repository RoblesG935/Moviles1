package com.chava.pdm1232.firstpartial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chava.pdm1232.R

class CardsViewModel : ViewModel() {
    var cardId = MutableLiveData(R.drawable.back)
    fun getImagen(): MutableLiveData<Int> = cardId
    fun getNumbers() {
        val randomcards = (0..12).random() // generated random from 0 to 13 included
        when (randomcards) {
            0 -> cardId.postValue(R.drawable.h1)
            1 -> cardId.postValue(R.drawable.h2)
            2 -> cardId.postValue(R.drawable.h3)
            3 -> cardId.postValue(R.drawable.h4)
            4 -> cardId.postValue(R.drawable.h5)
            5 -> cardId.postValue(R.drawable.h6)
            6 -> cardId.postValue(R.drawable.h7)
            7 -> cardId.postValue(R.drawable.h8)
            8 -> cardId.postValue(R.drawable.h9)
            9 -> cardId.postValue(R.drawable.h10)
            10 -> cardId.postValue(R.drawable.h11)
            11 -> cardId.postValue(R.drawable.h12)
            12 -> cardId.postValue(R.drawable.h13)

        }
    }
    fun hideCard(){
        cardId.postValue(R.drawable.back)
    }
}