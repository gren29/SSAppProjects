package com.example.projectthreefirebase.domain.usecase;

import com.example.projectthreefirebase.data.repository.HomeRepository;
import com.example.projectthreefirebase.domain.model.ContactModel;
import com.example.projectthreefirebase.domain.model.StateModel;

import java.util.ArrayList;

public class GetDataHomeUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> getStatesList() {
        return  homeRepository.getStatesList();
    }

    public ArrayList<ContactModel> getListContacts(){
        return homeRepository.getListContacts();
    }
}
