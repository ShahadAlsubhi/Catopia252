package Catopia252.DonationFactory;

import java.util.Date;

public class FoodDonation implements Donation{

    private String donationType;
    private Date donationDate;
    private String userID;
    private String shelterID;
    private String brandName;
    private Date expDate;
    private Date manufecDate;
    private String size;

    public FoodDonation(String donationType, Date donationDate, String userID, String shelterID, String brandName, Date expDate, Date manufecDate, String size) {
        this.donationType = donationType;
        this.donationDate = donationDate;
        this.userID = userID;
        this.shelterID = shelterID;
        this.brandName = brandName;
        this.expDate = expDate;
        this.manufecDate = manufecDate;
        this.size = size;
    }

    @Override
    public void donate() {
        System.out.println("your food donation has been made.");
        System.out.println("Details: Brand - " + brandName + ", Expiration Date - " + expDate +
                ", Manufacturing Date - " + manufecDate + ", Size - " + size);
        System.out.println("Thank you for your donation!");

    }


}
