package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.bluebirdPrevious.setOnClickListener {
            finish()
        }

        binding.blueBirdView4.setOnClickListener {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1616081352935-7daa6487b6ae?q=80&w=1965&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.ThirdBlueBird)
    }
}