package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lindapokorny.motivationboardrecycler.R;

public class SecondActivity extends AppCompatActivity {
    private String caption;
    private int imageResource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView = findViewById(R.id.activity_second_imageview);
        TextView captionTextView = findViewById(R.id.activity_second_caption_textview);
        Button notificationButton = findViewById(R.id.button_send_notification);

        //get the intent sent from the previous activity
        Intent intent = getIntent();

        //get the data from the intent
        caption = intent.getStringExtra("caption");
        imageResource = intent.getIntExtra("picture", R.drawable.img1);

        //set the data
        captionTextView.setText(caption);
        imageView.setImageResource(imageResource);

        //set click listener for the button
        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendNotification();
            }
        });
    }

    // create a method to send the notification
    private void sendNotification() {
        //send notification
    }
}
