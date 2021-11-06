package com.example.srijan20app

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.ScrollView
import androidx.annotation.RequiresApi
import com.example.srijan20app.databinding.ActivityEventBinding

class EventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEventBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val scrollDetail = findViewById<ScrollView>(R.id.scroll_detail)
        scrollDetail.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            val totalScrollLength: Int = scrollDetail.getChildAt(0).height - scrollDetail.height

            val progressBar = findViewById<ProgressBar>(R.id.progressBar)
            progressBar.apply {
                max = totalScrollLength
                progress = scrollY
            }
        }

        binding.eventAlarm.setOnClickListener {
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }
    }
}