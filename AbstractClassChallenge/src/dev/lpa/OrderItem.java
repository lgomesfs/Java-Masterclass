package dev.lpa;

public class OrderItem {
    private int quantity;
    private ProductForSale product;
    private double price;

    public OrderItem(int quantity, ProductForSale product) {
        this.quantity = quantity;
        this.product = product;
        price = product.getSalesPrice(quantity);
    }

    public double getPrice() {
        return price;
    }

    public void printInfo(){
        product.printPricedItem(quantity);
    }
}
