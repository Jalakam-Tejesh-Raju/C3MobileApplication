package com.example.medicineapplication.ui.products

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UnderConstructionModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "The page is under construction"
    }
    val text: LiveData<String> = _text
}