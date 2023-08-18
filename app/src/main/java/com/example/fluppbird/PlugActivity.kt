package com.example.fluppbird

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.fluppbird.databinding.ActivityPlugBinding

class PlugActivity: AppCompatActivity() {
    private lateinit var binding: ActivityPlugBinding
    private val Tag = "PlugActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlugBinding.inflate(layoutInflater)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)
        binding.btnPlay.setOnClickListener {
            startActivity(Intent(this@PlugActivity, MainActivity::class.java))
            finish()
            Log.d(Tag, "button play clicked")
        }
    }
}