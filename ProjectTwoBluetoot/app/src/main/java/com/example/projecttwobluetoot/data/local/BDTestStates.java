package com.example.projecttwobluetoot.data.local;

import com.example.projecttwobluetoot.R;
import com.example.projecttwobluetoot.domain.model.StateModel;

import java.util.ArrayList;

public class BDTestStates {

    public ArrayList<StateModel> listStatesRepo = new ArrayList<StateModel>();

    public BDTestStates() {
        listStatesRepo.add(new StateModel("12345","idUser","Mensaje de prueba", R.drawable.ic_baseline_notifications_24_white));
        listStatesRepo.add(new StateModel("12345","idUser","Mensaje de prueba",R.drawable.ic_baseline_notifications_24_white));
        listStatesRepo.add(new StateModel("12345","idUser","Mensaje de prueba",R.drawable.ic_baseline_notifications_24_white));
    }

    public ArrayList<StateModel> getStateList() {
        return listStatesRepo;
    }

    public ArrayList<StateModel> insertState(String idUser, String mensaje) {
        listStatesRepo.add(new StateModel("12345",idUser,mensaje,R.drawable.ic_baseline_notifications_24_white));
        return  listStatesRepo;
    }
}
