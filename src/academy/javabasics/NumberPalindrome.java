package academy.javabasics;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int originNumber = number;

        while (number > 0) {

            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originNumber == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123456));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(112211));


    }
}

