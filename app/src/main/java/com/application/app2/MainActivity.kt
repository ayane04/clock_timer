package com.application.app2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*

//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        OnClickTime()

        val btnIntent = findViewById<Button>(R.id.btn_intent)
        btnIntent.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SpinnerActivity::class.java)
                startActivity(intent)
            }

        })}}



//    private fun OnClickTime() {
//
//        val textView = findViewById<TextView>(R.id.textView)
//        val timePicker = findViewById<TimePicker>(R.id.timePicker)
//        timePicker.setOnTimeChangedListener { _, hour, minute -> var hour = hour
//            var am_pm = ""
//            // AM_PM decider logic
//            when {hour == 0 -> { hour += 12
//                am_pm = "AM"
//            }
//                hour == 12 -> am_pm = "PM"
//                hour > 12 -> { hour -= 12
//                    am_pm = "PM"
//                }
//                else -> am_pm = "AM"
//            }
//            if (textView != null) {
//                val hour = if (hour < 10) "0" + hour else hour
//                val min = if (minute < 10) "0" + minute else minute
//                // display format of time
//                val msg = "Time is: $hour : $min $am_pm"
//                textView.text = msg
//                textView.visibility = ViewGroup.VISIBLE
//            }
//        }
//    }
