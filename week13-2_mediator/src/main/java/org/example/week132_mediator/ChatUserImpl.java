package org.example.week132_mediator;
import javafx.scene.control.TextArea;

public class ChatUserImpl extends ChatUser {
    public ChatUserImpl(ChatMediator med, String id, TextArea chatWindow) {
        super(med, id, chatWindow);
    }

    @Override
    public void send(String msg) {
        mediator.sendMessage(id + ": " + msg, id);
    }
}
