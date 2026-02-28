package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Bank nuBank = new Bank("NuBank");
        nuBank.addCustomer("Diego");
        nuBank.addTransaction("Diego", 900.00);
        nuBank.printData("Diego");
        nuBank.addTransaction("Diego", -1000.00);
        nuBank.printData("Diego");
        nuBank.addCustomer("Diego");

        nuBank.addCustomer("Leonardo");
        nuBank.addTransaction("Leo", 500.00);
        nuBank.addTransaction("Leonardo", 500.00);

    }
}
