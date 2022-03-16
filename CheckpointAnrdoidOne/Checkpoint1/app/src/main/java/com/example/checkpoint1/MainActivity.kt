package com.example.checkpoint1

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun exibirIntegrantes(titulo: String, integrantes: String) {
            val builder = AlertDialog.Builder(this)
            builder
                .setTitle(titulo)
                .setMessage(integrantes)
                .setPositiveButton("OK", null)
            builder.create().show()
        }

        fun cliqueButton(view : View) {
            val txtIntegrantes = " Jhoctan de Deus Teixeira RM88206 e Guilherme Beck ..... ${button3.text}"
            exibirIntegrantes("Desenvolvido por : ", txtIntegrantes)
        }


    }



}