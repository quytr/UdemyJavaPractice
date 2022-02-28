package academy.javabasics;

public class PerfectNumber2 {
    /*
    1) We only need to loop until i <= number / 2. We can exit the loop then.

       2) If the number is odd, we can increment i by +2 each loop iteration to skip unnecessary numbers.
     */

    public static boolean isPerfectNumber(int number) {

        int sumOfProperDivisors = 0;
        int increment = (number % 2 == 0) ? 1 : 2;

        for (int i = 1; i <= number / 2; i += increment)
            if (number % i == 0)
                sumOfProperDivisors += i;

        return sumOfProperDivisors == number && number > 1;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
