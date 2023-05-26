package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.button2)
        rollbutton.setOnClickListener{
           rolldice()
        }


    }
     private fun rolldice() {
         val t : Toast
        val diceimage: ImageView = findViewById(R.id.imageView)
        val luckyNumber = 4
        val dice = Dice(6)
         when (dice.roll()) {
             luckyNumber -> {
                 t = Toast.makeText(this, "You win!", Toast.LENGTH_SHORT)
                 diceimage.setImageResource(R.drawable.dice_4)
                 t.show()
             }
             1 -> {
                 t = Toast.makeText(this, "So sorry! You rolled a 1. Try again!", Toast.LENGTH_SHORT)
                 diceimage.setImageResource(R.drawable.dice_1)
                 t.show()
             }
             2 -> {
                 t = Toast.makeText(this, "Sadly, you rolled a 2. Try again!", Toast.LENGTH_SHORT)
                 diceimage.setImageResource(R.drawable.dice_2)
                 t.show()
             }
             3 -> {
                 t = Toast.makeText(this, "Unfortunately, you rolled a 3. Try again!", Toast.LENGTH_SHORT)
                 diceimage.setImageResource(R.drawable.dice_3)
                 t.show()
             }
             5 -> {
                 t = Toast.makeText(this, "Don't cry! You rolled a 5. Try again!", Toast.LENGTH_SHORT)
                 diceimage.setImageResource(R.drawable.dice_5)
                 t.show()
             }
             else -> {
                 t = Toast.makeText(this, "Apologies! You rolled a 6. Try again!", Toast.LENGTH_SHORT)
                 diceimage.setImageResource(R.drawable.dice_6)
                 t.show()
             }
         }
    }
}

class Dice (private val slides : Int)
{
  fun roll() :Int
  {

      return (1..slides).random()
  }

}