package cattopia;

import java.time.LocalDate;
import java.util.*;

public class FoodDonation extends Donation{
    private String BrandName;
    private String ExpDate;
    private String ManufecDate;
    private String Size;

    public FoodDonation(Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
    }

    public FoodDonation(String BrandName, String ExpDate, String ManufecDate, String Size, Donation DonationType, LocalDate DonationDate, String UserID, String ShelterID) {
        super(DonationType, DonationDate, UserID, ShelterID);
        this.BrandName = BrandName;
        this.ExpDate = ExpDate;
        this.ManufecDate = ManufecDate;
        this.Size = Size;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String ExpDate) {
        this.ExpDate = ExpDate;
    }

    public String getManufecDate() {
        return ManufecDate;
    }

    public void setManufecDate(String ManufecDate) {
        this.ManufecDate = ManufecDate;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }
    
}
