package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lindapokorny.motivationboardrecycler.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MotivationInterface {
    private int[] motivationBoardPictureList;
    //more columns makes each item smaller
    int numberOfColumns = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        initializePictures();
        getListOfBoards();
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MotivationBoardAdapter(getListOfBoards(), this));
    }

    //initialize the pictures array
    private void initializePictures() {
        motivationBoardPictureList = new int[]{R.drawable.momanddadpic, R.drawable.whole_family_pic, R.drawable.vlad_and_linda,
                R.drawable.vlad_and_linda2, R.drawable.emily_pic, R.drawable.emily_pic2, R.drawable.valerie_pic, R.drawable.siblings_pic,
                R.drawable.greta_and_linda, R.drawable.danielle_and_linda, R.drawable.gloria_pic,
                R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.the_outdoors2};
    }

    // create a list of boards using the images in the pictures list and the captions in the captions array
    public List<MotivationBoard> getListOfBoards() {
        String[] caption = getResources().getStringArray(R.array.captions_array);
        List<MotivationBoard> boardList = new ArrayList<>();
        for (int i = 0; i < caption.length; i++) {
            boardList.add(new MotivationBoard(motivationBoardPictureList[i], caption[i]));
        }
        return boardList;
    }

    @Override
    public void boardClicked(MotivationBoard board) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("caption", board.getCaption());
        intent.putExtra("picture", board.getPicture());
        startActivity(intent);
    }
}