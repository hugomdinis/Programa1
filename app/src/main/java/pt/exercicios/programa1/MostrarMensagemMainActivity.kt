package pt.exercicios.programa1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarMensagemMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_mensagem_main)

        val mensagem = intent.getStringExtra("mensagem")

        findViewById<TextView>(R.id.textViewMostaMensagemRecebida)
        val textViewMostaMensagemRecebida = mensagem
    }
}