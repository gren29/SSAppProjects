package com.example.projecttwobluetoot.presentation.presenter;

import android.content.Context;

public interface LoginInterface {
    boolean onClickLogin(String idUser, String password, Context context);
    boolean onClickSingUp();
}