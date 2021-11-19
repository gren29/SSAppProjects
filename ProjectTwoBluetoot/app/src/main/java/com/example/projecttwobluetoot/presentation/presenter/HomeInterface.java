package com.example.projecttwobluetoot.presentation.presenter;

import android.content.Context;

import com.example.projecttwobluetoot.domain.model.ContactModel;
import com.example.projecttwobluetoot.domain.model.StateModel;

import java.util.ArrayList;

public interface HomeInterface {
    ArrayList<StateModel> onClickSendState(String idPublicacion, String idUser, String mensaje, Context context);
    ArrayList<ContactModel> onClickAddContact(String idPublicacion, String idUser, Context context);
    boolean onClickExitHome(Boolean option);
    ArrayList<StateModel> getStates(Context context);
    ArrayList<ContactModel> checkContacts(Context context);
    String getIdPublicacion();
    String getIdContact();
}
