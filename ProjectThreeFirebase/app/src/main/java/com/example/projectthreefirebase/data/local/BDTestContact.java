package com.example.projectthreefirebase.data.local;

import com.example.projectthreefirebase.R;
import com.example.projectthreefirebase.domain.model.ContactModel;

import java.util.ArrayList;

public class BDTestContact {

    public ArrayList<ContactModel> listContacts = new ArrayList<>();

    public BDTestContact() {
        listContacts.add(new ContactModel("345","678","1223", R.drawable.ic_baseline_person_24_t));
        listContacts.add(new ContactModel("111","111","1223",R.drawable.ic_baseline_person_24_t));
        listContacts.add(new ContactModel("111","111","1223",R.drawable.ic_baseline_person_24_t));
        listContacts.add(new ContactModel("111","111","1223",R.drawable.ic_baseline_person_24_t));
    }

    public ArrayList<ContactModel> getListContacts(){
        return listContacts;
    }

    public ArrayList<ContactModel> insertContact(String idUser) {
        listContacts.add(new ContactModel("111",idUser,"idUser",R.drawable.ic_baseline_person_24_t));
        return listContacts;
    }
}
