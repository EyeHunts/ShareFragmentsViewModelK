package com.eyehunts.sharefragmentsviewmodelk


import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val message = MutableLiveData<Any>()

    fun setMessage(msg: String) {
        message.setValue(msg)
    }
}