package br.fiap.combustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewByID<Button>(R.id.btnCalcular)
        btnCalcular.setonClickListener {view: View ->
            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            var precoAlcool = txtAlcool.text.toSTring().toDouble()
            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGalosina = txtGasolina.text.toString().toDouble()
            var resultado : Double = precoAlcool / precoGasolina

            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            }else if (resultado < 0.7){
                mensagem = "Álcool"
            }else{
                mensagem = "Tanto faz"
            }
            Toast.makeText(context: this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}