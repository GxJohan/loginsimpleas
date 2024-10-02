package com.example.proyecto41

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyecto41.databinding.ActivitySecondActvityBinding
import android.content.Intent


class SecondActvity : AppCompatActivity() {

    //1. Declaramos la variable binding
    private lateinit var binding: ActivitySecondActvityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //2. Inicializamos el binding
        binding = ActivitySecondActvityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //3. Obtenemos el valor del username
        val username = intent.getStringExtra("username")

        //Mostramos el mensaje de bienvenida
        binding.tvWelcome.text = "Bienvenido $username!!!"

        //Configuramos el botón para cerrar sesión
        binding.btnLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}