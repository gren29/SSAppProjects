package com.example.projectonewifi.presentation.view.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import com.example.projectonewifi.R;
import com.example.projectonewifi.domain.model.StateModel;
import com.example.projectonewifi.presentation.adapter.StateAdapter;
import com.example.projectonewifi.presentation.presenter.HomePresenter;

import java.util.ArrayList;

public class StateFragment extends Fragment {

    private ArrayList<StateModel> listStates;
    private RecyclerView recyclerViewStates;
    private EditText etState;
    private ImageButton tbnSend;
    private String stringState;
    private String idUser;

    public static final String MY_PREFERENCES = "ID_USER";

    private HomePresenter presenter = new HomePresenter();

    public StateFragment() {
    }

    public static StateFragment newInstance(String param1, String param2) {
        StateFragment fragment = new StateFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_state, container, false);

        tbnSend = (ImageButton)view.findViewById(R.id.btnSendState);
        etState = (EditText)view.findViewById(R.id.etNewMensajeState);

        listStates = new ArrayList<>();
        recyclerViewStates = (RecyclerView)view.findViewById(R.id.rvStates);
        recyclerViewStates.setLayoutManager(new LinearLayoutManager(getContext()));

        listStates = presenter.getStates();
        StateAdapter adapter = new StateAdapter(listStates);
        recyclerViewStates.setAdapter(adapter);

        tbnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stringState = etState.getText().toString();
                onGetIdUser();
                listStates = presenter.onClickSendState(idUser, stringState);
                StateAdapter adapter = new StateAdapter(listStates);
                recyclerViewStates.setAdapter(adapter);
                etState.setText("");
            }
        });
        return  view;
    }

    public void onGetIdUser() {
        SharedPreferences sharedPreferencesKeepSignedIn = getActivity().getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        idUser =  sharedPreferencesKeepSignedIn.getString("user_id", " - ").toString();
    }
}