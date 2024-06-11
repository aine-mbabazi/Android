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

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.SecondBackArrow.setOnClickListener {

            finish()

        }

        binding.SecondForwardArrow.setOnClickListener {
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)

        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1642662152907-227a0ca2ca0a?q=80&w=1935&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.RobinBird)


    }
}