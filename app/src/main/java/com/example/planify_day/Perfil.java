package com.example.planify_day;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.planify_day.databinding.ActivityPerfilBinding;

public class Perfil extends AppCompatActivity {
    private ActivityPerfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPerfilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnNotificaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Perfil.this, "Preferencias de notificaciones actualizadas", Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnTemaOscuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Perfil.this, "Modo visual cambiado con éxito", Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnGuardarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Perfil.this, "¡Cambios guardados correctamente!", Toast.LENGTH_SHORT).show();
            }
        });


        binding.btnIrAsistente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perfil.this, Asistente.class);
                startActivity(intent);
            }
        });


        binding.btnIrTareas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perfil.this, Tareas.class);
                startActivity(intent);
            }
        });
    }
}