package com.example.projecttwobluetoot.domain.usecase;

import com.example.projecttwobluetoot.data.repository.HomeRepository;
import com.example.projecttwobluetoot.domain.model.StateModel;

import java.util.ArrayList;

public class InsertStateUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> insertState(String idUser, String mensaje) {
        return homeRepository.insertState(idUser, mensaje);
    }
}
