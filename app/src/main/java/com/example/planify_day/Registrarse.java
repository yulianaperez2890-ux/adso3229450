package com.example.planify_day;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.planify_day.databinding.ActivityRegistrarseBinding;

public class Registrarse extends AppCompatActivity {

    // paso 1 declaro la variable binding
    private ActivityRegistrarseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // paso 2 asigno
        binding = ActivityRegistrarseBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        // BOTON REGISTRARSE
        binding.btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  obtengo los datos de los campos
                String nombre = binding.edtNombre.getText().toString().trim();
                String correo = binding.edtCorreo.getText().toString().trim();
                String usuario = binding.edtUsuario.getText().toString().trim();
                String contrasena = binding.edtContrasena.getText().toString().trim();
                String confirmarContrasena = binding.edtConfirmarContrasena.getText().toString().trim();

                //  verifico que los campos no esten vacios
                if (nombre.isEmpty() || correo.isEmpty() || usuario.isEmpty()
                        || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {

                    Toast.makeText(Registrarse.this, "Complete todos los campos", Toast.LENGTH_SHORT).show();

                } else if (!contrasena.equals(confirmarContrasena)) {

                    //  verifico que las contrasenas sean iguales
                    Toast.makeText(Registrarse.this, "Las contrasenas no coinciden", Toast.LENGTH_SHORT).show();

                } else {

                    //  guardo los datos del usuario
                    SharedPreferences guardarDatos = getSharedPreferences("DatosUsuario", MODE_PRIVATE);

                    SharedPreferences.Editor editor = guardarDatos.edit();

                    editor.putString("nombre", nombre);
                    editor.putString("correo", correo);
                    editor.putString("usuario", usuario);
                    editor.putString("contrasena", contrasena);

                    editor.apply();

                    //  confirmo el registro
                    Toast.makeText(Registrarse.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

                    //  envio al usuario al inicio de sesion
                    Intent irSiguiente = new Intent(Registrarse.this, Inicio_sesion.class);
                    startActivity(irSiguiente);

                }

            }
        });

        // TEXTO INICIAR SESION
        binding.txtIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irSiguiente = new Intent(Registrarse.this, Inicio_sesion.class);
                startActivity(irSiguiente);

            }
        });

    }
}
