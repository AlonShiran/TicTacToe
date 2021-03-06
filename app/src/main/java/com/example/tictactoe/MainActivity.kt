package com.example.tictactoe
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private var player = "p1"
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1.setOnClickListener {
            buttonClick(b1)
        }
        b2.setOnClickListener {
            buttonClick(b2)
        }
        b3.setOnClickListener {
            buttonClick(b3)
        }
        b4.setOnClickListener {
            buttonClick(b4)
        }
        b5.setOnClickListener {
            buttonClick(b5)
        }
        b6.setOnClickListener {
            buttonClick(b6)
        }
        b7.setOnClickListener {
            buttonClick(b7)
        }
        b8.setOnClickListener {
            buttonClick(b8)
        }
        b9.setOnClickListener {
            buttonClick(b9)
        }
        restartgame.setOnClickListener {
            restartGame()
        }
    }

    private fun buttonClick(btn: Button) {
        if (btn.text == "") {
            if (player == "p1") {
                player = "p2"
                btn.text = "X"
            } else {
                player = "p1"
                btn.text = "O"

            }
        }
        win()
    }

    private fun win() {
        if ((b1.text == "O" && b2.text == "O" && b3.text == "O")
            || (b4.text == "O" && b5.text == "O" && b6.text == "O")
            || (b7.text == "O" && b8.text == "O" && b9.text == "O")
            || (b1.text == "O" && b4.text == "O" && b7.text == "O")
            || (b2.text == "O" && b5.text == "O" && b8.text == "O")
            || (b3.text == "O" && b6.text == "O" && b9.text == "O")
            || (b1.text == "O" && b5.text == "O" && b9.text == "O")
            || (b3.text == "O" && b5.text == "O" && b7.text == "O")
        ) {
            txtResult.text = " O won the game! "
            toast(" O won the game! ")
            disableButtons()
        } else if ((b1.text == "X" && b2.text == "X" && b3.text == "X")
            || (b7.text == "X" && b8.text == "X" && b9.text == "X")
            || (b1.text == "X" && b4.text == "X" && b7.text == "X")
            || (b2.text == "X" && b5.text == "X" && b8.text == "X")
            || (b3.text == "X" && b6.text == "X" && b9.text == "X")
            || (b1.text == "X" && b5.text == "X" && b9.text == "X")
            || (b3.text == "X" && b5.text == "X" && b7.text == "X")
        ) {
            txtResult.text = " X won the game! "
            toast(" X won the game! ")
            disableButtons()
        } else {
            if (b1.text != "" && b2.text != "" && b3.text != "" && b4.text != "" && b5.text != "" && b6.text != "" && b7.text != "" && b8.text != "" && b9.text != "") {
                txtResult.text = " Tie Game "
                toast(" Tie Game ")
            }
        }
    }

    private fun toast(msg: String) {
        Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
    }

    private fun restartGame() {
        b1.text = ""
        b2.text = ""
        b3.text = ""
        b4.text = ""
        b5.text = ""
        b6.text = ""
        b7.text = ""
        b8.text = ""
        b9.text = ""
        b1.isEnabled = true
        b2.isEnabled = true
        b3.isEnabled = true
        b4.isEnabled = true
        b5.isEnabled = true
        b6.isEnabled = true
        b7.isEnabled = true
        b8.isEnabled = true
        b9.isEnabled = true
        txtResult.text = ""
    }

    private fun disableButtons() {
        b1.isEnabled = false
        b2.isEnabled = false
        b3.isEnabled = false
        b4.isEnabled = false
        b5.isEnabled = false
        b6.isEnabled = false
        b7.isEnabled = false
        b8.isEnabled = false
        b9.isEnabled = false
    }
}






