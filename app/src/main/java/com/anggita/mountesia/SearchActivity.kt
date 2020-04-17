package com.anggita.mountesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.text.TextWatcher
import android.widget.ImageView
import android.widget.TextView

class SearchActivity : AppCompatActivity() {
    private lateinit var text : TextView
    private lateinit var home : ImageView
    private lateinit var share : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        text = findViewById(R.id.text)

        text.setText(intent.getStringExtra("menu"))



        home = findViewById(R.id.home)
        share = findViewById(R.id.share)

        home.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }

        share.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Mountesia aplikasi bagi para pendaki, download di: https://play.google.com/store/mountesia"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }
    }
}
