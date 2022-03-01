package academy.javabasics;

import java.util.Scanner;

public class InputCalculator2 {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                // scanner.nextLine(); // this is not necessary!
                sum += number;
                count++;
            }else{
                // scanner.nextLine(); // this is not necessary!
                break;
            }
            // scanner.nextLine();
            // this tells the program, that the user hit the return key
            // and is done with the input for an integer that was assigned to number in line 13
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
