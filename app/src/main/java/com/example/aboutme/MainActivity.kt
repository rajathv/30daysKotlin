package com.example.aboutme
import java.util.*;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {


    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener{rollDice(); rollDice2()}
    }
private fun rollDice2(){
    val randomInt = (1..6).random()

    diceImage2  = findViewById(R.id.diceImage2)

    var drawableresource = when(randomInt){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    diceImage2.setImageResource(drawableresource)

}
    private fun rollDice(){
      //  Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()


         diceImage  = findViewById(R.id.diceImage)

        var drawableresource = when(randomInt){
    1 -> R.drawable.dice_1
    2 -> R.drawable.dice_2
    3 -> R.drawable.dice_3
    4 -> R.drawable.dice_4
    5 -> R.drawable.dice_5
    else -> R.drawable.dice_6
}
        diceImage.setImageResource(drawableresource)

    }
}
