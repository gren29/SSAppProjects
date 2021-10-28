package com.example.projectonewifi.presentation.presenter;

import com.example.projectonewifi.domain.model.ContactModel;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public interface HomeInterface {
    void onClickSendState(String idUser, String mensaje);
    void onClickAddContact(String idUser);
    boolean onClickExitHome(Boolean option);
    ArrayList<StateModel> getStates();
    ArrayList<ContactModel> checkContacts();
}
