package com.example.projectonewifi.presentation.presenter;

import android.content.Context;

import com.example.projectonewifi.domain.usecase.InsertDataUserUseCase;

public class RegisterPresenter implements  RegisterInterface {

    private InsertDataUserUseCase insertDataUserUseCase = new InsertDataUserUseCase();

    @Override
    public boolean insertDataUser(String idUser, String name, String password, String email, Context context) {
        if(idUser.isEmpty() || name.isEmpty() || password.isEmpty() || email.isEmpty()) return false;
        if(insertDataUserUseCase.insertDataUser(idUser, name, password, email, context)) return true;
        return false;
    }
}
