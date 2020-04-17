package com.anggita.mountesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MenuActivity : AppCompatActivity() {
    private lateinit var lokasi : TextView
    private lateinit var pictures : LinearLayout
    private lateinit var maps : LinearLayout
    private lateinit var videos : LinearLayout
    private lateinit var transport : LinearLayout

    private lateinit var home : ImageView
    private lateinit var share : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        lokasi = findViewById(R.id.lokasi)
        pictures = findViewById(R.id.pictures)
        maps = findViewById(R.id.maps)
        videos = findViewById(R.id.videos)
        transport = findViewById(R.id.transport)
        lokasi.setText(intent.getStringExtra("data1"))

        home = findViewById(R.id.home)
        share = findViewById(R.id.share)

        pictures.setOnClickListener {
            val menu = Intent(this,SearchActivity::class.java)
            menu.putExtra("menu","pictures")
            startActivity(menu)
        }
        maps.setOnClickListener {
            val menu = Intent(this,SearchActivity::class.java)
            menu.putExtra("menu","maps")
            startActivity(menu)
        }
        videos.setOnClickListener {
            val menu = Intent(this,SearchActivity::class.java)
            menu.putExtra("menu","videos")
            startActivity(menu)
        }
        transport.setOnClickListener {
            val menu = Intent(this,SearchActivity::class.java)
            menu.putExtra("menu","transport")
            startActivity(menu)
        }
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
