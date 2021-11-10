package com.example.projectthreefirebase.data.repository;

import com.example.projectthreefirebase.data.local.BDTestContact;
import com.example.projectthreefirebase.data.local.BDTestStates;
import com.example.projectthreefirebase.domain.model.ContactModel;
import com.example.projectthreefirebase.domain.model.StateModel;

import java.util.ArrayList;

public class HomeRepository {

    public BDTestStates bdTestStates = new BDTestStates();
    public BDTestContact bdTestContact = new BDTestContact();

    public ArrayList<StateModel> getStatesList() {
        return bdTestStates.getStateList();
    }

    public ArrayList<ContactModel> getListContacts(){
        return bdTestContact.getListContacts();
    }

    public ArrayList<StateModel> insertState(String idUser, String mensaje) {
        return bdTestStates.insertState(idUser, mensaje);
    }

    public ArrayList<ContactModel> insertContact(String idUser) {
        return bdTestContact.insertContact(idUser);
    }
}
