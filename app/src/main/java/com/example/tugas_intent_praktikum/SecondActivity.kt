package com.example.tugas_intent_praktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_intent_praktikum.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val TAG = "MainActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnLogin.setOnClickListener{
                val firstintent = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(firstintent)
            }


            registerlink.setOnClickListener{
                val secondintent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(secondintent)
            }
        }
    }
}