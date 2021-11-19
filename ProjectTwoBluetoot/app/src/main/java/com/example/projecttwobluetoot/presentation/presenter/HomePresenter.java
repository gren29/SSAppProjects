package com.example.projecttwobluetoot.presentation.presenter;

import android.content.Context;

import com.example.projecttwobluetoot.domain.model.ContactModel;
import com.example.projecttwobluetoot.domain.model.StateModel;
import com.example.projecttwobluetoot.domain.usecase.GetDataHomeUseCase;
import com.example.projecttwobluetoot.domain.usecase.InsertNewContactUseCase;
import com.example.projecttwobluetoot.domain.usecase.InsertStateUseCase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HomePresenter implements HomeInterface {

    private GetDataHomeUseCase getDataHomeUseCase = new GetDataHomeUseCase();
    private InsertStateUseCase insertStateUseCase = new InsertStateUseCase();
    private InsertNewContactUseCase insertNewContactUseCase = new InsertNewContactUseCase();

    @Override
    public ArrayList<StateModel> onClickSendState(String idPublicacion, String idUser, String mensaje, Context context) {
        return insertStateUseCase.insertState(idPublicacion,idUser, mensaje,context);
    }

    @Override
    public ArrayList<ContactModel> onClickAddContact(String idPublicacion, String idUser, Context context) {
        return insertNewContactUseCase.insertContact(idPublicacion,idUser, context);
    }

    @Override
    public boolean onClickExitHome(Boolean option) {
        return option;
    }

    @Override
    public ArrayList<StateModel> getStates(Context context) {
        return getDataHomeUseCase.getStatesList(context);
    }

    @Override
    public ArrayList<ContactModel> checkContacts(Context context) {
        return getDataHomeUseCase.getListContacts(context);
    }

    @Override
    public String getIdPublicacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss z");
        String idPublicacion = "idp"+sdf.format(new Date());
        return idPublicacion;
    }

    @Override
    public String getIdContact() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss z");
        String idContact = "idc"+sdf.format(new Date());
        return idContact;
    }
}
