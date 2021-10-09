 package com.example.projectonewifi.presentation.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectonewifi.R;
import com.example.projectonewifi.databinding.ActivityRegisterBinding;
import com.example.projectonewifi.presentation.presenter.RegisterPresenter;

 public class RegisterActivity extends AppCompatActivity {

     private ActivityRegisterBinding binding;
     private RegisterPresenter presenter = new RegisterPresenter();

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
                    finish();
                }
            }
        });
    }
}