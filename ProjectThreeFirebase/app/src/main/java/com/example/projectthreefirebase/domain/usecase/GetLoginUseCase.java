package com.example.projectthreefirebase.domain.usecase;

import com.example.projectthreefirebase.data.repository.UserRepository;

public class GetLoginUseCase {

    private UserRepository userRepository = new UserRepository();

    public boolean getIdUser(String idUser) {
        return userRepository.getIdUser(idUser);
    }

    public boolean getPassword(String password) {
        return userRepository.getPassword(password);
    }
}