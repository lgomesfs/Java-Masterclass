package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        LinkedList<Town> placesToVisit = new LinkedList<>();

        placesToVisit.add(new Town("Sydney", 0)); //1
        placesToVisit.add(new Town("Adelaide", 1374)); //4
        placesToVisit.add(new Town("Alice Springs", 2771)); //5
        placesToVisit.add(new Town("Brisbane", 917)); //3
        placesToVisit.add(new Town("Darwin", 3972)); //7
        placesToVisit.add(new Town("Melbourne", 877)); //2
        placesToVisit.add(new Town("Perth", 3923)); //6

//        placesToVisit.sort(Comparator.comparingInt(Town::getDistanceFromSidney));
        orderList(placesToVisit);

        int index = 0;

        while (flag) {
            printInfo();
            String option = sc.nextLine();
            char charOption = option.toUpperCase().charAt(0);
            switch (charOption) {
                case 'F', 'B' -> index = movePlace(placesToVisit, charOption, index);
                case 'L' -> printList(placesToVisit);
                case 'M' -> printInfo();
                default -> flag = false;
            }
        }

        sc.close();
    }

    private static void printInfo() {
        System.out.println("Available actions (select word or letter):");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }

    private static int movePlace(LinkedList<Town> list, char choice, int index) {
        var iterator = list.listIterator(index);
        if (choice == 'F') {
            if (iterator.hasNext()) {
                System.out.printf("The next destination is %s%n", iterator.next().getTownName());
                index = iterator.nextIndex();
            } else {
                System.out.println("You reached the end of the travelling! Time to go back!");
            }
        }
        if (choice == 'B') {
            if (iterator.hasPrevious()) {
                System.out.printf("You are backing to %s%n", iterator.previous().getTownName());
                index = iterator.previousIndex();
            } else {
                System.out.println("You are at Sydney, try to move forward to the next city!");
            }
        }
        return index;
    }

    private static void printList(LinkedList<Town> list) {
        System.out.println("The list of places to visit are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d -> %s%n", (i + 1), list.get(i).getTownName());
        }
    }

    private static void orderList(LinkedList<Town> list) {
        for (int i = 1; i < list.size(); i++) {
            Town currentTown = list.get(i);
            int insertIndex = i;

            while (insertIndex > 0 &&
                    list.get(insertIndex - 1).getDistanceFromSidney() > currentTown.getDistanceFromSidney()){
                insertIndex--;
            }

            if (insertIndex != i){
                list.remove(i);
                list.add(insertIndex,currentTown);
            }
        }
    }
}


