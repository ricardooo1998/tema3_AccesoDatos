package com.quicktrade.ricardo.tema3;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS="Mis Preferencias";
    protected MyDBAdapter mdb = new MyDBAdapter(this, "bd_registrar.bd", null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button guardar = (Button) findViewById(R.id.guardarPreferencias);
        final RadioButton hombre = (RadioButton) findViewById(R.id.hombre);
        final RadioButton mujer = (RadioButton) findViewById(R.id.mujer);
        final EditText nombre = (EditText) findViewById(R.id.nombre);
        final EditText nombreUsuario = (EditText) findViewById(R.id.nombreUsuario);
        final EditText fecha = (EditText) findViewById(R.id.fechaNacimiento);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String n = nombre.getText().toString();
                String nU = nombreUsuario.getText().toString();
                String f = fecha.getText().toString();
                String sexo;
                if (hombre.isChecked())
                {
                    sexo="Hombre";
                }
                else
                {
                    if (mujer.isChecked())
                    {
                        sexo="Mujer";
                    }
                    else
                    {
                        sexo="Error";
                    }
                }
                SharedPreferences misPreferencias = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = misPreferencias.edit();
                editor.putString("nombre", n);
                editor.putString("nombreUsuario", nU);
                editor.putString("fecha", f);
                editor.putString("sexo", sexo);
                editor.commit();
            }
        });

        final Button mostrar = (Button) findViewById(R.id.mostrarPreferencias);
        mostrar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                SharedPreferences misPreferencias = getSharedPreferences(PREFS, Activity.MODE_PRIVATE);
                String n = misPreferencias.getString("nombre","");
                String nU = misPreferencias.getString("nombreUsuario", "");
                String f = misPreferencias.getString("fecha", "");
                String s = misPreferencias.getString("sexo","");
                Toast mensaje = Toast.makeText(getApplicationContext(),"Nombre: "+n+", Nombre de Usuario: "+nU+", Fecha de Nacimiento: "+f+ ", Sexo: "+s, Toast.LENGTH_SHORT);
                mensaje.show();
            }
        });

        final Button registrarAlumno = (Button) findViewById(R.id.registrarAlumno);
        registrarAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ra = new Intent(getApplicationContext(), ActivityRegistrarAlumno.class);
                startActivity(ra);
            }
        });

        final Button registrarProfesor = (Button) findViewById(R.id.registrarProfesor);
        registrarProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rp = new Intent(getApplicationContext(), ActivityRegistrarProfesor.class);
                startActivity(rp);
            }
        });


    }
}
