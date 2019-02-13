package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lindapokorny.motivationboardrecycler.R;

import java.util.List;

public class MotivationBoardAdapter extends RecyclerView.Adapter<MotivationBoardViewHolder> {
    private List<MotivationBoard> boardsList;
    private MotivationInterface listener;

    MotivationBoardAdapter(List<MotivationBoard> boards, MotivationInterface listener) {
        boardsList = boards;
        this.listener = listener;
    }

    @NonNull
    public MotivationBoardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_tile, viewGroup, false);
        return new MotivationBoardViewHolder(view);
    }

    public void onBindViewHolder(@NonNull MotivationBoardViewHolder motivationBoardViewHolder, int position) {
        //pass the data and the listener to the view holder
        motivationBoardViewHolder.bind(boardsList.get(position), listener);
    }

    public int getItemCount() {
        return boardsList.size();
    }
}

