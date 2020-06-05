package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_coffee.*
import kotlinx.android.synthetic.main.activity_hot_coffee.*
import kotlinx.android.synthetic.main.activity_main.*

class Coffee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee)

        hotcoffee.setOnClickListener{
            Toast.makeText(this,"Hot Coffee it is!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,HotCoffee::class.java)
            startActivity(intent)
        }

        cappuccino.setOnClickListener{
            Toast.makeText(this,"Cappuccino it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Cappuccino::class.java)
            startActivity(intent)
        }

        expresso.setOnClickListener{
            Toast.makeText(this,"Expresso it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Expresso::class.java)
            startActivity(intent)
        }

        coldcoffee.setOnClickListener{
            Toast.makeText(this,"Cold Coffee it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,ColdCoffee::class.java)
            startActivity(intent)
        }

    }
}
