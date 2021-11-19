package com.example.projectonewifi.data.repository;

import android.content.Context;

import com.example.projectonewifi.data.local.BDTestUsers;
import com.example.projectonewifi.data.local.DBUsers;

public class UserRepository {

    public BDTestUsers bdTestUsers = new BDTestUsers();
    public DBUsers dbUsers = new DBUsers();

    public boolean getIdUser(String idUser,String password, Context context){
        return dbUsers.getUser(idUser, password, context);
    }

    public boolean insertDataUser(String idUser, String name, String password, String email, Context context) {
        dbUsers.insertUser(idUser, name, password, email, context);
        return true;
    }
}
