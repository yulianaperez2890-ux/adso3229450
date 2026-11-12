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

import com.example.planify_day.databinding.ActivityTareasBinding;

public class Tareas extends AppCompatActivity {
    private ActivityTareasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTareasBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnFiltroPendientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Tareas.this, "Mostrando tareas pendientes", Toast.LENGTH_SHORT).show();
            }
        });


        binding.btnFiltroCompletadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Tareas.this, "Mostrando tareas completadas", Toast.LENGTH_SHORT).show();
            }
        });


        binding.btnAgregarTarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tarea = binding.edtNuevaTarea.getText().toString();

                if (tarea.isEmpty()) {
                    Toast.makeText(Tareas.this, "Escribe una tarea primero", Toast.LENGTH_SHORT).show();
                } else {
                    String listaActual = binding.txtNuevaTareaAgregada.getText().toString();
                    binding.txtNuevaTareaAgregada.setText(listaActual + "• " + tarea + " (Prioridad: Normal)\n");
                    binding.edtNuevaTarea.setText("");
                    Toast.makeText(Tareas.this, "Tarea agregada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnIrAsistente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tareas.this, Asistente.class);
                startActivity(intent);
            }
        });
        binding.btnIrPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tareas.this, Perfil.class);
                startActivity(intent);
            }
        });

    }
}