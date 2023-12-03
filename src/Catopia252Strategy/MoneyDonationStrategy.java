package Catopia252Strategy;

import java.util.Scanner;

public class MoneyDonationStrategy {
    private static Scanner scanner = new Scanner(System.in);

        public MoneyDonationMethod checkout(double amount) {
            //String command = null;

            System.out.println("\nPlease select your payment method:\n" +
                    "1. Visa Card\n2. PayPal\n3. Master Card\n");
           // Scanner Payment = new Scanner(System.in);
int command = scanner.nextInt();
           //String command = Payment.next();
          // int command=Payment.nextInt();
            //Payment.nextLine();
            switch (command){
                case 1:
                    System.out.println("your donation throw Visa card was " +amount+ "dollars.");
                    return new Visa(amount);

                case 2:
                    System.out.println("your donation throw Master card was " +amount+ "dollars.");
                    return new MasterCard(amount);
                case 3:
                    System.out.println("your donation throw Paypal was " +amount+ "dollars.");
                    return new PayPal(amount);
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }}}
