package com.jrootjunior.TelegramBot.telegram;

import com.goebl.david.Webb;
import com.jrootjunior.TelegramBot.telegram.core.constants.CFields;
import com.jrootjunior.TelegramBot.telegram.core.types.Message;
import com.jrootjunior.TelegramBot.telegram.core.types.Update;
import com.jrootjunior.TelegramBot.telegram.core.types.User;
import com.jrootjunior.TelegramBot.telegram.core.types.UserProfilePhotos;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Bot {
    public static final String API_URL = "https://api.telegram.org/bot%s";
    public static final String GET_ME = "%s/getMe";
    public static final String GET_UPDATES = "%s/getUpdates";

    private Webb webSession;

    private String baseUrl;

    private User me;
    private boolean unauthorized = true;
    private boolean ok = false;
    private JSONObject response;

    public Bot(String token) {
        baseUrl = String.format(API_URL, token);
        getMe();
    }

    public User getMe() {
        String url = String.format(GET_ME, baseUrl);

        webSession = Webb.create();

        response = webSession.get(url).ensureSuccess().useCaches(false).asJsonObject().getBody();

        try {
            if (response.has(CFields.OK)) {
                ok = response.getBoolean(CFields.OK);
            }

            if (ok) {
                unauthorized = false;
                if (response.has(CFields.RESULT)) {
                    JSONObject result = response.getJSONObject(CFields.RESULT);
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

    public ArrayList<Update> getUpdates() {
        ArrayList<Update> updates = new ArrayList<>();
        if (!unauthorized) {
            String url = String.format(GET_UPDATES, baseUrl);
            response = webSession.get(url).ensureSuccess().useCaches(false).asJsonObject().getBody();
            try {
                if (response.has(CFields.OK)) {
                    ok = response.getBoolean(CFields.OK);
                }

                if (ok) {
                    if (response.has(CFields.RESULT)) {
                        JSONArray result = response.getJSONArray(CFields.RESULT);
                        for (int i = 0; i < result.length(); i++) {
                            Update update = new Update(result.getJSONObject(i));
                            updates.add(i, update);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return updates;
    }

    public ArrayList<Update> getUpdates(int offset, int limit, int timeout) {
        ArrayList<Update> updates = new ArrayList<>();
        if (!unauthorized) {
            String url = String.format(GET_UPDATES, baseUrl);
            response = webSession.get(url).ensureSuccess().useCaches(false).asJsonObject().getBody();
            try {
                if (response.has(CFields.OK)) {
                    ok = response.getBoolean(CFields.OK);
                }

                if (ok) {
                    if (response.has(CFields.RESULT)) {
                        JSONArray result = response.getJSONArray(CFields.RESULT);
                        for (int i = 0; i < result.length(); i++) {
                            Update update = new Update(result.getJSONObject(i));
                            updates.add(i, update);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return updates;
    }

    public ArrayList<Update> getUpdates(int offset) {
        ArrayList<Update> updates = new ArrayList<>();
        if (!unauthorized) {
            String url = String.format(GET_UPDATES, baseUrl);
            response = webSession.get(url).ensureSuccess().useCaches(false).asJsonObject().getBody();
            try {
                if (response.has(CFields.OK)) {
                    ok = response.getBoolean(CFields.OK);
                }

                if (ok) {
                    if (response.has(CFields.RESULT)) {
                        JSONArray result = response.getJSONArray(CFields.RESULT);
                        for (int i = 0; i < result.length(); i++) {
                            Update update = new Update(result.getJSONObject(i));
                            updates.add(i, update);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return updates;
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
