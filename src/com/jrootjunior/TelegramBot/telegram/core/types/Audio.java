package com.jrootjunior.TelegramBot.telegram.core.types;

public class Audio {
    private String fileId;
    private int duration;
    private String mimeType;
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public int getDuration() {
        return duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public int getFileSize() {
        return fileSize;
    }
}
