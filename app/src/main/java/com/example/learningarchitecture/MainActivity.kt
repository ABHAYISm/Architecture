package com.example.learningarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

     lateinit var txtcounter : TextView
     lateinit var mainviewmodel:viewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainviewmodel=ViewModelProvider(this).get(viewModel::class.java)
        txtcounter = findViewById(R.id.textView)
        setText()
    }

        fun setText(){
            txtcounter.text=mainviewmodel.count.toString();
        }
    fun increment(v:View){
        mainviewmodel.increment()
        setText()
    }
    }
