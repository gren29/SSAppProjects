package com.example.projectonewifi.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.projectonewifi.databinding.ActivityLoginBinding;
import com.example.projectonewifi.presentation.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private LoginPresenter presenter = new LoginPresenter();

    public static final String MY_PREFERENCES = "ID_USER";

    private String idUser;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLoginLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idUser = binding.etIdUserLogin.getText().toString();
                password = binding.etPasswordLogin.getText().toString();

                if (presenter.onClickLogin(idUser, password, getApplicationContext())) {
                    Intent intent = new Intent(LoginActivity.this, Home.class);
                    startActivity(intent);
                    onSaveIdUser(idUser);
                    binding.etIdUserLogin.setText("");
                    binding.etPasswordLogin.setText("");
                } else {
                    binding.etIdUserLogin.setText("");
                    binding.etPasswordLogin.setText("");
                    Toast.makeText(getApplicationContext(), " Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnSignupLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (presenter.onClickSingUp()) {
                    Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(intent);
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