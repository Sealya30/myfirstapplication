package com.sealya.myfirstapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlin.random.Random

private const val TAG = "MyOwnLog"
private const val KEY = "HELLO_KEY"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(
            TAG, "Ты видел деву на скале\n" +
                    "В одежде белой над волнами"
        )
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        val randomizeButton: Button = findViewById(R.id.randomize_button)
        randomizeButton.setBackgroundColor(ContextCompat.getColor(this, R.color.manual))

        fun randomize() {
            val randomValue = Random.nextInt(100)
            helloTextView.text = randomValue.toString()
        }

        helloTextView.text = "Push the button"

        randomizeButton.setOnClickListener {
            randomize()
        }


        val nextButton: Button = findViewById(R.id.next_button)
        val intent = Intent(this, SecondActivity::class.java)

        nextButton.setOnClickListener {
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(
            TAG, "Когда, бушуя в бурной мгле,\n" +
                    "Играло море с берегами,"
        )
    }

    override fun onResume() {
        super.onResume()
        Log.d(
            TAG, "Когда луч молний озарял\n" +
                    "Ее всечасно блеском алым"
        )
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(
            TAG, "Ты видел деву на скале\n" +
                    "В одежде белой над волнами"
        )
    }

    override fun onPause() {
        super.onPause()
        Log.d(
            TAG, "И ветер бился и летал\n" +
                    "С ее летучим покрывалом?"
        )
    }

    override fun onStop() {
        super.onStop()
        Log.d(
            TAG, "Прекрасно море в бурной мгле\n" +
                    "И небо в блесках без лазури;"
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(
            TAG, "Но верь мне: дева на скале\n" +
                    "Прекрасней волн, небес и бури."
        )
    }

}


