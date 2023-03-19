package com.example.livedata_viewmodel_databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0
    }

    fun increaseCounter(){
        counter.value = (counter.value)?.plus(1)
    }
}