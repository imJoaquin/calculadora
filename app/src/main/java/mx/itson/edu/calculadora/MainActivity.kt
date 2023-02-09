package mx.itson.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var operacion: Int = 0
    var numero:Double = 0.0

    lateinit var tvResultado: TextView
    lateinit var tvOperacion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvOperacion=findViewById(R.id.tvOperacion)
        tvResultado=findViewById(R.id.tvResultado)

        val btnDel: Button = findViewById(R.id.btnDel)
        val btnIgual: Button = findViewById(R.id.btnIgual)

        btnIgual.setOnClickListener{
            var numero2: Double = tvResultado.text.toString().toDouble()
            var resp: Double = 0.0
            when(operacion){
                1 -> resp = numero + numero2
                2 -> resp = numero - numero2
                3 -> resp = numero * numero2
                4 -> resp = numero / numero2
            }
            tvResultado.setText(resp.toString())
            tvOperacion.setText("")
        }
        btnDel.setOnClickListener{
            tvOperacion.setText("")
            tvResultado.setText("")
            numero = 0.0
            operacion = 0
        }
    }


    fun toque(view: View){
        val tvResultado: TextView = findViewById(R.id.tvResultado)
        var num2:String = tvResultado.text.toString()

        when(view.id){
            R.id.btn0 -> tvResultado.setText(num2 + "0")
            R.id.btn1 -> tvResultado.setText(num2 + "1")
            R.id.btn2 -> tvResultado.setText(num2 + "2")
            R.id.btn3 -> tvResultado.setText(num2 + "3")
            R.id.btn4 -> tvResultado.setText(num2 + "4")
            R.id.btn5 -> tvResultado.setText(num2 + "5")
            R.id.btn6 -> tvResultado.setText(num2 + "6")
            R.id.btn7 -> tvResultado.setText(num2 + "7")
            R.id.btn8 -> tvResultado.setText(num2 + "8")
            R.id.btn9 -> tvResultado.setText(num2 + "9")
        }
    }

    fun operacion(view: View){
        numero = tvResultado.text.toString().toDouble()
        var num2_text: String = tvResultado.text.toString()
        tvResultado.setText("")
        when(view.id){
            R.id.btnSuma ->{
                tvOperacion.setText(num2_text + "+")
                operacion = 1
            }
            R.id.btnResta ->{
                tvOperacion.setText(num2_text + "-")
                operacion = 2
            }
            R.id.btnMultiplicacion ->{
                tvOperacion.setText(num2_text + "x")
                operacion = 3
            }
            R.id.btnDivision ->{
                tvOperacion.setText(num2_text + "/")
                operacion = 4
            }

        }//when

    }//fun operacion

}//Main activity