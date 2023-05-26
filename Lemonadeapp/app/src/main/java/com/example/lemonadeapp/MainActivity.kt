package com.example.lemonadeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagelemonade: ImageView = findViewById(R.id.imageView)
        val te: TextView = findViewById(R.id.textView)
        var t : Toast
        val flag = 0
      //  while(flag == 0) {
            imagelemonade.setOnClickListener()
            {
                imagelemonade.setImageResource(R.drawable.lemonfreash)
                val l = Lemonada()
                val i = 0
                val squeznum = l.squez()
                te.text="Click to squez"
                while (i != squeznum) {
                    t = Toast.makeText(this, "Click agian", Toast.LENGTH_SHORT)
                    t.show()
                }

                if (i == squeznum) {
                    imagelemonade.setImageResource(R.drawable.lemonadecup)
                    te.text="Click to drink Drink"
                }

            }
      //  }
    }
}


class Lemonada()
{
    fun squez () : Int
    {
        return (1..6).random()
    }

    fun Drink()
    {

    }
}