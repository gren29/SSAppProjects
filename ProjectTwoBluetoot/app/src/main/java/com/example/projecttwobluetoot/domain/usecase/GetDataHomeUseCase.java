package com.example.projecttwobluetoot.domain.usecase;

import android.content.Context;

import com.example.projecttwobluetoot.data.repository.HomeRepository;
import com.example.projecttwobluetoot.domain.model.ContactModel;
import com.example.projecttwobluetoot.domain.model.StateModel;

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

