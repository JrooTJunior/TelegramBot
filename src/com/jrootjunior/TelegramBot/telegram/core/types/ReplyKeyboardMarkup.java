package com.jrootjunior.TelegramBot.telegram.core.types;

public class ReplyKeyboardMarkup {
    private String[][] keyboard;
    private boolean resizeKeyboard;
    private boolean oneTimeKeyboard;
    private boolean selective;

    public String[][] getKeyboard() {
        return keyboard;
    }

    public boolean isResizeKeyboard() {
        return resizeKeyboard;
    }

    public boolean isOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public boolean isSelective() {
        return selective;
    }
}
