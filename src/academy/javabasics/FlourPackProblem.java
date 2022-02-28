package academy.javabasics;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if ((bigCount * 5) + smallCount < goal) return false;
        if (bigCount == 0) { // revision, this is actually not needed
            if (smallCount >= goal) return true;
        }
        int remainderOfBig = goal % 5;
        return (smallCount >= remainderOfBig);
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
