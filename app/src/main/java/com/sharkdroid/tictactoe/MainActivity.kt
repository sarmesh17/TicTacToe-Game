package com.sharkdroid.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sharkdroid.tictactoe.databinding.ActivityMainBinding
import com.sharkdroid.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding:ActivityMainBinding

     var flag=0
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

          binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }

//        on-click
       fun check(view: View){

           val btnCurrent=view as Button

           if(btnCurrent.text == ""){

               count++

               if (flag == 0){

                   btnCurrent.text = "X"
                   flag=1

               }else{

                   btnCurrent.text="O"
                   flag=0
               }

//              saving the input of the user

               val b1=binding.btn1.text.toString()
               val b2=binding.btn2.text.toString()
               val b3=binding.btn3.text.toString()
               val b4=binding.btn4.text.toString()
               val b5=binding.btn5.text.toString()
               val b6=binding.btn6.text.toString()
               val b7=binding.btn7.text.toString()
               val b8=binding.btn8.text.toString()
               val b9=binding.btn9.text.toString()

               when {
                   b1 == b2 && b2 == b3 && b3 !="" -> {
                       Toast.makeText(applicationContext, "Winner is: $b1", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   b4 == b5 && b5 == b6 && b6!="" -> {

                       Toast.makeText(applicationContext, "Winner is: $b4", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   b7 == b8 && b8 == b9 && b9 !="" -> {

                       Toast.makeText(applicationContext, "Winner is: $b7", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   b1 == b4 && b4 == b7 && b7!="" -> {

                       Toast.makeText(applicationContext, "Winner is : $b1", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   b2 == b5 && b5 == b8 && b8 !="" -> {

                       Toast.makeText(applicationContext, "Winner is : $b2", Toast.LENGTH_SHORT).show()

                   }
                   b3 == b6 && b6 == b9 && b9!="" -> {

                       Toast.makeText(applicationContext, "Winner is : $b3", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   b3 == b5 && b5 == b7 && b7 !="" -> {

                       Toast.makeText(applicationContext, "Winner is : $b3", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   b1 == b5 && b5 == b9 && b9 !="" -> {

                       Toast.makeText(applicationContext, "Winner is : $b1", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
                   count == 9 -> {

                       Toast.makeText(applicationContext, "Game is Draw", Toast.LENGTH_SHORT).show()
                       newGame()
                   }
               }



           }


       }

       private fun newGame(){

           binding.btn1.text=""
           binding.btn2.text=""
           binding.btn3.text=""
           binding.btn4.text=""
           binding.btn5.text=""
           binding.btn6.text=""
           binding.btn7.text=""
           binding.btn8.text=""
           binding.btn9.text=""

           flag=0
           count=0

       }

    }


