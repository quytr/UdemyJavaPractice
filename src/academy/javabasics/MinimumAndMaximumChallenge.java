package academy.javabasics;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while (true) {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > maxNum) {
                    maxNum = number;
                }
                if (number < minNum) {
                    minNum = number;
                }
            } else {
                break;
            }
        }
        System.out.println("Maximum number = " + maxNum);
        System.out.println("Minimum number = " + minNum);

    }
}
