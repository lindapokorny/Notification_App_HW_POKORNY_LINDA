package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lindapokorny.motivationboardrecycler.R;

public class MainActivity extends AppCompatActivity implements MotivationBoardAdapter.ItemClickListener {
    MotivationBoardAdapter adapter;
    private RecyclerView recyclerView;

    private int[] motivationBoardPictureList = {R.drawable.momanddadpic, R.drawable.whole_family_pic, R.drawable.vlad_and_linda,
            R.drawable.vlad_and_linda2, R.drawable.emily_pic, R.drawable.emily_pic2, R.drawable.valerie_pic, R.drawable.siblings_pic,
            R.drawable.greta_and_linda, R.drawable.danielle_and_linda, R.drawable.gloria_pic,
            R.drawable.img1,R.drawable.img2, R.drawable.img3, R.drawable.the_outdoors2};

    String[] captions = {"", "", "",};

    RecyclerView motivationBoardRecyclerView = findViewById(R.id.recyclerview);
    int numberOfColumns = 5;


    public MotivationBoardAdapter getAdapter() {
        return adapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] caption = getResources().getStringArray(R.array.captions_array);

        recyclerView = findViewById(R.id.recyclerview);

        int numberOfColumns = 5;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(motivationBoardRecyclerView.getAdapter());
    }

}
