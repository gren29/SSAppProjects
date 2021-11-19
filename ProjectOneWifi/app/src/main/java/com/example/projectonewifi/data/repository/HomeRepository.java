package com.example.projectonewifi.data.repository;

import android.content.Context;

import com.example.projectonewifi.data.local.BDTestContact;
import com.example.projectonewifi.data.local.BDTestStates;
import com.example.projectonewifi.data.local.DBContact;
import com.example.projectonewifi.data.local.DBStates;
import com.example.projectonewifi.domain.model.ContactModel;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public class HomeRepository {

    public BDTestStates bdTestStates = new BDTestStates();
    public BDTestContact bdTestContact = new BDTestContact();

    public DBStates bdStates = new DBStates();
    public DBContact dbContact = new DBContact();

     public ArrayList<StateModel> getStatesList(Context context) {
         return bdStates.getStateList(context);
     }

    public ArrayList<ContactModel> getListContacts(Context context){
         return dbContact.getListContacts(context);
    }

    public ArrayList<StateModel> insertState(String idPublicacion, String idUser, String mensaje, Context context) {
        return bdStates.insertState(idPublicacion,idUser, mensaje,context);
    }

    public ArrayList<ContactModel> insertContact(String idPublicacion, String idUser, Context context) {
         return dbContact.insertContact(idPublicacion, idUser, context);
    }
}
