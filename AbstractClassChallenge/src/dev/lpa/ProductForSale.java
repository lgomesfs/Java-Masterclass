package dev.lpa;

public abstract class ProductForSale {
    private String brand;
    private double price;
    private String description;

    public ProductForSale(String brand, double price, String description) {
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity){
        return price * quantity;
    }

    public void printPricedItem(int quantity){
        System.out.printf("%d - %s %s - $ %.2f%n", quantity, brand, description, getSalesPrice(quantity));
    }

    public abstract void showDetails();

    public String getTypeInformation(){
        return getClass().getSimpleName();
    }
}
