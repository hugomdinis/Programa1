package pt.exercicios.programa1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnviar = findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener { enviaMensagem() }
    }

    private fun enviaMensagem() {
        val editTextTextMensagem = findViewById<EditText>(R.id.editTextTextMensagem)
        val mensagem = editTextTextMensagem.text.toString()

        val intent = Intent(this, MostrarMensagemMainActivity::class.java)
        startActivity(intent)
    }
}