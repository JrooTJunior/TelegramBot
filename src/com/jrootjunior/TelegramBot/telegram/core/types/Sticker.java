package com.jrootjunior.TelegramBot.telegram.core.types;

public class Sticker {
    private String fileId;
    private int width;
    private int height;
    private PhotoSize thumb;
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public int getFileSize() {
        return fileSize;
    }
}
