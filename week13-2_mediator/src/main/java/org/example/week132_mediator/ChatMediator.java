package org.example.week132_mediator;

public interface ChatMediator {
    void sendMessage(String msg, String userId);
    void addUser(ChatUser user);
}

