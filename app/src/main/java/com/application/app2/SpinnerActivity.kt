package com.application.app2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*

//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class SpinnerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
//        OnClickTime()

        val btnIntent = findViewById<Button>(R.id.btn_intent)
        btnIntent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@SpinnerActivity, MainActivity::class.java)
                startActivity(intent)
            }

        })}}
//package com.application.app2
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//import android.widget.TimePicker
//
//class SpinnerActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_spinner)
//        OnClickSpin()
//    }
//
//    private fun OnClickSpin(){
//        val textView2 = findViewById<TextView>(R.id.textView2)
//        val timePicker2 = findViewById<TimePicker>(R.id.timePicker2)
//    }
//
//}