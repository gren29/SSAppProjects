package com.example.projecttwobluetoot.data.repository;

import com.example.projecttwobluetoot.data.local.BDTestUsers;

public class UserRepository {

    public BDTestUsers bdTestUsers = new BDTestUsers();

    public boolean getIdUser(String idUser){
        return bdTestUsers.getUser(idUser);
    }

    public boolean getPassword(String password){
        return bdTestUsers.getPassword(password);
    }

    public boolean insertDataUser(String idUser, String name, String password, String email) {
        bdTestUsers.insertUser(idUser, name, password, email);
        return true;
    }
}
