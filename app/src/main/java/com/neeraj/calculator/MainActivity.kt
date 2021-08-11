package com.neeraj.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var hasDot: Boolean=false;
    fun btnClicked(view: View){
        tvInput.append((view as Button).text)
    }
    fun clrClicked(view: View){
        tvInput.text=""
        hasDot=false;
    }
    fun dotClicked(view:View){
        if(!hasDot) {
            tvInput.append(".")
            hasDot=true
        }
    }
}
