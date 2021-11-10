package com.example.projectthreefirebase.presentation.presenter;

import com.example.projectthreefirebase.domain.model.ContactModel;
import com.example.projectthreefirebase.domain.model.StateModel;

import java.util.ArrayList;

public interface HomeInterface {
    ArrayList<StateModel> onClickSendState(String idUser, String mensaje);
    ArrayList<ContactModel> onClickAddContact(String idUser);
    boolean onClickExitHome(Boolean option);
    ArrayList<StateModel> getStates();
    ArrayList<ContactModel> checkContacts();
}
