package com.jrootjunior.TelegramBot.telegram.core.types;

public class UserProfilePhotos {
    private int totalCount;
    private PhotoSize[] photos;

    public int getTotalCount() {
        return totalCount;
    }

    public PhotoSize[] getPhotos() {
        return photos;
    }
}
