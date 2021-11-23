package io.github.appformulario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity :
    AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNombre =
            findViewById<EditText>(R.id.nombre)
        val button =
            findViewById<Button>(R.id.button)
        button.setOnClickListener { view ->
            val nombre =
                txtNombre.text.toString()
            Snackbar.make(
                view,
                "Hola $nombre.",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}
