package com.example.checkpoint1

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculadora.*

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val rbSomar = findViewById<RadioButton>(R.id.radioButtonSoma)
        val rbSub = findViewById<RadioButton>(R.id.radioButtonSub)
        val rbMult = findViewById<RadioButton>(R.id.radioButtonMult)
        val rbDiv = findViewById<RadioButton>(R.id.radioButtonDiv)

        buttonCalcular.setOnClickListener{
            val ctx = editTextV1.text.toString().toDouble()
            val ctxTwo = editTextV2.text.toString().toDouble()
            val conta : Double

            if (rbSomar.isChecked) {
                conta = (ctx) + (ctxTwo)
            }
            else if (rbSub.isChecked) {
                conta = (ctx) - (ctxTwo)
            }
            else if (rbMult.isChecked) {
                conta = (ctx) * (ctxTwo)
            }
            else {
                conta = (ctx) / (ctxTwo)
            }
            val resultado = "Conta = ${(conta)}"
            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
        }

    }
}