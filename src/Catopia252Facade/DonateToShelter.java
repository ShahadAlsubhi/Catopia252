/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;


import Catopia252.DonationFactory.Donation;
import Catopia252.DonationFactory.DonationFactory;
import Catopia252Proxy.Client;
import Catopia252Strategy.MoneyDonationMethod;
import Catopia252Strategy.MoneyDonationStrategy;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Scanner;

public class DonateToShelter {
    private static Scanner scanner = new Scanner(System.in);

    public static void donate(String username,DonationFactory donationFactory){
        System.out.println("What shelter do you want to donate to? ");
        String shelterName =  scanner.nextLine();
        String[] arg={};
        Client.main(arg);
        System.out.println("What type of donation will it be? (food, money or toys)");
        String donationType =  scanner.nextLine();
        


        Donation dn = donationFactory.createDonation( donationType,  username,  shelterName);
        dn.donate();

        if (dn.getDonationType().equalsIgnoreCase("money")){
            double amount = dn.getDonationAmount();
            MoneyDonationStrategy donationStrategy= new MoneyDonationStrategy();
            MoneyDonationMethod donationMethod = donationStrategy.checkout(amount);


        }




    }

    
}
