package com.jrootjunior.TelegramBot.telegram.core.types;

public class ForceReply {
    private boolean forceReply = true;
    private boolean selective;

    public boolean isForceReply() {
        return forceReply;
    }

    public boolean isSelective() {
        return selective;
    }
}
