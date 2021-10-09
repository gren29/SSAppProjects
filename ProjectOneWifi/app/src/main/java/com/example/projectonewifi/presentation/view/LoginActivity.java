package com.example.projectonewifi.presentation.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.projectonewifi.R;
import com.example.projectonewifi.databinding.ActivityLoginBinding;
import com.example.projectonewifi.presentation.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private LoginPresenter presenter = new LoginPresenter();

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

                if (presenter.onClickLogin(idUser, password)) {
                    Intent intent = new Intent(LoginActivity.this, SplashActivity.class);
                    startActivity(intent);
                } else {
                    binding.etIdUserLogin.setText("");
                    binding.etPasswordLogin.setText("");
                    Toast.makeText(getApplicationContext(), " NEL", Toast.LENGTH_SHORT).show();
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
}