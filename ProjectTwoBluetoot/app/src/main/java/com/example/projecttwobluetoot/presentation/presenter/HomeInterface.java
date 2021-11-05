package com.example.projecttwobluetoot.presentation.presenter;

import com.example.projecttwobluetoot.domain.model.ContactModel;
import com.example.projecttwobluetoot.domain.model.StateModel;

import java.util.ArrayList;

public interface HomeInterface {
    ArrayList<StateModel> onClickSendState(String idUser, String mensaje);
    ArrayList<ContactModel> onClickAddContact(String idUser);
    boolean onClickExitHome(Boolean option);
    ArrayList<StateModel> getStates();
    ArrayList<ContactModel> checkContacts();
}
