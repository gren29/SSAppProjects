package com.example.projectonewifi.domain.usecase;

import com.example.projectonewifi.data.repository.HomeRepository;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public class InsertStateUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> insertState(String idUser, String mensaje) {
       return homeRepository.insertState(idUser, mensaje);
    }
}
