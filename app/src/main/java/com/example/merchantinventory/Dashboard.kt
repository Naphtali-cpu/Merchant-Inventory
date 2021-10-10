package com.example.merchantinventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import de.hdodenhof.circleimageview.CircleImageView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val image = findViewById(R.id.profile) as CircleImageView
        val card1 = findViewById(R.id.c1) as CardView
        val card2 = findViewById(R.id.c2) as CardView
        val card3 = findViewById(R.id.c3) as CardView

        image.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        card1.setOnClickListener{
            val intent = Intent(this, Stores::class.java)
            startActivity(intent)
        }
        card2.setOnClickListener{
            val intent = Intent(this, PaidProducts::class.java)
            startActivity(intent)
        }
        card3.setOnClickListener{
            val intent = Intent(this, UnpaidProducts::class.java)
            startActivity(intent)
        }
    }
}