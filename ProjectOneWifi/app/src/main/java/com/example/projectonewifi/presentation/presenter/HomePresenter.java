package com.example.projectonewifi.presentation.presenter;

import com.example.projectonewifi.domain.model.ContactModel;
import com.example.projectonewifi.domain.model.StateModel;
import com.example.projectonewifi.domain.usecase.GetDataHomeUseCase;
import com.example.projectonewifi.domain.usecase.InsertNewContactUseCase;
import com.example.projectonewifi.domain.usecase.InsertStateUseCase;

import java.util.ArrayList;

public class HomePresenter implements HomeInterface {

    private GetDataHomeUseCase getDataHomeUseCase = new GetDataHomeUseCase();
    private InsertStateUseCase insertStateUseCase = new InsertStateUseCase();
    private InsertNewContactUseCase insertNewContactUseCase = new InsertNewContactUseCase();

    @Override
    public void onClickSendState(String idUser, String mensaje) {
        insertStateUseCase.insertState(idUser, mensaje);
    }

    @Override
    public void onClickAddContact(String idUser) {
        insertNewContactUseCase.insertContact(idUser);
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
