package com.example.projecttwobluetoot.presentation.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.projecttwobluetoot.R;
import com.example.projecttwobluetoot.presentation.presenter.HomePresenter;
import com.example.projecttwobluetoot.presentation.view.activity.SplashLogoutActivity;

public class HomeFragment extends Fragment {

    private ImageButton btnExit;
    private TextView user;
    private String idUser;

    public static final String MY_PREFERENCES = "ID_USER";
    public HomePresenter presenter = new HomePresenter();

    public HomeFragment() {

    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnExit = (ImageButton)view.findViewById(R.id.btnSalirHome);
        user = (TextView)view.findViewById(R.id.tvIdUserHome);

        iniHome();

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(presenter.onClickExitHome(true)){
                    Intent intent = new Intent(getActivity(), SplashLogoutActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                }
            }
        });
        return view;
    }

    private void iniHome(){
        onGetIdUser();
        user.setText("HI "+idUser+" !");
    }

    private void onGetIdUser() {
        SharedPreferences sharedPreferencesKeepSignedIn = getActivity().getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        idUser =  sharedPreferencesKeepSignedIn.getString("user_id", " - ").toString();
    }
}
