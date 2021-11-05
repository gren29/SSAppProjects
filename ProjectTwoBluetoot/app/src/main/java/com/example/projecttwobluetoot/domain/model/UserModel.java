package com.example.projecttwobluetoot.domain.model;

public class UserModel {

    private String idUsuario;
    private String name;
    private String password;
    private String email;

    public UserModel(){

    }

    public UserModel(String idUsuario, String name, String password, String email) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
