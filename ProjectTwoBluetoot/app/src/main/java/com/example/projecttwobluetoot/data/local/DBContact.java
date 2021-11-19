package com.example.projecttwobluetoot.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.projecttwobluetoot.R;
import com.example.projecttwobluetoot.data.utilities.Utilities;
import com.example.projecttwobluetoot.domain.model.ContactModel;

import java.util.ArrayList;

public class DBContact {

    public ArrayList<ContactModel> listContacts = new ArrayList<>();

    public ArrayList<ContactModel> getListContacts(Context context){
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context,"bd_app",null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        ContactModel contactModel = null;
        listContacts.clear();
        Cursor cursor = db.rawQuery("SELECT * FROM "+ Utilities.TABLE_CONTACTS, null);
        while(cursor.moveToNext()){
            contactModel = new ContactModel();
            contactModel.setIdContacto(cursor.getString(0));
            contactModel.setIdUser(cursor.getString(1));
            contactModel.setNameContact("");
            contactModel.setImageUser( R.drawable.ic_baseline_person_24_t);
            listContacts.add(contactModel);
        }
        return listContacts;
    }

    public ArrayList<ContactModel> insertContact(String idPublicacion, String idUser,Context context) {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context,"bd_app",null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utilities.CAMPO_IDCONTACTO, idPublicacion);
        contentValues.put(Utilities.CAMPO_IDUSERCONTACT,idUser);
        Long rest = db.insert(Utilities.TABLE_CONTACTS, Utilities.CAMPO_IDPULIBICACION, contentValues);
        return  getListContacts(context);
    }
}
