package com.jrootjunior.TelegramBot.telegram.core.types;

import com.jrootjunior.TelegramBot.telegram.core.constants.CFields;
import org.json.JSONException;
import org.json.JSONObject;

public class GroupChat extends Chat {
    private final JSONObject data;

    private int id;
    private String title;

    public GroupChat(JSONObject data) throws JSONException {
        this.data = data;

        if (data.has(CFields.ID)) {
            id = data.getInt(CFields.ID);
        }

        if (data.has(CFields.TITLE)) {
            title = data.getString(CFields.TITLE);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
