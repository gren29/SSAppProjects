package com.example.projectonewifi.data.repository;

import com.example.projectonewifi.R;
import com.example.projectonewifi.domain.model.ContactModel;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public class HomeRepository {

    public ArrayList<StateModel> listStates = new ArrayList<>();
    public ArrayList<ContactModel> listContacts = new ArrayList<>();

     public ArrayList<StateModel> getStatesList() {
         listStates.add(new StateModel("1234","userid","Mensaje de pruba para saber como se ve el mismo mensaje en el caudro de texto", R.drawable.ic_baseline_notifications_24_white));
         listStates.add(new StateModel("1234","userid","Mensaje de pruba para saber como se ve el mismo mensaje en el caudro de texto", R.drawable.ic_baseline_notifications_24_white));
         listStates.add(new StateModel("1234","userid","Mensaje de pruba para saber como se ve el mismo mensaje en el caudro de texto", R.drawable.ic_baseline_notifications_24_white));
         listStates.add(new StateModel("1234","userid","Mensaje de pruba para saber como se ve el mismo mensaje en el caudro de texto", R.drawable.ic_baseline_notifications_24_white));
         listStates.add(new StateModel("1234","userid","Mensaje de pruba para saber como se ve el mismo mensaje en el caudro de texto", R.drawable.ic_baseline_notifications_24_white));
         listStates.add(new StateModel("1234","userid","Mensaje de pruba para saber como se ve el mismo mensaje en el caudro de texto", R.drawable.ic_baseline_notifications_24_white));
         return listStates;
     }

    public ArrayList<ContactModel> getListContacts(){
        listContacts.add(new ContactModel("11ertertwertwrtrtwerte1","11ewrtwertwertert1","1223",R.drawable.ic_baseline_person_24_t));
        listContacts.add(new ContactModel("111","111","1223",R.drawable.ic_baseline_person_24_t));
        listContacts.add(new ContactModel("111","111","1223",R.drawable.ic_baseline_person_24_t));
        listContacts.add(new ContactModel("111","111","1223",R.drawable.ic_baseline_person_24_t));
        return listContacts;
    }

    //get user data

    public void insertState(String idUser, String mensaje) {

    }

    public void insertContact(String idUser) {
    }
}
