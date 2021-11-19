package com.example.projectonewifi.presentation.presenter;

import android.content.Context;

public interface RegisterInterface {
    boolean insertDataUser(String idUser, String name, String password, String email, Context context);
}
