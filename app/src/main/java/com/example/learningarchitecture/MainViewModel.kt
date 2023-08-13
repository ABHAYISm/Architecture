package com.example.learningarchitecture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class viewModel(val initialval:Int) : ViewModel(){
//    var count:Int=initialval
//    fun increment(){
//        count++
//
//    }
//}
//Learn live data
class MainViewModel: ViewModel(){
    val factslivedata=MutableLiveData<String>("This is a fact")
    fun updateLiveData(){
        factslivedata.value="Another fact"
    }
}