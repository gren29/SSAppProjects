package com.example.projectonewifi.presentation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectonewifi.R;
import com.example.projectonewifi.domain.model.StateModel;

import java.util.ArrayList;

public class StateAdapter  extends RecyclerView.Adapter<StateAdapter.ViewHolderState> {

    ArrayList<StateModel> listStates;

    public StateAdapter(ArrayList<StateModel> listStates) {
        this.listStates = listStates;
    }

    @NonNull
    @Override
    public StateAdapter.ViewHolderState onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_state,null, false);
        return new ViewHolderState(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateAdapter.ViewHolderState holder, int position) {
        holder.tvIdPublicacion.setText(listStates.get(position).getIdPulibcacion());
        holder.tvIdUser.setText(listStates.get(position).getIdUser());
        holder.tvmensaje.setText(listStates.get(position).getMensaje());
        holder.imageUser.setImageResource(listStates.get(position).getImageUser());
    }

    @Override
    public int getItemCount() {
        return listStates.size();
    }

    public class ViewHolderState extends RecyclerView.ViewHolder {
        TextView tvIdPublicacion;
        TextView tvIdUser;
        TextView tvmensaje;
        ImageView imageUser;

        public ViewHolderState(@NonNull View itemView) {
            super(itemView);
            tvIdPublicacion = (TextView)itemView.findViewById(R.id.tvRecycleViewIdPublicacionState);
            tvIdUser = (TextView)itemView.findViewById(R.id.tvRecycleViewIdUserState);
            tvmensaje = (TextView)itemView.findViewById(R.id.tvRecycleViewMenajeState);
            imageUser = (ImageView)itemView.findViewById(R.id.imgRecycleViewUserState);
        }
    }
}
