package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel : ViewModel() {

    var resultMutableLiveData = MutableLiveData<Boolean>()
    val resultLiveData : LiveData<Boolean> = resultMutableLiveData

    fun computation(num1: Int, num2: Int) {
        val addition = num1 + num2
        resultMutableLiveData.value = addition >= 100
    }

}