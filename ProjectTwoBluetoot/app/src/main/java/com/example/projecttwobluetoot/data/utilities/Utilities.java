package com.example.projecttwobluetoot.data.utilities;

public class Utilities {

    public static final String TABLE_STATES = "states";
    public static final String CAMPO_IDPULIBICACION = "idpublicacion";
    public static final String CAMPO_IDUSER = "iduser";
    public static final String CAMPO_MENSAJE = "mensaje";
    public static final String CREATE_TABLE_STATES = "CREATE TABLE "+TABLE_STATES+" ("+CAMPO_IDPULIBICACION+" TEXT, "+CAMPO_IDUSER+" TEXT, "+CAMPO_MENSAJE+" TEXT)";

    public static final String TABLE_CONTACTS = "contacts";
    public static final String CAMPO_IDCONTACTO = "idcontacto";
    public static final String CAMPO_IDUSERCONTACT = "iduser";
    public static final String CAMPO_NAME_CONTACT = "namecontact";
    public static final String CREATE_TABLE_CONTACTS = "CREATE TABLE "+TABLE_CONTACTS+" ("+CAMPO_IDCONTACTO+" TEXT, "+CAMPO_IDUSERCONTACT+" TEXT)";

    public static final String TABLE_USERS = "users";
    public static final String CAMPO_IDUSERUSER = "iduserusers";
    public static final String CAMPO_NAMEUSER = "nameuser";
    public static final String CAMPO_PASSWORDUSER = "passworduser";
    public static final String CAMPO_EMAILUSER = "emailuser";
    public static final String CREATE_TABLE_USERS = "CREATE TABLE "+TABLE_USERS+" ("+CAMPO_IDUSERUSER+" TEXT, "+CAMPO_NAMEUSER+" TEXT, "+CAMPO_PASSWORDUSER+" TEXT, "+CAMPO_EMAILUSER+" TEXT)";
}

