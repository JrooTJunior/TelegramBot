package com.jrootjunior.TelegramBot.telegram.core;

import com.jrootjunior.TelegramBot.telegram.Bot;
import com.jrootjunior.TelegramBot.telegram.core.types.Update;

import java.util.ArrayList;

public class Listener extends Thread {
    Bot bot;

    private static int updateTimeout = 3000;
    private static boolean status = true;
    private static int lastUpdate = 0;

    private static ArrayList<Update> updateArray;


    public Listener(Bot listened_bot) {
        super();
        bot = listened_bot;
    }

    public void run() {
        status = true;
        while (status) {
            if(lastUpdate == 0) {
                updateArray = bot.getUpdates();
            } else {
                updateArray = bot.getUpdates(lastUpdate);
            }

            System.out.println("Found " + updateArray.size() + " unreaded message(s).");
            for(int msgID = 1; msgID < updateArray.size(); msgID++) {
                Update update = updateArray.get(msgID);
                lastUpdate = update.getUpdateId();
            }

            pause(updateTimeout);
        }
    }

    private void pause(int millis) {
        try {
            sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setUpdateTimeout(int millis) {
        updateTimeout = millis;
    }

    public int getUpdateTimeout() {
        return updateTimeout;
    }

    public void kill() {
        status = false;
    }
}