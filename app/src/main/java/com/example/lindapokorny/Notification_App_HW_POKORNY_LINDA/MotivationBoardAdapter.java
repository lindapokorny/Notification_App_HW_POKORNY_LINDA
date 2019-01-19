package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lindapokorny.motivationboardrecycler.R;

public class MotivationBoardAdapter extends RecyclerView.ViewHolder implements View.OnClickListener {

    private Context context;
    private int[] motivationBoardPictureList;
    private String[] caption;
    private LayoutInflater mInflater;

    public MotivationBoardAdapter(int[] motivationBoardPictureList, String[] caption) {
        super(itemView);
    }

    public MotivationBoardAdapter(@NonNull View itemView) {
        super(itemView);
    }

    @NonNull
    public MotivationBoardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_tile, viewGroup, false);
        return new MotivationBoardViewHolder(view, motivationBoardPictureList, caption);
    }

    public void onBindViewHolder() {
    }

    public void onBindViewHolder(@NonNull MotivationBoardViewHolder motivationBoardViewHolder, int position) {
        int picId = motivationBoardPictureList[position];
        String captionId = caption[position];

        motivationBoardViewHolder.imageView.setImageResource(picId);
        motivationBoardViewHolder.textView.setText(captionId);
    }

    protected int getItemCount() {
        return motivationBoardPictureList.length;
    }

    @Override
    public void onClick(View v) {

    }

    public interface ItemClickListener {
    }
}

