package com.example.projectonewifi.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.projectonewifi.data.utilities.Utilities;
import com.example.projectonewifi.domain.model.UserModel;

import java.util.ArrayList;

public class DBUsers {

    public ArrayList<UserModel> listUser = new ArrayList<UserModel>();

    public boolean insertUser(String idUser, String name, String password, String email, Context context) {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context,"bd_app",null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Utilities.CAMPO_IDUSERUSER, idUser);
        contentValues.put(Utilities.CAMPO_NAMEUSER,name);
        contentValues.put(Utilities.CAMPO_PASSWORDUSER,password);
        contentValues.put(Utilities.CAMPO_EMAILUSER,email);
        Long rest = db.insert(Utilities.TABLE_USERS, Utilities.CAMPO_IDUSERUSER, contentValues);
        return true;
    }

    public  boolean getUser(String idUser, String password, Context context) {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(context,"bd_app",null, 1);
        SQLiteDatabase db = conn.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+ Utilities.TABLE_USERS, null);
        while (cursor.moveToNext()) {
            if(cursor.getString(0).equals(idUser) && cursor.getString(2).equals(password))return true;
        }
        return false;
    }
}
