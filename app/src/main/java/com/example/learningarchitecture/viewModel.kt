package com.example.learningarchitecture

import androidx.lifecycle.ViewModel

class viewModel(val initialval:Int) : ViewModel(){
    var count:Int=initialval
    fun increment(){
        count++

    }
}