package com.example.helloworld.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DataBindingViewModel(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {
    private val KEY = "number"

    public fun getNum(): MutableLiveData<Int> {
        if (!savedStateHandle.contains(KEY)) {
            savedStateHandle.set(KEY, 0)
        }

        return savedStateHandle.getLiveData(KEY)
    }

    public fun addNumber(n: Int) {
        getNum().value = getNum().value?.plus(n)
    }

//    private val liveNum: MutableLiveData<Int> by lazy {
//        MutableLiveData<Int>(0)
//    }

//    private val liveNumber: MutableLiveData<Int> by lazy {
//        MutableLiveData<Int>(0)
//    }
//
//    public fun getNum(): LiveData<Int> {
//        return liveNumber;
//    }
//
//    public fun addNumber(n: Int) {
//        liveNumber.value = liveNumber.value?.plus(n)
//    }
}