package com.example.projecttwobluetoot.domain.usecase;

import com.example.projecttwobluetoot.data.repository.HomeRepository;
import com.example.projecttwobluetoot.domain.model.ContactModel;
import com.example.projecttwobluetoot.domain.model.StateModel;

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

