package com.example.projecttwobluetoot.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.projecttwobluetoot.R;
import com.example.projecttwobluetoot.data.utilities.Utilities;
import com.example.projecttwobluetoot.domain.model.StateModel;

import java.util.ArrayList;

public class DBStates {
    public ArrayList<StateModel> listStatesRepo = new ArrayList<StateModel>();


    public ArrayList<StateModel> getStateList(Context context) {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context,"bd_app",null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        StateModel stateModel = null;
        listStatesRepo.clear();
        Cursor cursor = db.rawQuery("SELECT * FROM "+ Utilities.TABLE_STATES, null);
        while(cursor.moveToNext()){
            stateModel = new StateModel();
            stateModel.setIdPulibcacion(cursor.getString(0));
            stateModel.setIdUser(cursor.getString(1));
            stateModel.setMensaje(cursor.getString(2));
            stateModel.setImageUser(R.drawable.ic_baseline_notifications_24_white);
            listStatesRepo.add(stateModel);
        }
        return listStatesRepo;
    }

    public ArrayList<StateModel> insertState(String idPublicacion,String idUser, String mensaje, Context context) {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context,"bd_app",null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utilities.CAMPO_IDPULIBICACION, idPublicacion);
        contentValues.put(Utilities.CAMPO_IDUSER,idUser);
        contentValues.put(Utilities.CAMPO_MENSAJE, mensaje);
        Long rest = db.insert(Utilities.TABLE_STATES, Utilities.CAMPO_IDPULIBICACION, contentValues);
        return  getStateList(context);
    }
}

