/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;


import Catopia252.DonationFactory.Donation;
import Catopia252.DonationFactory.DonationFactory;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Scanner;

public class DonateToShelter {
    private static Scanner scanner = new Scanner(System.in);

    public static void donate(String username){
        System.out.println("What shelter do you want to donate to? ");
        String shelterName =  scanner.nextLine();
        System.out.println("What type of donation will it be? (food, money or toys)");
        String donationType =  scanner.nextLine();

        DonationFactory donationFactory = new DonationFactory();
        Donation dn = donationFactory.createDonation( donationType,  username,  shelterName);

        if (dn.getDonationType().equalsIgnoreCase("money")){

        }




    }

    
}