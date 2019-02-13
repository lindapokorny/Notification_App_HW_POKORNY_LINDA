package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lindapokorny.motivationboardrecycler.R;

public class MotivationBoardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private ImageView imageView;
    private TextView textView;
    //the listener is the class implementing the interface
    private MotivationInterface listener;
    private MotivationBoard board;

    MotivationBoardViewHolder(@NonNull View itemView) {
        super(itemView);
        //find your views
        imageView = itemView.findViewById(R.id.motivation_board_picture);
        textView = itemView.findViewById(R.id.info_text);
        //set the click listener on the itemview
        itemView.setOnClickListener(this);
    }

    void bind(MotivationBoard board, MotivationInterface listener) {
        this.board = board;
        this.listener = listener;
        imageView.setImageResource(board.getPicture());
        textView.setText(board.getCaption());
    }

    @Override
    public void onClick(View view) {
        //invoke the appropriate method on the listener
        listener.boardClicked(board);
    }
}

