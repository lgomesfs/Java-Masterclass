public class Main {

    public static void main(String[] args) {
//        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
//        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");
//        System.out.println("5 is " + (isPrime(5) ? "" : "NOT ") + "a prime number");
//
//        for (int i = 0; i<=1000; i++){
//            if(isPrime(i)){
//                System.out.println(i + " is a prime number");
//            }
//        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i<=1000; i++){
            if(i%3 == 0 && i%5 == 0){
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");
                count++;
                if (count == 5){
                    break;
                }

            }
        }

        System.out.println("The sum of number was " + sum);
    }

//    public static boolean isPrime(int wholeNumber){
//        if (wholeNumber <= 2){
//            return wholeNumber==2;
//        }
//
//        for (int divisor = 2; divisor < wholeNumber / 2; divisor++){
//            if(wholeNumber % divisor == 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
}
