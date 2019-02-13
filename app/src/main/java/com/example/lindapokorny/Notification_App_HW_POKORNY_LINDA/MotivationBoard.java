package com.example.lindapokorny.Notification_App_HW_POKORNY_LINDA;

//create an object that represents a board. it needs an image resource int, and a caption String.
class MotivationBoard {
    private int picture;
    private String caption;

    public MotivationBoard(int picture, String caption) {
        this.picture = picture;
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public int getPicture() {
        return picture;
    }
}
