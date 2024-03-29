package org.example;

public class ProxyDocument implements DocumentInterface {
    private Document document;

    public ProxyDocument(Document document) {
        this.document = document;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(user.getUsername(), document.getId())) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access Denied for user: " + user.getUsername());
        }
    }

    @Override
    public String getCreationDate() {
        return document.getCreationDate();
    }
}