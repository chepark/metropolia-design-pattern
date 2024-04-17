package org.example.week132_mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<ChatUser> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(ChatUser user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, String userId) {
        for (ChatUser user : users) {
            // message should not be received by the user sending it
            if (!user.getId().equals(userId)) {
                user.receive(msg);
            }
        }
    }
}
