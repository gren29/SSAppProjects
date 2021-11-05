package com.example.projecttwobluetoot.presentation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttwobluetoot.R;
import com.example.projecttwobluetoot.domain.model.ContactModel;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolderContact> {

    ArrayList<ContactModel> listContacts;

    public ContactAdapter(ArrayList<ContactModel> listContacts) {
        this.listContacts = listContacts;
    }

    @NonNull
    @Override
    public ViewHolderContact onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, null, false);
        return  new ViewHolderContact(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderContact holder, int position) {
        holder.tvIdUser.setText(listContacts.get(position).getIdUser());
        holder.imageUser.setImageResource(listContacts.get(position).getImageUser());
    }

    @Override
    public int getItemCount() {
        return  listContacts.size();
    }

    public class ViewHolderContact extends RecyclerView.ViewHolder {
        TextView tvIdUser;
        ImageView imageUser;
        public ViewHolderContact(@NonNull View itemView) {
            super(itemView);
            tvIdUser = (TextView)itemView.findViewById(R.id.tvIdUserContact);
            imageUser = (ImageView)itemView.findViewById(R.id.imgRecycleViewUserContact);
        }
    }
}

