package com.example.projecttwobluetoot.domain.usecase;

import android.content.Context;

import com.example.projecttwobluetoot.data.repository.HomeRepository;
import com.example.projecttwobluetoot.domain.model.StateModel;

import java.util.ArrayList;

public class InsertStateUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> insertState(String idPublicacion, String idUser, String mensaje, Context context) {
        return homeRepository.insertState(idPublicacion, idUser, mensaje, context);
    }
}
