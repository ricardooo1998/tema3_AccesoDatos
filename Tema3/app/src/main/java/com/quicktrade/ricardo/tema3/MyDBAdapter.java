package com.quicktrade.ricardo.tema3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBAdapter extends SQLiteOpenHelper {
    private Utilidades ul = new Utilidades();


    public MyDBAdapter(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ul.CREAR_TABLA_ALUMNO);
        db.execSQL(ul.CREAR_TABLA_PROFESOR);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ul.ELIMINAR_TABLA_ALUMNO);
        db.execSQL(ul.ELIMINAR_TABLA_PROFESOR);
        onCreate(db);


    }
}
