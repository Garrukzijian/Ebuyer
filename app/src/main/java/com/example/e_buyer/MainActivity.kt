package com.example.e_buyer

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val TAG = "MainActivity"
        Log.d(TAG, "onCreate() called")
        Buy_button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, BuyActivity::class.java)
            startActivity(intent)
        })
        history_button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, BuyActivity::class.java)
            startActivity(intent)
        })
        Order_button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, BuyActivity::class.java)
            startActivity(intent)
        })
    }
}


