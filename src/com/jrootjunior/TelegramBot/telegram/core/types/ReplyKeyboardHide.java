package com.jrootjunior.TelegramBot.telegram.core.types;

public class ReplyKeyboardHide {
    private boolean hideKeyboard = true;
    private boolean selective;

    public boolean isHideKeyboard() {
        return hideKeyboard;
    }

    public boolean isSelective() {
        return selective;
    }
}
