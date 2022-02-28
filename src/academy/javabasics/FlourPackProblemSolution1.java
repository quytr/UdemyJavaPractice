package academy.javabasics;

public class FlourPackProblemSolution1 {

    /*
    Performant solution for FlourPacker - Eddie

    Here is the pseudocode logic and 3 things that you need to test.

    1. Validation of the parameter values

    2. Determine the number of bigCount to use (all of it, or just a fraction of it).

    3. Determine if after subtracting the bigCount kilos of flour,
    do we have enough smallCount to fill the rest of the order.

    Here is the solution using a ternary operator to determine the bigCountToUse.
     */

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) { // #1 validation
            return false;
        }

        int bigCountToUse = bigCount < goal / 5 ? bigCount : goal / 5; // #2 determine how many bigCount to use
        return (goal - bigCountToUse * 5) <= smallCount; // #3 evaluate if enough smallCount to fill the rest of the order
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));


    }

}
