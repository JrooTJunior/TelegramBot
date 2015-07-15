package com.jrootjunior.TelegramBot.telegram.core.types;

import com.jrootjunior.TelegramBot.telegram.core.constants.CFields;
import org.json.JSONException;
import org.json.JSONObject;

public class User {
    private JSONObject data;

    private int id;
    private String firstName;
    private String lastName;
    private String username;

    public User(JSONObject data) throws JSONException {
        this.data = data;

        if (data.has(CFields.ID)) {
            id = data.getInt(CFields.ID);
        }

        if (data.has(CFields.FIRST_NAME)) {
            firstName = data.getString(CFields.FIRST_NAME);
        }

        if (data.has(CFields.LAST_NAME)) {
            lastName = data.getString(CFields.LAST_NAME);
        }

        if (data.has(CFields.USERNAME)) {
            username = data.getString(CFields.USERNAME);
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public JSONObject getJSONData() {
        return data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
