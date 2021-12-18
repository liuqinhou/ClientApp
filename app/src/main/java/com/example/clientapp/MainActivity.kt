package com.example.clientapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnforceLoginout.setOnClickListener {
            var intent = Intent("com.example.helloworld.LOGINOUT")
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.setPackage("com.example.helloworld")
            sendBroadcast(intent)
        }

        btnJumpSecond.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}