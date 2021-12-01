package com.example.x0_game

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var refreshButton: Button

    private var player = "p1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        refreshButton = findViewById(R.id.refreshButton)

        button1.setOnClickListener{
            buttonClick(button1)
        }
        button2.setOnClickListener{
            buttonClick(button2)
        }
        button3.setOnClickListener{
            buttonClick(button3)
        }
        button4.setOnClickListener{
            buttonClick(button4)
        }
        button5.setOnClickListener{
            buttonClick(button5)
        }
        button6.setOnClickListener{
            buttonClick(button6)
        }
        button7.setOnClickListener{
            buttonClick(button7)
        }
        button8.setOnClickListener{
            buttonClick(button8)
        }
        button9.setOnClickListener{
            buttonClick(button9)
        }

        refreshButton.setOnClickListener{
            refresh()
        }


    }


    fun buttonClick(btn:Button){
        if (btn.text == ""){
            if(player == "p1"){
                player ="p2"
                btn.text = "X"
            }else{
                player ="p1"
                btn.text = "O"
            }
        }
        win()
    }

    override fun onClick(clickedView: View?) {
        if (clickedView is Button){
            var buttonNumber = 0
            when(clickedView.id){
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9

            }

        }
    }

    fun win(){
        if((button1.text == "X" && button2.text == "X" && button3.text == "X")||
            (button4.text == "X" && button5.text == "X" && button6.text == "X")||
            (button7.text == "X" && button8.text == "X" && button9.text == "X")||
            (button1.text == "X" && button4.text == "X" && button7.text == "X")||
            (button2.text == "X" && button5.text == "X" && button8.text == "X")||
            (button3.text == "X" && button6.text == "X" && button9.text == "X")||
            (button1.text == "X" && button5.text == "X" && button9.text == "X")||
            (button3.text == "X" && button5.text == "X" && button7.text == "X")){
                toast("X won the Game!")
            disablButtons()
        }
        else if((button1.text == "O" && button2.text == "O" && button3.text == "O")||
            (button4.text == "O" && button5.text == "O" && button6.text == "O")||
            (button7.text == "O" && button8.text == "O" && button9.text == "O")||
            (button1.text == "O" && button4.text == "O" && button7.text == "O")||
            (button2.text == "O" && button5.text == "O" && button8.text == "O")||
            (button3.text == "O" && button6.text == "O" && button9.text == "O")||
            (button1.text == "O" && button5.text == "O" && button9.text == "O")||
            (button3.text == "O" && button5.text == "O" && button7.text == "O")){
            toast("O won the Game!")
            disablButtons()
        }
        else{
            if (button1.text != "" && button2.text != "" && button3.text != "" &&
                button4.text != "" && button5.text != "" && button6.text != "" &&
                button7.text != "" && button8.text != "" && button9.text != ""){
            toast("Draw!")
            }
        }
    }

    fun toast(msg:String){
        Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show()
    }

    fun refresh(){
        button1.text =""
        button2.text =""
        button3.text =""
        button4.text =""
        button5.text =""
        button6.text =""
        button7.text =""
        button8.text =""
        button9.text =""

        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true
    }


    fun disablButtons(){
        button1.isEnabled = false
        button2.isEnabled = false
        button3.isEnabled = false
        button4.isEnabled = false
        button5.isEnabled = false
        button6.isEnabled = false
        button7.isEnabled = false
        button8.isEnabled = false
        button9.isEnabled = false

    }


}
