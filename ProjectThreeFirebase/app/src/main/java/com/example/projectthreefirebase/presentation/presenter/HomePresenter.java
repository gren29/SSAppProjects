package com.example.projectthreefirebase.presentation.presenter;

import com.example.projectthreefirebase.domain.model.ContactModel;
import com.example.projectthreefirebase.domain.model.StateModel;
import com.example.projectthreefirebase.domain.usecase.GetDataHomeUseCase;
import com.example.projectthreefirebase.domain.usecase.InsertNewContactUseCase;
import com.example.projectthreefirebase.domain.usecase.InsertStateUseCase;

import java.util.ArrayList;

public class HomePresenter implements HomeInterface {

    private GetDataHomeUseCase getDataHomeUseCase = new GetDataHomeUseCase();
    private InsertStateUseCase insertStateUseCase = new InsertStateUseCase();
    private InsertNewContactUseCase insertNewContactUseCase = new InsertNewContactUseCase();

    @Override
    public ArrayList<StateModel> onClickSendState(String idUser, String mensaje) {
        return insertStateUseCase.insertState(idUser, mensaje);
    }

    @Override
    public ArrayList<ContactModel> onClickAddContact(String idUser) {
        return insertNewContactUseCase.insertContact(idUser);
    }

    @Override
    public boolean onClickExitHome(Boolean option) {
        return option;
    }

    @Override
    public ArrayList<StateModel> getStates() {
        return getDataHomeUseCase.getStatesList();
    }

    @Override
    public ArrayList<ContactModel> checkContacts() {
        return getDataHomeUseCase.getListContacts();
    }
}

