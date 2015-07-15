package com.jrootjunior.TelegramBot;

import com.jrootjunior.TelegramBot.telegram.Bot;
import com.jrootjunior.TelegramBot.telegram.core.types.User;

public class TeleBot {
    private static String token;
    private static Bot bot;

    public static void main(String[] args) {
	    if(args[0].length() > 0) {
            // Get token..
            token = args[0];
            System.out.println("Loaded token: '" + token + "'");
            // Create new bot
            bot = new Bot(token);
            User userBot = bot.getMe();
            System.out.println("Connected. Bot Name: '" +
                    userBot.getFirstName() + "' @" + userBot.getUsername() + "(" + String.valueOf(userBot.getId()) + ")");
            bot.getUpdates();
        }
    }
}
