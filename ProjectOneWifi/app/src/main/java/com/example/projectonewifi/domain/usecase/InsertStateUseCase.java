package com.example.projectonewifi.domain.usecase;

import com.example.projectonewifi.data.repository.HomeRepository;

public class InsertStateUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public void insertState(String idUser, String mensaje) {
        homeRepository.insertState(idUser, mensaje);
    }
}
