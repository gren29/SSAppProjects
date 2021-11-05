package com.example.projecttwobluetoot.domain.usecase;

import com.example.projecttwobluetoot.data.repository.HomeRepository;
import com.example.projecttwobluetoot.domain.model.ContactModel;

import java.util.ArrayList;

public class InsertNewContactUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<ContactModel> insertContact(String idUser) {
        return homeRepository.insertContact(idUser);
    }
}
