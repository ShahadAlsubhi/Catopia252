package cattopia;

import java.time.LocalDate;


public class ToysDonation extends Donation{
   private String Condition;
   private String Size;

    public ToysDonation(Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
    }

    public ToysDonation(String Condition, String Size, Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
        this.Condition = Condition;
        this.Size = Size;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }
   
}
