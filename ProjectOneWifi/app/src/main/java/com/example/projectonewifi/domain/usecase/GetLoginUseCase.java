package com.example.projectonewifi.domain.usecase;

import android.content.Context;

import com.example.projectonewifi.data.repository.UserRepository;

public class GetLoginUseCase {

    private UserRepository userRepository = new UserRepository();

    public boolean getIdUser(String idUser, String password, Context context) {
       return userRepository.getIdUser(idUser, password, context);
    }

}
