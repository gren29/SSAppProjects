package com.example.projectthreefirebase.domain.usecase;

import com.example.projectthreefirebase.data.repository.UserRepository;

public class InsertDataUserUseCase {

    private UserRepository userRepository = new UserRepository();

    public boolean insertDataUser(String idUser, String name, String password, String email) {
        return userRepository.insertDataUser(idUser, name, password, email);
    }
}
