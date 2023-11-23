/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252;

public class Client {
    public static void main(String[] args) {
        // Using the RealSubject directly
        AccountVerifier realVerifier = new RealAccountVerifier();
        realVerifier.verifyAccount("john_doe", "password123");

        // Using the Proxy
        AccountVerifier proxyVerifier = new AccountVerifierProxy();
        proxyVerifier.verifyAccount("jane_doe", "securePass");
    }
}

