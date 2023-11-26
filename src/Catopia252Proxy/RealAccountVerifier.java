
package Catopia252Proxy;

import java.util.*;

// RealSubject (Original Object)
public class RealAccountVerifier implements AccountVerifier {

    private Map<String, String> userDatabase; // Simulating a simple in-memory user database

    public RealAccountVerifier() {
        userDatabase = new HashMap<>();
        // Pre-populate the database with sample user data (username, password)
        userDatabase.put("user123", "password123");
        userDatabase.put("johnDoe", "secretPass");
        userDatabase.put("catLover", "cat123");
    }

    @Override
    public boolean verifyAccount(String username, String password) {
        
        // Simulating a basic username-password check
        String storedPassword = userDatabase.get(username);

        return storedPassword != null && storedPassword.equals(password);
    }
}

