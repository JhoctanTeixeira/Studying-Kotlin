package com.example.checkpoint1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class resultado_conta_telefone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_conta_telefone)
    }

    var intentResultado = Intent( this, resultado_conta_telefone::class.java)

    intentResultado.putExtra("msg", mensagem)

    startAcrivity(intentResultado)

    lbResultado.text = intent.getStringExtra("msg")
}