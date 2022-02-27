package academy.javabasics;

public class SumOddRange {

    public static boolean isOdd(int number) {
        return number > 0 ? (number % 2 != 0 ? true : false) : false;

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end < start || start < 0 || end < 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            System.out.println(sum);
            return sum;
        }

    }

    public static void main(String[] args) {
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);


    }


}
