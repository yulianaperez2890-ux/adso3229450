
package com.example.planify_day;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.planify_day.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // paso 1 declaro la variable binding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // paso 2 asigno
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irSiguiente = new Intent(MainActivity.this, Registrarse.class);
                startActivity(irSiguiente);

            }
        });

        binding.btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irSiguiente = new Intent(MainActivity.this, Inicio_sesion.class);
                startActivity(irSiguiente);

            }
        });

    }
}
