package org.example.week132_mediator;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

public abstract class ChatUser {
    protected ChatMediator mediator;
    protected String id;
    protected TextArea chatWindow;

    public ChatUser(ChatMediator med, String id, TextArea chatWindow) {
        this.mediator = med;
        this.id = id;
        this.chatWindow = chatWindow;
    }

    public String getId() {
        return id;
    }

    public abstract void send(String msg);

    public void receive(String msg) {
        Platform.runLater(() -> chatWindow.appendText(msg + "\n"));
    }
}
