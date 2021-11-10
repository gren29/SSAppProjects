package com.example.projectthreefirebase.domain.usecase;

import com.example.projectthreefirebase.data.repository.HomeRepository;
import com.example.projectthreefirebase.domain.model.StateModel;

import java.util.ArrayList;

public class InsertStateUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> insertState(String idUser, String mensaje) {
        return homeRepository.insertState(idUser, mensaje);
    }
}
