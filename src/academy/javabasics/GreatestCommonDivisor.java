package academy.javabasics;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int remainder = 0;
        if (first > second) {
            for (int i = 1; i <= first; i++) {
                if (first % i == 0 && second % i == 0) {
                    remainder = i;
                }
            }
        }else if(second > first){
            for (int i = 1; i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    remainder = i;
                }
            }
        }

        return remainder;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));


    }

}
