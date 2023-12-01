package Catopia252.DonationFactory;

import java.util.Date;

public class MoneyDonation  implements Donation{
    private String donationType;
    private Date donationDate;
    private String userName;
    private String shelterName;
    private double price;

    public MoneyDonation(String donationType, Date donationDate, String userID, String shelterID, double price) {
        this.donationType = donationType;
        this.donationDate = donationDate;
        this.userName = userID;
        this.shelterName = shelterID;
        this.price = price;
    }

    @Override
    public void donate() {
        System.out.println("your money donation has been made.");
        System.out.println("Details: Amount - "+price );
        System.out.println("Thank you for your donation!");

    }

    @Override
    public String getDonationType() {
        return donationType;
    }
    @Override
    public double getDonationAmount() {
        return price;
    }

}
