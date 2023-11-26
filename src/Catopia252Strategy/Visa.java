package Catopia252Strategy;

public class Visa implements Donation {
    private double amount;
    public  Visa(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " dollars with Visa card.");
    }
}
