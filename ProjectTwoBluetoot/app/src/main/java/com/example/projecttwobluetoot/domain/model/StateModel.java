package com.example.projecttwobluetoot.domain.model;

public class StateModel {

    private String idPulibcacion;
    private String idUser;
    private String mensaje;
    private int imageUser;

    public StateModel() {

    }

    public StateModel(String idPulibcacion, String idUser, String mensaje, int imageUser) {
        this.idPulibcacion = idPulibcacion;
        this.idUser = idUser;
        this.mensaje = mensaje;
        this.imageUser = imageUser;
    }

    public String getIdPulibcacion() {
        return idPulibcacion;
    }

    public void setIdPulibcacion(String idPulibcacion) {
        this.idPulibcacion = idPulibcacion;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int imageUser) {
        this.imageUser = imageUser;
    }
}