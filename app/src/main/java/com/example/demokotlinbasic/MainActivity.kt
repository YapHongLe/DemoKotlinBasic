package com.example.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()
            val year = Calendar.getInstance().get(Calendar.YEAR)
            val age = year - userDOB.toInt()
            tvShowAge.text = "Your age is $age"

            var output = ""
            if (age < 18) {
                output = "Underage"
            } else if (age in 18..65) {
                output = "Young people"
            } else if (age in 66..79) {
                output = "Middle-aged"
            } else if (age in 80..99) {
                output = "Elderly"
            } else {
                output = "Long-lived elderly11"
            }

            tvShowOutput.text = "$output"
        }



    }
}
