package com.example.myapplication

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    init {
        Log.d("RRR","ViewModel!")
    }
    val counter = MutableLiveData<Int>()
    fun setCounter() {
        this.counter.value = (this.counter.value ?: 0) + 1
    }
}