package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = createRandomArray(10);

        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);

        int[] sortedArray = new int[firstArray.length];

        int j = firstArray.length - 1;

        for(int i = 0; i < firstArray.length; i++){
            sortedArray[j - i] = firstArray[i];
        }

        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] createRandomArray(int len){
        Random random = new Random();
        int[] intArray = new int[len];

        for (int i = 0; i < len; i++){
            intArray[i] = random.nextInt(100);
        }

        return intArray;
    }
}
