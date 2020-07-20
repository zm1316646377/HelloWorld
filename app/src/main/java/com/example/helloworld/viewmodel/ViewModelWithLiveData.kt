package com.example.helloworld.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelWithLiveData : ViewModel() {

    private val liveNum: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(0)
    }

    public fun getNum(): LiveData<Int> {
        return liveNum;
    }

    public fun addNumber(n: Int) {
        liveNum.value = liveNum.value?.plus(n)
    }
}