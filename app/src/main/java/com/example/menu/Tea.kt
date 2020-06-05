package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tea.*

class Tea : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tea)

        masalachai.setOnClickListener{
            Toast.makeText(this,"Masala Chai it is!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,MasalaChai::class.java)
            startActivity(intent)
        }

        greentea.setOnClickListener{
            Toast.makeText(this,"Green Tea it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,GreenTea::class.java)
            startActivity(intent)
        }

        blacktea.setOnClickListener{
            Toast.makeText(this,"Black Tea it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,BlackTea::class.java)
            startActivity(intent)
        }

        herbal.setOnClickListener{
            Toast.makeText(this,"Herbal Tea it is!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,HerbalTea::class.java)
            startActivity(intent)
        }
        
    }
}
