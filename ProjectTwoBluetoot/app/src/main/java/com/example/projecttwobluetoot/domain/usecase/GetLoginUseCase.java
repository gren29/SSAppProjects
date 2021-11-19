package com.example.projecttwobluetoot.domain.usecase;

import android.content.Context;

import com.example.projecttwobluetoot.data.repository.UserRepository;

public class GetLoginUseCase {

    private UserRepository userRepository = new UserRepository();

    public boolean getIdUser(String idUser, String password, Context context) {
        return userRepository.getIdUser(idUser, password, context);
    }
}
