import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        while (count<=5){
            System.out.println("Enter number #" + count + ":");
            String number = sc.nextLine();
            try {
                double n = Double.parseDouble(number);
                if (n >= 0) {
                    count++;
                    sum += n;
                }
                else{
                    System.out.println("Only positive numbers are allowed");
                }
            } catch(NumberFormatException e){
                System.out.println("Enter a valid format of number");
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
