package academy.javabasics;

public class ForLoopStatement {

    public static double calInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));

    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int count =0;

        for(int i = 10; i < 60; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }

        System.out.println("----------------------------");

        for(int i =2; i <9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calInterest(10000.0,i)));
        }

        System.out.println("------------------------------------");

        for(int i = 8; i >1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calInterest(10000.0,i)));
        }



    }
}
