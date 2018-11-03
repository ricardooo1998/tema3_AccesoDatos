package com.quicktrade.ricardo.tema3;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityRegistrarProfesor extends AppCompatActivity {
    protected EditText nombre = (EditText) findViewById(R.id.nombreProfesor);
    protected String nombreProfesor = nombre.getText().toString();
    protected EditText edad = (EditText) findViewById(R.id.edadProfesor);
    protected int edadProfesor = Integer.parseInt(edad.getText().toString());
    protected EditText ciclo = (EditText) findViewById(R.id.cicloProfesor);
    protected String cicloProfesror = ciclo.getText().toString();
    protected EditText curso = (EditText) findViewById(R.id.cursoTutor);
    protected String cursoTutor = curso.getText().toString();
    protected EditText despacho = (EditText) findViewById(R.id.despachoProfesor);
    protected String despachoProfesor = despacho.getText().toString();
    protected Utilidades ul = new Utilidades();
    protected MyDBAdapter mdb = new MyDBAdapter(this, "bd_registrar.bd", null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_profesor);
        final Button cancelar = (Button) findViewById(R.id.buttonCancelar);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancelar = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(cancelar);
            }
        });

        final Button registrarProfesor = (Button) findViewById(R.id.buttonRegistrarProfesor);
        registrarProfesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=mdb.getWritableDatabase();
                ContentValues cv = new ContentValues();
                cv.put(ul.NOMBRE_PROFESOR, nombreProfesor);
                cv.put(ul.EDAD_PROFESOR, edadProfesor);
                cv.put(ul.CICLO_PROFESOR, cicloProfesror);
                cv.put(ul.CURSO_TUTOR, cursoTutor);
                cv.put(ul.DESPACHO_PROFESOR, despachoProfesor);


                long resultado = db.insert(ul.TABLA_ALUMNO, ul.NOMBRE_ALUMNO, cv);
                Toast.makeText(getApplicationContext(), "Se ha registrado: "+resultado, Toast.LENGTH_SHORT);
            }
        });
    }
}
