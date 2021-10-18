package com.example.arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    var text = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text += "\nonline"
        textView.text = text
    }

    override fun onRestart() {
        super.onRestart()
        text += "\nonline"
        textView.text = text
    }

    override fun onPause() {
        super.onPause()
        val sdf = SimpleDateFormat(" hh:mm:ss dd/M/yyyy")
        val currentDate = "Last seen on " + sdf.format(Date())
        text += "\n$currentDate"
        textView.text = text
    }
}