package cattopia;


import java.time.LocalDate;

public class Donation {
    private Donation DonationType;
    private LocalDate DonationDate;
    private String UserID;
    private String ShelterID;  

    public Donation(Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        this.DonationType = DonationType;
        this.DonationDate = DonationDate;
        this.UserID = UserID;
        this.ShelterID = ShelterID;
    }

    public Donation getDonationType() {
        return DonationType;
    }

    public void setDonationType(Donation DonationType) {
        this.DonationType = DonationType;
    }

    public LocalDate getDonationDate() {
        return DonationDate;
    }

    public void setDonationDate(LocalDate DonationDate) {
        this.DonationDate = DonationDate;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getShelterID() {
        return ShelterID;
    }

    public void setShelterID(String ShelterID) {
        this.ShelterID = ShelterID;
    }
    
    
}
