package com.example.learningarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

//     lateinit var txtcounter : TextView
     lateinit var mainviewmodel:MainViewModel
     private val factstextview:TextView
     get()=findViewById(R.id.textView)
    private val Btnupdate:Button
        get()=findViewById(R.id.btn_update)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainviewmodel=ViewModelProvider(this).get(MainViewModel::class.java)
        //now main view model has live data so lets observe it now.....
        mainviewmodel.factslivedata.observe(this, Observer {
            factstextview.text=it
        })
        Btnupdate.setOnClickListener(){
            mainviewmodel.updateLiveData()
        }
//        txtcounter = findViewById(R.id.textView)
//        setText()
    }

//        fun setText(){
//            txtcounter.text=mainviewmodel.count.toString();
//        }
//    fun increment(v:View){
//        mainviewmodel.increment()
//        setText()
//    }
    }
