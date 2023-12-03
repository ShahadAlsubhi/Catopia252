
package Catopia252Proxy;

import java.util.*;

// RealSubject (Original Object)
public class RealAccountVerifier implements AccountVerifier {

    private String[] usernames; // Simulating a simple in-memory user database

    public RealAccountVerifier() {
        // Pre-populate the database with sample usernames
        usernames = new String[] {"user123", "johnDoe", "catLover"};
        
    }

    @Override
    public boolean verifyAccount(String username) {
       // Check if the provided username exists in the array
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username)) {
                return true; // Username is a match
            }
        }
        return false; // No matching username found
    }
}

