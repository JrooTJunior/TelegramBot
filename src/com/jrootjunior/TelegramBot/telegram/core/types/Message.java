package com.jrootjunior.TelegramBot.telegram.core.types;

public class Message {
    private int messageId;
    private User from;
    private int date;
    private Class chat;
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

    public Message() {

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

    public Class getChat() {
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
}
