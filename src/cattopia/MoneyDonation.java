package cattopia;

import java.time.LocalDate;
import java.util.Date;


public class MoneyDonation extends Donation{
  private int Price;

    public MoneyDonation(Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
    }

    public MoneyDonation(int Price, Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
        this.Price = Price;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
}
