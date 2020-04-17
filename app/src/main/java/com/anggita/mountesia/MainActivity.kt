package com.anggita.mountesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var login : Button
    private lateinit var username : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login = findViewById(R.id.login)
        username = findViewById(R.id.username)

        login.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("username", username.text.toString())
            startActivity(intent)
        }


    }
}
