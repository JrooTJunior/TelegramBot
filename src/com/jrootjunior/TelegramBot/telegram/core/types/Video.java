package com.jrootjunior.TelegramBot.telegram.core.types;

public class Video {
    private String fileId;
    private int width;
    private int height;
    private int duration;
    private PhotoSize thumb;
    private String mimeType;
    private int fileSize;
    private String caption;

    public String getFileId() {
        return fileId;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDuration() {
        return duration;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public String getMimeType() {
        return mimeType;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getCaption() {
        return caption;
    }
}
