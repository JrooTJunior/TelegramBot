package com.jrootjunior.TelegramBot.telegram.core.types;

import com.jrootjunior.TelegramBot.telegram.core.constants.CFields;
import org.json.JSONException;
import org.json.JSONObject;

public class Update {
    private JSONObject data;

    private int updateId;
    private Message message;

    public Update(JSONObject data) throws JSONException {
        this.data = data;

        if (data.has(CFields.UPDATE_ID)) {
            updateId = data.getInt(CFields.UPDATE_ID);
        }

        if (data.has(CFields.MESSAGE)) {
            message = new Message(data.getJSONObject(CFields.MESSAGE));
        }
    }

    public int getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
