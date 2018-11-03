package com.quicktrade.ricardo.tema3;

public class Profesor {
    private String NOMBRE_PROFESOR;
    private String EDAD_PROFESOR;
    private String CICLO_PROFESOR;
    private String CURSO_TUTOR;
    private String DESPACHO_PROFESOR;

    public Profesor(String NOMBRE_PROFESOR, String EDAD_PROFESOR, String CICLO_PROFESOR, String CURSO_TUTOR, String DESPACHO_PROFESOR) {
        this.NOMBRE_PROFESOR = NOMBRE_PROFESOR;
        this.EDAD_PROFESOR = EDAD_PROFESOR;
        this.CICLO_PROFESOR = CICLO_PROFESOR;
        this.CURSO_TUTOR = CURSO_TUTOR;
        this.DESPACHO_PROFESOR = DESPACHO_PROFESOR;
    }

    public String getNOMBRE_PROFESOR() {
        return NOMBRE_PROFESOR;
    }

    public void setNOMBRE_PROFESOR(String NOMBRE_PROFESOR) {
        this.NOMBRE_PROFESOR = NOMBRE_PROFESOR;
    }

    public String getEDAD_PROFESOR() {
        return EDAD_PROFESOR;
    }

    public void setEDAD_PROFESOR(String EDAD_PROFESOR) {
        this.EDAD_PROFESOR = EDAD_PROFESOR;
    }

    public String getCICLO_PROFESOR() {
        return CICLO_PROFESOR;
    }

    public void setCICLO_PROFESOR(String CICLO_PROFESOR) {
        this.CICLO_PROFESOR = CICLO_PROFESOR;
    }

    public String getCURSO_TUTOR() {
        return CURSO_TUTOR;
    }

    public void setCURSO_TUTOR(String CURSO_TUTOR) {
        this.CURSO_TUTOR = CURSO_TUTOR;
    }

    public String getDESPACHO_PROFESOR() {
        return DESPACHO_PROFESOR;
    }

    public void setDESPACHO_PROFESOR(String DESPACHO_PROFESOR) {
        this.DESPACHO_PROFESOR = DESPACHO_PROFESOR;
    }
}
