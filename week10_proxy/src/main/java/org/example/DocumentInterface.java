package org.example;

public interface DocumentInterface {
    String getContent(User user) throws AccessDeniedException;
    String getCreationDate();
}