package br.fiap.testes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var msg = "Resultado\n"
        val resultado = intent.getDoubleExtra(name: "resultado", defaultValue: 0,0).toString()
        msg += String.format("%2.f", resultado)
        tvResultado.text = msg
//        tvResultado.text = intent.getDoubleExtra(name: "resultado", defaultValue: 0,0).toString()
    }
}