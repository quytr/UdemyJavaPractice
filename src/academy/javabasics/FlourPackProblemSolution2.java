package academy.javabasics;

public class FlourPackProblemSolution2 {

    /*
    Performant solution for FlourPacker - Eddie

    Here is the pseudocode logic and 3 things that you need to test.

    1. Validation of the parameter values

    2. Supply vs Demand: Test that the sum of kilos of flour for the bigCount and smallCount is
    greater than or equal to that of the goal.

    3. Final test, regardless of how many complete sets of bigCount,
    the remainder of the goal from dividing by 5 should be less than or equal to the smallCount.
    In another word, if only full only full bags of bigCount (i.e. 5) are used for the goal,
    then the remainder needs to be filled with sufficient amount of smallCount...i.e. (goal%5 <= smallCount) .

    Here is the most clear cut solution...very easy to read and understand, breaks out each testing conditions.
     */

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {  // #1 validation
            return false;
        }
        if (bigCount * 5 + smallCount < goal) { // #2 supply must be greater than demand
            return false;
        }
        return (goal % 5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
    }

    /*
    If you are still wondering about the final test condition here is the detailed explanation.

    return goal % 5 <= smallCount;
    This simply evaluates that remainder of goal divided by 5 must be less than or equal to smallCount,
    since it doesn't matter how many bigCounts you have to fill the order.

     */

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));


    }


}
