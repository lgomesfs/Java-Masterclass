package dev.lpa;

public class Keyboard extends ProductForSale {

    private int keysAmount;
    private String language;

    public Keyboard(String brand, double price, String description, int keysAmount, String language) {
        super(brand, price, description);
        this.keysAmount = keysAmount;
        this.language = language;
    }

    @Override
    public void showDetails() {
        System.out.printf("The %s %s %s come with %d keys and in %s for just $ %.2f.%n",
                getTypeInformation(), getBrand(), getDescription(), keysAmount, language, getPrice());
    }
}
