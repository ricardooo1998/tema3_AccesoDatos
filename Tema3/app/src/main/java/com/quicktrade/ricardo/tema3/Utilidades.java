package com.quicktrade.ricardo.tema3;

public class Utilidades {
    protected final String TABLA_ALUMNO = "alumno";
    protected final String NOMBRE_ALUMNO = "nombre";
    protected final String EDAD_ALUMNO = "edad";
    protected final String CICLO_ALUMNO = "ciclo";
    protected final String CURSO_ALUMNO = "curso";
    protected final String MEDIA_ALUMNO = "media";


    protected final String TABLA_PROFESOR = "profesor";
    protected final String NOMBRE_PROFESOR = "nombre";
    protected final String EDAD_PROFESOR = "edad";
    protected final String CICLO_PROFESOR = "ciclo";
    protected final String CURSO_TUTOR = "curso_tutor";
    protected final String DESPACHO_PROFESOR = "despacho";

    protected final String CREAR_TABLA_ALUMNO = "CREATE TABLE" +TABLA_ALUMNO+ "("+NOMBRE_ALUMNO+" TEXT, "+EDAD_ALUMNO+" INTEGER, "+CICLO_ALUMNO+" TEXT, "+CURSO_ALUMNO+" TEXT, "+MEDIA_ALUMNO+" FLOAT)";
    protected final String CREAR_TABLA_PROFESOR = "CREATE TABLE" +TABLA_PROFESOR+ "("+NOMBRE_PROFESOR+" TEXT, "+EDAD_PROFESOR+" INTEGER, "+CICLO_PROFESOR+" TEXT, "+CURSO_TUTOR+" TEXT, "+DESPACHO_PROFESOR+" TEXT)";
    final String ELIMINAR_TABLA_ALUMNO = "DROP TABLE IF EXISTS "+CREAR_TABLA_ALUMNO+";";
    final String ELIMINAR_TABLA_PROFESOR = "DROP TABLE IF EXISTS "+CREAR_TABLA_PROFESOR+";";


}
