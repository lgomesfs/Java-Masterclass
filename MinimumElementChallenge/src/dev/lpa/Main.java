package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] Diego = readIntegers();

        System.out.println(Arrays.toString(Diego));

        int min = findMin(Diego);
        System.out.println(min);

        reverse(Diego);
        System.out.println(Arrays.toString(Diego));
    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a list of number divided by comma: ");
        String[] numbersList = sc.nextLine().split(",");
        int[] numbers = new int[numbersList.length];
        for(int i = 0; i < numbersList.length; i++){
            numbers[i] = Integer.parseInt(numbersList[i]);
        }

        return numbers;
    }

    private static int findMin(int[] numbers){
        int min = numbers[0];
        for (int n : numbers){
            min = (n < min ? n:min);
        }
        return min;
    }

    private static void reverse(int[] numbers){
        int temp = 0;
        int len = numbers.length - 1;
        for (int i = 0; i < numbers.length/2; i++){
            temp = numbers[i];
            numbers[i] = numbers[len - i];
            numbers[len - i] = temp;
        }
    }
}
