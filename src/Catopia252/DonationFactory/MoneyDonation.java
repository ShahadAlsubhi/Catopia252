package Catopia252.DonationFactory;

import java.util.Date;

public class MoneyDonation  implements Donation{
    private String donationType;
    private Date donationDate;
    private String userID;
    private String shelterID;
    private double price;

    public MoneyDonation(String donationType, Date donationDate, String userID, String shelterID, double price) {
        this.donationType = donationType;
        this.donationDate = donationDate;
        this.userID = userID;
        this.shelterID = shelterID;
        this.price = price;
    }

    @Override
    public void donate() {
        System.out.println("your money donation has been made.");
        System.out.println("Details: Amount - "+price );
        System.out.println("Thank you for your donation!");

    }

}
