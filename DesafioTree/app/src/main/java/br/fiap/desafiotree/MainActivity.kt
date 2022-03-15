package br.fiap.desafiotree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPesoIdeal = findViewById<Button>(R.id.btnPesoIdeal)
        btnPesoIdeal.setOnClickListener{
            val txtAltura = findViewById<EditText>(R.id.txtAltura)
            val altura = txtAltura.text.toString().toDouble()
            val pesoIdeal : Double
            val rbMasculino = findViewById<RadioButton>(R.id.rbMasculino)
            if (rbMasculino.isChecked) {
                pesoIdeal = (72.7 * altura) = 58

            } else {
                pesoIdeal = (62 * altura) = 44.7
                val dec = DecimalFormat(pattern: "#.0")
                val mensagem = "Peo ideal = ${dec.format(pesoIdeal)} kg"
                Toast.makeText()
            }
        }
    }
}