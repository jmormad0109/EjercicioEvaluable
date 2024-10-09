package com.example.ejercicioevaluable

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        fun f1(
            a: Double,
            b: Double,
            c: Double,
            fn: (Double, Double, Double) -> Array<Double>
        ): Array<Double> = fn(a, b, c)

        fun ecuacionSegundoGrado(a: Double, b: Double, c: Double): Array<Double> {
            var raiz = (b * b) - (4 * a * c)
            if (raiz > 0) {
                var x1 = (-b + raiz) / 2 * a
                var x2 = (b + raiz) / 2 * a
                return arrayOf(1.0, x1, x2)
            } else if (raiz.toInt() == 0) {
                var x = -b / 2 * a
                return arrayOf(2.0, x, 0.0)
            } else {
                return arrayOf(0.0, 0.0, 0.0)
            }
        }
        fun main() {
            println(
                "La ecuacion con los valores a=1, b=-3 y c=2 es ${
                    f1(
                        1.0,
                        -3.0,
                        2.0,
                        ::ecuacionSegundoGrado
                    )
                }"
            )

        }








    }
    }