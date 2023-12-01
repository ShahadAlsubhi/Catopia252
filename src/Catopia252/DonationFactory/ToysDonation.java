package Catopia252.DonationFactory;

import java.util.Date;

public class ToysDonation implements Donation{

    private String donationType;
    private Date donationDate;
    private String userName;
    private String shelterName;
    private String condition;
    private String size;

    public ToysDonation(String donationType, Date donationDate, String userID, String shelterID, String condition, String size) {
        this.donationType = donationType;
        this.donationDate = donationDate;
        this.userName = userID;
        this.shelterName = shelterID;
        this.condition = condition;
        this.size = size;
    }

    @Override
    public void donate() {
        System.out.println("your toy donation has been made.");
        System.out.println("Details: condition - " + condition + ", Size - " + size);
        System.out.println("Thank you for your donation!");


    }

    @Override
    public String getDonationType() {
        return donationType;
    }

}
