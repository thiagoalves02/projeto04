package com.example.myapplication.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.myapplication.R

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val sair = findViewById<ImageButton>(R.id.btnExit)
        val horarios = findViewById<ImageButton>(R.id.btnHorario)
        val disciplina = findViewById<ImageButton>(R.id.btnDisciplina)
        val home = findViewById<ImageButton>(R.id.btnHome)

        sair.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        horarios.setOnClickListener{
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
        }

        disciplina.setOnClickListener{
            val intent = Intent(this, ClassActivity::class.java)
            startActivity(intent)
        }

        home.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}