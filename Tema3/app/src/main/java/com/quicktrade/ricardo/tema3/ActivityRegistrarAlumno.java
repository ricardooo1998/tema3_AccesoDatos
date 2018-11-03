package com.quicktrade.ricardo.tema3;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityRegistrarAlumno extends Activity {
    protected EditText nombre = (EditText) findViewById(R.id.nombreAlumno);
    protected String nombreAlumno = nombre.getText().toString();
    protected EditText edad = (EditText) findViewById(R.id.edadAlumno);
    protected int edadAlumno = Integer.parseInt(edad.getText().toString());
    protected EditText ciclo = (EditText) findViewById(R.id.cicloAlumno);
    protected String cicloAlumno = ciclo.getText().toString();
    protected EditText curso = (EditText) findViewById(R.id.cursoAlumno);
    protected String cursoAlumno = curso.getText().toString();
    protected EditText media = (EditText) findViewById(R.id.notaMediaAlumno);
    protected float mediaAlumno = Float.parseFloat(media.getText().toString());
    protected MyDBAdapter mdb = new MyDBAdapter(this, "bd_registrar.bd", null,1);
    protected Utilidades ul = new Utilidades();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_alumno);

        final Button cancelar = (Button) findViewById(R.id.buttonCancelar);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(c);
            }
        });

        final Button registrarAlumno = (Button) findViewById(R.id.buttonRegistrarAlumno);
        registrarAlumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=mdb.getWritableDatabase();
                ContentValues cv = new ContentValues();
                cv.put(ul.NOMBRE_ALUMNO, nombreAlumno);
                cv.put(ul.EDAD_ALUMNO, edadAlumno);
                cv.put(ul.CICLO_ALUMNO, cicloAlumno);
                cv.put(ul.CURSO_ALUMNO, cursoAlumno);
                cv.put(ul.MEDIA_ALUMNO, mediaAlumno);


                long resultado = db.insert(ul.TABLA_ALUMNO, ul.NOMBRE_ALUMNO, cv);
                Toast.makeText(getApplicationContext(), "Se ha registrado: "+resultado, Toast.LENGTH_SHORT);
            }
        });

        final Button consultarAlumnos = (Button) findViewById(R.id.consultarAlumno);
        consultarAlumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca =  new Intent(getApplicationContext(), ActivityConsultarAlumno.class);
                startActivity(ca);
            }
        });

    }
}
