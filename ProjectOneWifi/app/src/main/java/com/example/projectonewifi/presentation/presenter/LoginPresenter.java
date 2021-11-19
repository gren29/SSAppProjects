package com.example.projectonewifi.presentation.presenter;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.projectonewifi.domain.usecase.GetLoginUseCase;

public class LoginPresenter implements LoginInterface{

    private GetLoginUseCase getLoginUseCase = new GetLoginUseCase();

    @Override
    public boolean onClickLogin(String idUser, String password, Context context) {
        if(idUser.isEmpty() || password.isEmpty()) return false;
        if(getLoginUseCase.getIdUser(idUser, password, context)) return true;
        return false;
    }

    @Override
    public boolean onClickSingUp() {
        return true;
    }
}
