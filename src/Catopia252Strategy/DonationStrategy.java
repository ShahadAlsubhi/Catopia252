package Catopia252Strategy;

import java.util.Scanner;

public class DonationStrategy {

        public Donation checkout(double amount) {
            String command = null;

            System.out.println("\nPlease select your payment method:\n" +
                    "1. Visa Card\n2. PayPal\n3. Visa Card\n");
            Scanner Payment = new Scanner(System.in);

           int paymentMethod = Payment.nextInt();
            Payment.nextLine();
            switch (command){
                case "1":
                    return new Visa(amount);
                case "2" :
                    return new MasterCard(amount);
                case "3" :
                    return new PayPal(amount);
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }}}
