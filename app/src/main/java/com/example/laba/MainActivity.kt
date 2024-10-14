package com.example.laba

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Найти кнопку по ID
        val button: Button = findViewById(R.id.button)

        // Установить слушатель для кнопки
        button.setOnClickListener {
            // Создать и показать диалоговое окно
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Приветствие")
            builder.setMessage("Привет! Добро пожаловать в наше приложение.")
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            builder.show()
        }
    }
}
