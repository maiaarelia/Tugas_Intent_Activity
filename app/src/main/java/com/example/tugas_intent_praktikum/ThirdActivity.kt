package com.example.tugas_intent_praktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_intent_praktikum.databinding.ActivityThridBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityThridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernamepengguna = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val emailpengguna = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phonepengguna = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding) {
            username.text = usernamepengguna
            email.text = emailpengguna
            phone.text = phonepengguna
        }
    }
}
