
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
        System.out.print("Enter the shelter name again for verficton: ");
        String shelterName = scanner.nextLine();
        
        
        // Authenticate users using the proxy
        boolean userAuthenticated = proxyVerifier.verifyAccount(shelterName);
        
        if(userAuthenticated==true){
            System.out.println("User authenticated successfully!");
        } else {
            System.out.println("User authentication failed.");
        }
        
    }
    

    
}

