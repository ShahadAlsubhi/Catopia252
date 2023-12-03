
package Catopia252Proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args,String ShelterName) {

        // Create a RealSubject (Original Object)
        RealAccountVerifier realVerifier = new RealAccountVerifier();

        // Create a Proxy (Proxy Object)
        AccountVerifierProxy proxyVerifier = new AccountVerifierProxy(realVerifier);
        
        // Get user input for username and password
       // Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter username: ");
        //String username = scanner.nextLine();
        //System.out.print("Enter password: ");
        //String password  = scanner.nextLine();
        
        // Authenticate users using the proxy
        boolean userAuthenticated = proxyVerifier.verifyAccount(ShelterName);
        
        if(userAuthenticated==true){
            System.out.println("User authenticated successfully!");
        } else {
            System.out.println("User authentication failed.");
        }
        
    }
    

    
}

