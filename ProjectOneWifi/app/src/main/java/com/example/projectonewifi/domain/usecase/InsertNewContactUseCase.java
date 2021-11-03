package com.example.projectonewifi.domain.usecase;

import com.example.projectonewifi.data.repository.HomeRepository;
import com.example.projectonewifi.domain.model.ContactModel;

import java.util.ArrayList;

public class InsertNewContactUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<ContactModel> insertContact(String idUser) {
        return homeRepository.insertContact(idUser);
    }
}
