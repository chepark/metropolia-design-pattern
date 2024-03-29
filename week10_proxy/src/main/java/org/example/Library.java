package org.example;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, DocumentInterface> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(String id, DocumentInterface document) {
        documents.put(id, document);
    }

    public DocumentInterface getDocument(String id) {
        return documents.get(id);
    }
}
