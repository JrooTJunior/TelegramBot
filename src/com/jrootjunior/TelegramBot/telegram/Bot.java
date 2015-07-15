package com.jrootjunior.TelegramBot.telegram;

import com.goebl.david.Webb;
import com.jrootjunior.TelegramBot.telegram.core.constants.CFields;
import com.jrootjunior.TelegramBot.telegram.core.types.Message;
import com.jrootjunior.TelegramBot.telegram.core.types.User;
import com.jrootjunior.TelegramBot.telegram.core.types.UserProfilePhotos;
import org.json.JSONException;
import org.json.JSONObject;

public class Bot {
    public static final String API_URL = "https://api.telegram.org/bot%s";
    public static final String GET_ME = "%s/getMe";

    private String baseUrl;
    private User me;
    private boolean unauthorized = true;

    public Bot(String token) {
        baseUrl = String.format(API_URL, token);
        getMe();
    }

    public User getMe() {
        String url = String.format(GET_ME, baseUrl);
        boolean ok = false;
        JSONObject result;

        Webb webb = Webb.create();
        JSONObject response = webb.post(url).ensureSuccess().asJsonObject().getBody();

        try {
            if (response.has(CFields.OK)) {
                ok = response.getBoolean(CFields.OK);
            }

            if (ok) {
                unauthorized = false;
                if (response.has(CFields.RESULT)) {
                    result = response.getJSONObject(CFields.RESULT);
                    me = new User(result);
                }
            } else {
                unauthorized = true;
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return me;
    }

    public void getUpdates() {

    }

    public void setWebhook() {

    }

    public Message sendMessage() {
        return null;
    }

    public Message forvardMessage() {
        return null;
    }

    public Message sendPhoto() {
        return null;
    }

    public Message sendAudio() {
        return null;
    }

    public Message sendDocument() {
        return null;
    }

    public Message sendSticker() {
        return null;
    }

    public Message sendVideo() {
        return null;
    }

    public Message sendLocation() {
        return null;
    }

    public void sendChatAction() {

    }

    public UserProfilePhotos getUserProfilePhotos() {
        return null;
    }
}
