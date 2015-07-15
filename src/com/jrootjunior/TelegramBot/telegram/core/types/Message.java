package com.jrootjunior.TelegramBot.telegram.core.types;
import com.jrootjunior.TelegramBot.telegram.core.constants.CFields;
import org.json.JSONException;
import org.json.JSONObject;

public class Message {
    private JSONObject data;

    private int messageId;
    private User from;
    private int date;
    private Chat chat;
    private User forvardFrom;
    private int forwardDate;
    private Message replyToMessage;
    private String text;
    private Audio audio;
    private Document document;
    private PhotoSize[] photo;
    private Sticker sticker;
    private Video video;
    private Contact contact;
    private Location location;
    private User newChatParticipant;
    private User leftChatParticipant;
    private String newChatTitle;
    private PhotoSize[] newChatPhoto;
    private boolean deleteChatPhoto;
    private boolean groupChatCreated;

    public Message(JSONObject data) throws JSONException {
        this.data = data;

        if (data.has(CFields.MESSAGE_ID)) {
            messageId = data.getInt(CFields.MESSAGE_ID);
        }

        if (data.has(CFields.FROM)) {
            from = new User(data.getJSONObject(CFields.FROM));
        }

        if (data.has(CFields.CHAT)) {
            JSONObject chatObject = data.getJSONObject(CFields.CHAT);
            if (chatObject.has(CFields.TITLE)) {
                chat = new GroupChat(chatObject);
            }

            if (chatObject.has(CFields.FIRST_NAME)) {
                chat = new User(chatObject);
            }
            //TODO
//            if (chat instanceof User) {
//                System.out.println("User");
//                User u = (User) chat;
//                System.out.println(u.getUsername());
//            }
//
//            if (chat instanceof GroupChat) {
//                System.out.println("Group");
//                GroupChat g = (GroupChat) chat;
//                System.out.println(g.getTitle());
//            }
            if (data.has(CFields.TEXT)) {
                text = data.getString(CFields.TEXT);
            }
        }

        //System.out.println(data);
    }

    public int getMessageId() {
        return messageId;
    }

    public User getFrom() {
        return from;
    }

    public int getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public User getForvardFrom() {
        return forvardFrom;
    }

    public int getForwardDate() {
        return forwardDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public String getText() {
        return text;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public PhotoSize[] getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Video getVideo() {
        return video;
    }

    public Contact getContact() {
        return contact;
    }

    public Location getLocation() {
        return location;
    }

    public User getNewChatParticipant() {
        return newChatParticipant;
    }

    public User getLeftChatParticipant() {
        return leftChatParticipant;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public PhotoSize[] getNewChatPhoto() {
        return newChatPhoto;
    }

    public boolean isDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public boolean isGroupChatCreated() {
        return groupChatCreated;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
