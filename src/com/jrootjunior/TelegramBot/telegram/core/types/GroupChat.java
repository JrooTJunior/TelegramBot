package com.jrootjunior.TelegramBot.telegram.core.types;

public class GroupChat {
    private int mId;
    private String mTitle;

    public GroupChat(int id, String title) {
        this.mId = id;
        this.mTitle = title;
    }

    public int getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }
}
