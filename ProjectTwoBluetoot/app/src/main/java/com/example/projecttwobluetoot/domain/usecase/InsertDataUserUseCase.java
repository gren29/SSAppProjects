package com.example.projecttwobluetoot.domain.usecase;

import android.content.Context;

import com.example.projecttwobluetoot.data.repository.UserRepository;

public class InsertDataUserUseCase {

    private UserRepository userRepository = new UserRepository();

    public boolean insertDataUser(String idUser, String name, String password, String email, Context context) {
        return userRepository.insertDataUser(idUser, name, password, email, context);
    }
}
