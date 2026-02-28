import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isANumber = true;

        while(isANumber){
            System.out.println("Enter any number or any char to quit.");
            String number = sc.nextLine();
            try{
                int n = Integer.parseInt(number);
                min = ((min == 0) ||(n < min)) ? n : min;
                max = ((max == 0) || (max < n)) ? n : max;
            } catch (NumberFormatException nfe){
                isANumber = false;
            }
        }
        System.out.println("MIN: " + min + " MAX: " + max);
    }
}
