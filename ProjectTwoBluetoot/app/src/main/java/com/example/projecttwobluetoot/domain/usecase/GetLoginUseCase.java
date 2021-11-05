package com.example.projecttwobluetoot.domain.usecase;

import com.example.projecttwobluetoot.data.repository.UserRepository;

public class GetLoginUseCase {

    private UserRepository userRepository = new UserRepository();

    public boolean getIdUser(String idUser) {
        return userRepository.getIdUser(idUser);
    }

    public boolean getPassword(String password) {
        return userRepository.getPassword(password);
    }
}
