package com.example.myapplication.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.R

class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        val sair = findViewById<ImageButton>(R.id.btnExit)
        val home = findViewById<ImageButton>(R.id.btnHome)
        val disciplina = findViewById<ImageButton>(R.id.btnDisciplina)
        val boletos = findViewById<ImageButton>(R.id.btnBoletos)

        sair.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        disciplina.setOnClickListener{
            val intent = Intent(this, ClassActivity::class.java)
            startActivity(intent)
        }

        boletos.setOnClickListener{
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}