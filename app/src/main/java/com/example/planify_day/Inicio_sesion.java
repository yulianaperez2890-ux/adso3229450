
package com.example.planify_day;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.planify_day.databinding.ActivityInicioSesionBinding;

public class Inicio_sesion extends AppCompatActivity {

    // paso 1 declaro la variable binding
    private ActivityInicioSesionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // paso 2 asigno
        binding = ActivityInicioSesionBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        // BOTON INICIAR SESION
        binding.btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Aqui se conectara con la pagina principal

            }

        });

        // TEXTO REGISTRARSE
        binding.txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irSiguiente = new Intent(Inicio_sesion.this, Registrarse.class);
                startActivity(irSiguiente);

            }
        });

    }
}
