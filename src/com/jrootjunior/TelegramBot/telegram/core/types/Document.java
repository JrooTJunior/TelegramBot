package com.jrootjunior.TelegramBot.telegram.core.types;

public class Document {
    private String fileId;
    private PhotoSize thumb;
    private String fileName;
    private String mimeType;
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public int getFileSize() {
        return fileSize;
    }
}
