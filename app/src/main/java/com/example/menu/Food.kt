package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_food.*
import kotlinx.android.synthetic.main.activity_tea.*

class Food : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        burger.setOnClickListener{
            Toast.makeText(this,"Burger it is!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Burger::class.java)
            startActivity(intent)
        }

        fries.setOnClickListener{
            Toast.makeText(this,"Fries it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Fries::class.java)
            startActivity(intent)
        }

        sandwich.setOnClickListener{
            Toast.makeText(this,"Sandwich it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Sandwich::class.java)
            startActivity(intent)
        }
    }
}
