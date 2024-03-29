package org.example;
import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance = new AccessControlService();
    private Map<String, String> permissions; // Key: Document ID, Value: Username

    private AccessControlService() {
        permissions = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        return instance;
    }

    public void grantAccess(String documentId, String username) {
        permissions.put(documentId, username);
    }

    public boolean isAllowed(String username, String documentId) {
        return permissions.getOrDefault(documentId, "").equals(username);
    }
}