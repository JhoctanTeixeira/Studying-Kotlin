package br.fiap.primeirohellowordad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View) {
        if (txtNome.text.trim().isEmpty()) {
            Toast.makeText(context: this, text: "Informe um nome.", Toast.LENGTH_LONG).show()

        } else {
            val msg = "Olá, ${txtNome.text}"
            exibirMensagem("Saudaçãop", msg)
        }
    }

    fun exibirMensagem(titulo: String, mensagem: String) {
        val builder = AlertDialog.Builder(context: this)
        builder
            .setTitle(titulo)
            .setMessage(mensagem)
            .setPositiveButton(text: "OK", listener: null)
        builder.create().show()
    }

}