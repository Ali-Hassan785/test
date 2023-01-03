package com.app.githublibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.app.mylibrarytest.ShowToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var abc = ShowToast()

        var abc_sign: TextView = findViewById(R.id.abc_sign);
        abc.showToast(this, "abc")

        abc_sign.setOnClickListener {

        }

    }
}