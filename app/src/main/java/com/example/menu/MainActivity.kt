package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coffee.setOnClickListener{
            Toast.makeText(this,"Aaha,You prefer Coffee!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Coffee::class.java)
            startActivity(intent)
        }

        tea.setOnClickListener{
            Toast.makeText(this,"Aaha,You prefer Tea!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Tea::class.java)
            startActivity(intent)
        }

        food.setOnClickListener{
            Toast.makeText(this,"Aaha,You prefer Food!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Food::class.java)
            startActivity(intent)
        }
    }
}
