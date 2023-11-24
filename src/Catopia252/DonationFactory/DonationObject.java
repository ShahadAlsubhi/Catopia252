package Catopia252.DonationFactory;

import java.time.LocalDate;

public class DonationObject {
    private Donation DonationType;
    private LocalDate DonationDate;
    private String UserID;
    private String ShelterID;

    public DonationObject(Donation donationType, LocalDate donationDate, String userID, String shelterID) {
        DonationType = donationType;
        DonationDate = donationDate;
        UserID = userID;
        ShelterID = shelterID;
    }

    
}
