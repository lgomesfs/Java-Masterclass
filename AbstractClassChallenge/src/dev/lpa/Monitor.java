package dev.lpa;

public class Monitor extends ProductForSale{

    private int frameRate;

    public Monitor(String brand, double price, String description, int frameRate) {
        super(brand, price, description);
        this.frameRate = frameRate;
    }

    @Override
    public void showDetails() {
        System.out.printf("The %s %s %s with %dhz for just $ %.2f.%n",
                getTypeInformation(), getBrand(), getDescription(), frameRate, getPrice());
    }
}
