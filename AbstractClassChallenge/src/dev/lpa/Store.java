package dev.lpa;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> products = new ArrayList<>();

        products.add(new Keyboard("Machenike", 57.99, "K500",
                94, "english"));
        products.add(new Monitor("Samsung", 549.99, "Odyssey", 120));
        products.add(new Keyboard("Logitech", 134.99, "G915",
                104, "portuguese"));
        products.add(new Monitor("AOC", 789.99, "Agon", 180));

        for (ProductForSale product : products){
            product.showDetails();
        }

        ArrayList<OrderItem> orderItems = new ArrayList<>();

        addItemToOrder((findProduct("K500", products)), orderItems, 3);
        addItemToOrder((findProduct("Odyssey", products)), orderItems, 2);
        addItemToOrder((findProduct("G915", products)), orderItems, 4);

        printOrderItem(orderItems);

    }

    private static ProductForSale findProduct(String description, ArrayList<ProductForSale> products){
        for (ProductForSale product : products){
            if (product.getDescription().equals(description)){
                return product;
            }
        }
        return null;

    }

    private static void addItemToOrder(ProductForSale product, ArrayList<OrderItem> orderItems, int quantity){
        orderItems.add(new OrderItem(quantity, product));
    }

    private static void printOrderItem(ArrayList<OrderItem> orderItems){
        double total = 0.0;
        System.out.println("-".repeat(30));
        for (OrderItem item : orderItems){
            item.printInfo();
            total += item.getPrice();
        }
        System.out.println("-".repeat(30));
        System.out.printf("Total: $ %.2f", total);
    }
}
