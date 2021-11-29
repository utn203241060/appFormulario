package io.github.appformulario

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity :AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val primerNumero = findViewById<View>(R.id.numero1) as EditText
        val segundoNumero = findViewById<View>(R.id.numero2) as EditText

        val button = findViewById<Button>(R.id.buttonSumar)
         button.setOnClickListener { view ->
            val resultado =
                primerNumero.text.toString().toInt() + segundoNumero.text.toString().toInt()
            Snackbar.make(
                view,
                "Este es el resultado de la suma $resultado.",
                Snackbar.LENGTH_LONG
            ).show()
        }
        val buttonR = findViewById<Button>(R.id.buttonRest)
        buttonR.setOnClickListener{ view ->
            val resultadoRes =
                primerNumero.text.toString().toInt() - segundoNumero.text.toString().toInt()
            Snackbar.make(
                view,
                "Este es el resultado de la resta $resultadoRes.",
                Snackbar.LENGTH_LONG
            ).show()

        }
        val buttonM = findViewById<Button>(R.id.buttonMul)
        buttonM.setOnClickListener{ view ->
            val resultadoRes =
                primerNumero.text.toString().toInt() * segundoNumero.text.toString().toInt()
            Snackbar.make(
                view,
                "Este es el resultado de la Multiplicacion $resultadoRes.",
                Snackbar.LENGTH_LONG
            ).show()

        }
        val buttonD = findViewById<Button>(R.id.buttonDiv)
        buttonD.setOnClickListener{ view ->
            val resultadoRes =
                primerNumero.text.toString().toInt() / segundoNumero.text.toString().toInt()
            Snackbar.make(
                view,
                "Este es el resultado de la Division $resultadoRes.",
                Snackbar.LENGTH_LONG
            ).show()

        }
    }
}


