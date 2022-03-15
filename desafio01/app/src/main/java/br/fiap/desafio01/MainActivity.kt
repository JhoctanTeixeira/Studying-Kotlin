package br.fiap.desafio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View){
        when (view.id) {
            R.id.btn1 -> imagem.setImageResource(R.drawable.ll)
            R.id.btn2 -> imagem.setImageResource(R.drawable.sds)
            R.id.btn3 -> imagem.setImageResource(R.drawable.ss)
        }


//        if (view.id == R.id.btn1){
//            imagem.setImageResource(R.drawable.ll)
//        }else if (view.id == R.id.btn3) {
//            imagem.setImageResource(R.drawable.sds)
//        }else {
//            imagem.setImageResource(R.drawable.ss)
//        }

    }

//    fun cliqueBotao1(view: View) {
//        imagem.setImageResource(R.drawable.ll)
//
//    }
//    fun cliqueBotao2(view: View) {
//        imagem.setImageResource(R.drawable.sds)
//    }
//    fun cliqueBotao3(view: View) {
//        imagem.setImageResource(R.drawable.ss)
//    }
}