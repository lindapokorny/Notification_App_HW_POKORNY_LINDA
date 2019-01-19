package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

import android.view.LayoutInflater;

public class MotivationBoard {


    private int[] motivationBoardPictureList;
    private String[] caption;
    private LayoutInflater mInflater;


    public int[] getMotivationBoardPictureList() {
        return motivationBoardPictureList;
    }

    public void setMotivationBoardPictureList(int[] motivationBoardPictureList) {
        this.motivationBoardPictureList = motivationBoardPictureList;
    }

    public String[] getCaption() {
        return caption;
    }

    public void setCaption(String[] caption) {
        this.caption = caption;
    }

    public void setmInflater(LayoutInflater mInflater) {
        this.mInflater = mInflater;
    }
}
