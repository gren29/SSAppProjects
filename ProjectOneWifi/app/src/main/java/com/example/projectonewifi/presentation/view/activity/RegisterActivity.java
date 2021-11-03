 package com.example.projectonewifi.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.projectonewifi.databinding.ActivityRegisterBinding;
import com.example.projectonewifi.presentation.presenter.RegisterPresenter;

 public class RegisterActivity extends AppCompatActivity {

     private ActivityRegisterBinding binding;
     private RegisterPresenter presenter = new RegisterPresenter();

     public static final String MY_PREFERENCES = "ID_USER";

     private String idUser;
     private String name;
     private String password;
     private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAceptarRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idUser = binding.etIdUserRegister.getText().toString();
                name = binding.etNameRegister.getText().toString();
                password = binding.etPasswordRegister.getText().toString();
                email = binding.etEmailRegister.getText().toString();
                if (presenter.insertDataUser(idUser, name, password, email)) {
                    Intent intent = new Intent(RegisterActivity.this, SplashActivity.class);
                    startActivity(intent);
                    onSaveIdUser(idUser);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Registro fallido, intente de nuevo con otros datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

     public void onSaveIdUser(String idUser) {
         SharedPreferences sharedPreferencesKeepSignedIn = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
         SharedPreferences.Editor editor = sharedPreferencesKeepSignedIn.edit();
         editor.putString("user_id",idUser);
         editor.commit();
     }
}