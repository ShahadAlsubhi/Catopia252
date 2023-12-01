package Catopia252Strategy;

public class PayPal implements MoneyDonationMethod {
    private double amount;

    public PayPal(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " dollars with PayPal.");
    }
}
