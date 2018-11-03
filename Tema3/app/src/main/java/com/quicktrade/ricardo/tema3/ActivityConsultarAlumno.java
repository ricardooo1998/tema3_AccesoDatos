package com.quicktrade.ricardo.tema3;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityConsultarAlumno extends AppCompatActivity {
    protected MyDBAdapter mydb = new MyDBAdapter(getApplicationContext(), "bd_registrar.bd", null,1);
    Utilidades ul = new Utilidades();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_alumno);
        final Button mostrarTodos = (Button) findViewById(R.id.buscarTodos);
        mostrarTodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = mydb.getWritableDatabase();


            }
        });
    }
}
