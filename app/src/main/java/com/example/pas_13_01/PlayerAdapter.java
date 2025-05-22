package com.example.pas_13_01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {


    private List<Team> teamList;


    public PlayerAdapter(List<Team> teamList) {
        this.teamList = teamList;
    }

    @Override
    public PlayerAdapter.PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false);
        return new PlayerAdapter.PlayerViewHolder(view);
    }
//
    @Override
    public void onBindViewHolder(PlayerAdapter.PlayerViewHolder holder, int position) {
        Team team = teamList.get(position);
        holder.txtFormerTeam.setText(team.getStrFormerTeam());
        holder.txtPlayer.setText(team.getStrPlayer());
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView txtPlayer, txtFormerTeam;



        public PlayerViewHolder(View itemView) {
            super(itemView);
            txtPlayer = itemView.findViewById(R.id.txtPlayer);
            txtFormerTeam = itemView.findViewById(R.id.txtFormerTeam);

        }
    }
}

