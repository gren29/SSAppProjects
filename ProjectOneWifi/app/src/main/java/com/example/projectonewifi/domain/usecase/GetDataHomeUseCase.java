package com.example.projectonewifi.domain.usecase;

import com.example.projectonewifi.data.repository.HomeRepository;
import com.example.projectonewifi.domain.model.ContactModel;
import com.example.projectonewifi.domain.model.StateModel;

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
