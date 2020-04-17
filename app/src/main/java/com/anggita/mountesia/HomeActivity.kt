package com.anggita.mountesia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var jawa_tengah : RelativeLayout
    private lateinit var jawa_timur : RelativeLayout
    private lateinit var jawa_barat : RelativeLayout

    private lateinit var txt1 : TextView
    private lateinit var txt2: TextView
    private lateinit var txt3 : TextView

    private lateinit var username : TextView

    private lateinit var home : ImageView
    private lateinit var share : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        jawa_tengah = findViewById(R.id.jawa_tengah)
        jawa_barat = findViewById(R.id.jawa_barat)
        jawa_timur = findViewById(R.id.jawa_timur)

        txt1= findViewById(R.id.txt_jawa_tengah)
        txt2 = findViewById(R.id.txt_jawa_timur)
        txt3 = findViewById(R.id.txt_jawa_barat)

        username = findViewById(R.id.username)

        username.setText(intent.getStringExtra("username"))

        home = findViewById(R.id.home)
        share = findViewById(R.id.share)

        jawa_tengah.setOnClickListener{
           val i = Intent(this,MenuActivity::class.java)
            i.putExtra("data1", txt1.text.toString())
            startActivity(i)
        }

        jawa_barat.setOnClickListener{
            val i = Intent(this,MenuActivity::class.java)
            i.putExtra("data1", txt3.text.toString())


            startActivity(i)
        }

        jawa_timur.setOnClickListener{

            val i = Intent(this,MenuActivity::class.java)
            i.putExtra("data1", txt2.text.toString())


            startActivity(i)
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
