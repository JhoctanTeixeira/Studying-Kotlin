package br.fiap.testes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSomar.setOnClickListener {
            if (camposValidos()) {
                val n1 = txtNumOne.text.toString().toDouble()
                val n2 = txtNumTwo.text.toString().toDouble()
                val soma = soma(n1, n2)
                val intentResultadoActivity = Intent(packageContext: this, ResultadoActivity::class.java)


            }
        }
    }
    fun camposValidos() : Boolean {
            var msg = ""
            if (txtNumOne.text.trim().isEmpty()){
                msg = "Informe o primeiro número."
            }
            else if(txtNumTwo.text.trim().isEmpty()) {
                msg = "Informe o segundo número."
            }
            else {
                return true
            }
            Toast.makeText(context: this, msg, Toast.LENGTH_LONG).show()
            return false
        }
    }

}