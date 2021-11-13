package com.sealya.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

private const val KEY="HELLO_KEY"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nextButton: Button = findViewById(R.id.next_button)
        val intent:Intent=Intent(this, ThirdActivity::class.java)
        nextButton.setOnClickListener {
            startActivity(intent)
        }

    }
}