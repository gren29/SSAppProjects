package com.example.projecttwobluetoot.presentation.presenter;

import com.example.projecttwobluetoot.domain.usecase.GetLoginUseCase;

public class LoginPresenter implements LoginInterface{

    private GetLoginUseCase getLoginUseCase = new GetLoginUseCase();

    @Override
    public boolean onClickLogin(String idUser, String password) {
        if(idUser.isEmpty() || password.isEmpty()) return false;
        if(getLoginUseCase.getIdUser(idUser) && getLoginUseCase.getPassword(password)) return true;
        return false;
    }

    @Override
    public boolean onClickSingUp() {
        return true;
    }
}
