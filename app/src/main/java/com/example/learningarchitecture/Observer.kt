package com.example.learningarchitecture

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class Observer : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun OnCreate(){
        Log.d("message",
        " called Obserever Oncreate")
    }
}