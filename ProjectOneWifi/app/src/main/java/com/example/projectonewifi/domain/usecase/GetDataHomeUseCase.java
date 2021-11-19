package com.example.projectonewifi.domain.usecase;

import android.content.Context;

import com.example.projectonewifi.data.repository.HomeRepository;
import com.example.projectonewifi.domain.model.ContactModel;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public class GetDataHomeUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> getStatesList(Context context) {
        return  homeRepository.getStatesList(context);
    }

    public ArrayList<ContactModel> getListContacts(Context context){
       return homeRepository.getListContacts(context);
    }
}
