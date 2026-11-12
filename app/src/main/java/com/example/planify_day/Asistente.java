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

import com.example.planify_day.databinding.ActivityAsistenteBinding;

public class Asistente extends AppCompatActivity {
    private ActivityAsistenteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAsistenteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensajeUsuario = binding.edtMensaje.getText().toString();
                if (mensajeUsuario.isEmpty()){
                    Toast.makeText(Asistente.this, "Escribe un mensaje primero", Toast.LENGTH_SHORT).show();
                } else {
                    String chatActual = binding.txtHistorialChat.getText().toString();
                    String nuevoTexto = chatActual + "\nTú: " + mensajeUsuario + "\n\nIA: ¡Listo! Te sugiero dedicar de 8:00 AM a 10:00 AM a esa actividad para aprovechar tu mañana.\\n";

                    binding.txtHistorialChat.setText(nuevoTexto);
                    binding.edtMensaje.setText("");
                }
            }
        });
        binding.btnIrTareas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Asistente.this, Tareas.class);
                startActivity(intent);
            }
        });

        binding.btnIrPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Asistente.this, Perfil.class);
                startActivity(intent);
            }
        });
    }
}