package com.example.projectonewifi.domain.model;

public class ContactModel {

    private String idContacto;
    private String idUser;
    private String nameContact;
    private int imageUser;

    public ContactModel(){

    }

    public ContactModel(String idContacto, String idUser, String nameContact, int imageUser) {
        this.idContacto = idContacto;
        this.idUser = idUser;
        this.nameContact = nameContact;
        this.imageUser = imageUser;
    }

    public String getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(String idContacto) {
        this.idContacto = idContacto;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int imageUser) {
        this.imageUser = imageUser;
    }
}
