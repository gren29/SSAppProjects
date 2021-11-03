package com.example.projectonewifi.data.local;

import com.example.projectonewifi.domain.model.UserModel;

import java.util.ArrayList;

public class BDTestUsers {

    public ArrayList<UserModel> listUser = new ArrayList<UserModel>();

    public BDTestUsers() {
        listUser.add(new UserModel("x","nombre","y","r@email.com"));
    }

    public boolean insertUser(String idUser, String name, String password, String email) {
        listUser.add(new UserModel(idUser, name, password, email));
        return true;
    }

    public  boolean getUser(String idUser) {
        for (int i = 0; i < listUser.size(); i++){
            if (listUser.get(i).getIdUsuario().equals(idUser))return true;
        }
        return false;
    }

    public boolean getPassword(String password) {
        for( int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i).getPassword().equals(password))return true;
        }
        return false;
    }
}
