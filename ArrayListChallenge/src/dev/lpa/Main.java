package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList<String> groceries = new ArrayList<>();
        do {
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown;");
            System.out.println("1 - to add item(s) to list (comma delimited list);");
            System.out.println("2 - to remove any items (comma delimited list);");
            System.out.print("Enter a number for which action you want to do: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> addItem(groceries);
                case 2 -> removeItem(groceries);
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println("The current list: " + groceries);
            System.out.println();
        }while(choice != 0);
    }

    private static void addItem(ArrayList<String> grocery){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the list of items that you want to add (delimited by comma): ");
        String[] items = sc.nextLine().split(",");

        for (String item : items){
            if(checkItem(grocery, item)){
                System.out.printf("This %s is already in the list%n", item);
            }
            else{
                grocery.add(item.trim());
            }
        }
    }

    private static void removeItem(ArrayList<String> grocery){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the list of items that you want to delete (delimited by comma): ");
        String[] items = sc.nextLine().split(",");

        for (String item : items){
            if(checkItem(grocery, item)){
                grocery.remove(item.trim());
            }
            else{
                System.out.printf("This %s isn't at list%n", item);
            }
        }
    }

    private static boolean checkItem(ArrayList<String> grocery, String item){
        return grocery.contains(item.trim());
    }
}
