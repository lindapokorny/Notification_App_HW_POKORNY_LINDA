package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lindapokorny.motivationboardrecycler.R;

public class MotivationBoardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView imageView;
    TextView textView;
    int[] images;
    String[] caption;
    View.OnClickListener  mclickListener;
    public MotivationBoardViewHolder(@NonNull View itemView, int[] motivationBoardPictureList, String[] caption) {
        super(itemView);
        this.images = images;
        this.caption = this.caption;

        imageView = itemView.findViewById(R.id.motivation_board_picture);
        textView = itemView.findViewById(R.id.info_text);


        itemView.findViewById(R.id.recyclerview).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (mclickListener != null) {
            mclickListener.onClick(imageView);
        }
        Intent intent = new Intent(view.getContext(), SecondActivity.class);
        intent.putExtra("picId", images[getAdapterPosition()]);
        intent.putExtra("captionId", caption[getAdapterPosition()]);
        view.getContext().startActivity(intent);

    }

    String getItem(int imageView, int textView){
        return String.valueOf(imageView) + String.valueOf(textView);
    }
    void setClickListener(View.OnClickListener itemClickListener){
        this.mclickListener = itemClickListener;
    }
    public interface ItemClickListener{
        void onItemClick(View view, int position);
    }
}

