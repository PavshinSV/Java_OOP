package Lesson06.HomeWork;

import java.time.LocalDate;
import java.time.LocalTime;

public class Message {

    private static int count = 1;
    private String message;
    private int msgID;

    public Message(String message) {
        this.message = message;
        this.msgID = count++;
    }

    public String getMessage() {
        return message;
    }

    public int getMsgID() {
        return msgID;
    }

    @Override
    public String toString() {
        return message;
    }

    public void edit(String text) {
        this.message = text;
    }

    public String getMessage(UserModel sender, UserModel receiver, String message) {
        msgID = count++;
        StringBuilder builder = new StringBuilder();
        builder.append("msgID: ").
                append(msgID).
                append("; ").
                append(LocalDate.now()).
                append(";").
                append(LocalTime.now().getHour()).
                append(":").
                append(LocalTime.now().getMinute()).
                append("; ").
                append("userID:").
                append(sender.getId()).
                append(", to userID: ").
                append(receiver.getId()).
                append(" - { ").
                append(sender.nameForMessage()).
                append(" send message to ").
                append(receiver.nameForMessage()).
                append(": ").
                append(message).
                append(" }");
        return builder.toString();
    }
}
