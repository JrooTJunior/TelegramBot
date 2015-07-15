package com.jrootjunior.TelegramBot;

public class TeleBot {
    private static String token;

    public static void main(String[] args) {
	    if(args[0].length() > 0) {
            // Get token..
            token = args[0];
            System.out.println("Loaded token: '" + token + "'");

            // do something here..
        }
    }
}
