package com.example.projectonewifi.domain.usecase;

import android.content.Context;

import com.example.projectonewifi.data.repository.HomeRepository;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public class InsertStateUseCase {

    public HomeRepository homeRepository = new HomeRepository();

    public ArrayList<StateModel> insertState(String idPublicacion, String idUser, String mensaje, Context context) {
       return homeRepository.insertState(idPublicacion, idUser, mensaje, context);
    }
}
