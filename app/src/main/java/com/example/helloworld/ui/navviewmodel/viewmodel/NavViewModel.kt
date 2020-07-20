package com.example.helloworld.ui.navviewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NavViewModel : ViewModel() {
    private val number: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>().also {
            it.value = 0 }
    }

    public fun getLiveNumber(): MutableLiveData<Int> {
        return number
    }

    public fun add(n: Int) {
        number.value = number.value?.plus(n)
    }
}