
package Catopia252Proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        // Create a RealSubject (Original Object)
        RealAccountVerifier realVerifier = new RealAccountVerifier();

        // Create a Proxy (Proxy Object)
        AccountVerifierProxy proxyVerifier = new AccountVerifierProxy(realVerifier);
        
        // Get user input for username and password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password  = scanner.nextLine();
        
        // Authenticate users using the proxy
        boolean userAuthenticated = authenticateUser(proxyVerifier, username, password );
        
        if(userAuthenticated==true){
            System.out.println("User authenticated successfully!");
        } else {
            System.out.println("User authentication failed.");
        }
        
    }

    private static boolean authenticateUser(AccountVerifier verifier, String username, String password) {
        // Use the provided AccountVerifier (either real or proxy) to authenticate the user
        return verifier.verifyAccount(username, password);
    }
}
