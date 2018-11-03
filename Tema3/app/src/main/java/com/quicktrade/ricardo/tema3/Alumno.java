package com.quicktrade.ricardo.tema3;

public class Alumno {
    private String NOMBRE_ALUMNO;
    private String EDAD_ALUMNO;
    private String CICLO_ALUMNO;
    private String CURSO_ALUMNO;
    private String MEDIA_ALUMNO;


    public Alumno(String NOMBRE_ALUMNO, String EDAD_ALUMNO, String CICLO_ALUMNO, String CURSO_ALUMNO, String MEDIA_ALUMNO) {
        this.NOMBRE_ALUMNO = NOMBRE_ALUMNO;
        this.EDAD_ALUMNO = EDAD_ALUMNO;
        this.CICLO_ALUMNO = CICLO_ALUMNO;
        this.CURSO_ALUMNO = CURSO_ALUMNO;
        this.MEDIA_ALUMNO = MEDIA_ALUMNO;
    }

    public String getNOMBRE_ALUMNO() {
        return NOMBRE_ALUMNO;
    }

    public void setNOMBRE_ALUMNO(String NOMBRE_ALUMNO) {
        this.NOMBRE_ALUMNO = NOMBRE_ALUMNO;
    }

    public String getEDAD_ALUMNO() {
        return EDAD_ALUMNO;
    }

    public void setEDAD_ALUMNO(String EDAD_ALUMNO) {
        this.EDAD_ALUMNO = EDAD_ALUMNO;
    }

    public String getCICLO_ALUMNO() {
        return CICLO_ALUMNO;
    }

    public void setCICLO_ALUMNO(String CICLO_ALUMNO) {
        this.CICLO_ALUMNO = CICLO_ALUMNO;
    }

    public String getCURSO_ALUMNO() {
        return CURSO_ALUMNO;
    }

    public void setCURSO_ALUMNO(String CURSO_ALUMNO) {
        this.CURSO_ALUMNO = CURSO_ALUMNO;
    }

    public String getMEDIA_ALUMNO() {
        return MEDIA_ALUMNO;
    }

    public void setMEDIA_ALUMNO(String MEDIA_ALUMNO) {
        this.MEDIA_ALUMNO = MEDIA_ALUMNO;
    }
}
