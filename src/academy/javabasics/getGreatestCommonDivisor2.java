package academy.javabasics;

public class getGreatestCommonDivisor2 {

    /*
    It's called Euclid's algorithm.
    Substracting larger number by small.
    Each time replacing larger number with the subtraction result
    Until getting 2 equal numbers which will be the greatest common divisor
     */

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));


    }

}
