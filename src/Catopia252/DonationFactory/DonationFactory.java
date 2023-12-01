package Catopia252.DonationFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DonationFactory {

    private static Scanner scanner = new Scanner(System.in);

    public Donation createDonation(String donationType, String userName, String shelterName) {
        System.out.println("Enter donation details for " + donationType + " donation:");

        Date donationDate = new Date(); // Current system date

        // Get donation-specific details based on the type
        switch (donationType.toLowerCase()) {
            case "food":
                System.out.print("Enter brand name: ");
                String brandName = scanner.nextLine();

                System.out.print("Enter expiration date (yyyy-MM-dd): ");
                Date expDate = parseDate(scanner.nextLine());

                System.out.print("Enter manufacturing date (yyyy-MM-dd): ");
                Date manufecDate = parseDate(scanner.nextLine());

                System.out.print("Enter size: ");
                String size = scanner.nextLine();

                return new FoodDonation(donationType, donationDate, userName, shelterName, brandName, expDate, manufecDate, size);

            case "toys":
                System.out.print("Enter condition: ");
                String condition = scanner.nextLine();

                System.out.print("Enter size: ");
                size = scanner.nextLine();

                return new ToysDonation(donationType, donationDate, userName, shelterName, condition, size);

            case "money":
                System.out.print("Enter donation amount: ");
                double amount = Double.parseDouble(scanner.nextLine());

                return new MoneyDonation(donationType, donationDate, userName, shelterName, amount);

            default:
                throw new IllegalArgumentException("Invalid donation type: " + donationType);
        }
    }

    private Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
