package com.example.helloworld.viewmodel

import android.app.Application
import android.preference.PreferenceManager
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle

class SharedPrefViewModel(
    application: Application,
    private val savedStateHandle: SavedStateHandle
) : AndroidViewModel(application) {
    private val KEY = "shared_number_key"

    init {
        if (!savedStateHandle.contains(KEY)) {
            load()
        }
    }

    fun getNumber(): LiveData<Int> {
        return savedStateHandle.getLiveData(KEY)
    }

    fun add(n: Int) {
        savedStateHandle.set(KEY, getNumber().value?.plus(n))
        save()
    }

    private fun load() {
         val number:Int = PreferenceManager.getDefaultSharedPreferences(getApplication())
            .getInt(KEY, 0)
        savedStateHandle.set(KEY, number)
    }

    private fun save() {
        PreferenceManager.getDefaultSharedPreferences(getApplication())
            .edit()
            .putInt(KEY, getNumber().value ?: 0)
            .apply()
    }
}