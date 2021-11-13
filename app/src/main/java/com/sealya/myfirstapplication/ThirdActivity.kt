package com.sealya.myfirstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val backButton: Button = findViewById(R.id.back_button)
        val browseButton: Button=findViewById(R.id.browse_button)
        val intent = Intent(this, SecondActivity::class.java)
        val link = Uri.parse("https://yandex.ru")
        val intentBrow: Intent = Intent (Intent.ACTION_VIEW, link)
        backButton.setOnClickListener {
            startActivity(intent)
        }
        browseButton.setOnClickListener {
            startActivity(intentBrow)
        }
    }
}