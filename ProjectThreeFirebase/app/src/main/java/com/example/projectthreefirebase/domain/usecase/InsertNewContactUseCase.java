package com.example.projectthreefirebase.domain.usecase;

import com.example.projectthreefirebase.data.repository.HomeRepository;
import com.example.projectthreefirebase.domain.model.ContactModel;

import java.util.ArrayList;

public class InsertNewContactUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<ContactModel> insertContact(String idUser) {
        return homeRepository.insertContact(idUser);
    }
}
