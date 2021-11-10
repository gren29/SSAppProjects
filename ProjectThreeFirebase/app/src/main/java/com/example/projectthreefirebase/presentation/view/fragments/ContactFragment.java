package com.example.projectthreefirebase.presentation.view.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.projectthreefirebase.R;
import com.example.projectthreefirebase.domain.model.ContactModel;
import com.example.projectthreefirebase.presentation.adapter.ContactAdapter;
import com.example.projectthreefirebase.presentation.presenter.HomePresenter;

import java.util.ArrayList;

public class ContactFragment extends Fragment {

    private ArrayList<ContactModel> listContacts;
    private RecyclerView recyclerViewContaccts;
    private EditText etContact;
    private ImageButton btnNewContact;
    private String idContact;

    private HomePresenter presenter = new HomePresenter();

    public ContactFragment() {
    }

    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        btnNewContact = (ImageButton)view.findViewById(R.id.btnSendNewContact);
        etContact = (EditText)view.findViewById(R.id.etNewContactontac);

        listContacts = new ArrayList<>();
        recyclerViewContaccts = (RecyclerView)view.findViewById(R.id.rvContacts);
        recyclerViewContaccts.setLayoutManager(new LinearLayoutManager(getContext()));

        listContacts = presenter.checkContacts();
        ContactAdapter adapter = new ContactAdapter(listContacts);
        recyclerViewContaccts.setAdapter(adapter);

        btnNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                idContact = etContact.getText().toString();
                listContacts = presenter.onClickAddContact(idContact);
                ContactAdapter adapter = new ContactAdapter(listContacts);
                recyclerViewContaccts.setAdapter(adapter);
                etContact.setText("");
            }
        });

        return  view;
    }
}