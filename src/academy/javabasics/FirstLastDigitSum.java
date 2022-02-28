package academy.javabasics;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int lastNum = number % 10;

        while (number > 9) {
            number /= 10;
        }
        return lastNum + number;
    }

    public static int sumFirstAndLastDigit2(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            // This will provide the first digit at the last run of the loop
            firstDigit = number % 10;
            number /= 10;
        }
        return lastDigit + firstDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
}
