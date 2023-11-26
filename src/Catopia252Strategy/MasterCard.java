package Catopia252Strategy;

public class MasterCard implements Donation {
    private double amount;
    public MasterCard(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " dollars with master card.");
    }
}
