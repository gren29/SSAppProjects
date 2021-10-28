package com.example.projectonewifi.domain.usecase;

import com.example.projectonewifi.data.repository.HomeRepository;

public class InsertNewContactUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public void insertContact(String idUser) {
        homeRepository.insertContact(idUser);
    }
}
