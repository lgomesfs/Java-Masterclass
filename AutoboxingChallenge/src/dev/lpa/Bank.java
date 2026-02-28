package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
    }

    private Customer checkCustomer(String name){
        for (Customer c : customers){
            if(name.equals(c.getName())){
                return c;
            }
        }
        return null;
    }

    public void addCustomer(String name){
        if (checkCustomer(name) == null){
            customers.add(new Customer(name));
            System.out.printf("The customer %s were add at our database.%n", name);
        } else {
            System.out.println("The customer is already on our databases.");
        }
    }

    public void addTransaction(String name, double value){
        Customer customer = checkCustomer(name);
        if (customer != null) {
            customer.addATransaction(value);
            System.out.println("The transaction was successfully completed.");
        } else {
            System.out.printf("The customer %s doesn't exist.%n", name);
        }
    }

    public void printData(String name){
        var c = checkCustomer(name);
        if (c != null){
            System.out.println("Customer name: " + c.getName());
            System.out.println("The transactions:");
            for (var transaction : c.getTransactions()){
                System.out.printf("$ %.2f%n", transaction);
            }
        }
    }
}
