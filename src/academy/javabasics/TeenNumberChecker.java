package academy.javabasics;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int a, int b, int c){
        if((a <20 && a >12) || (b <20 && b >12) || (c<20 && c > 12)){
            return true;
        }else{
            return false;
        }

        //or:
        // return isTeen(a) || isTeen(b) || isTeen(c);

    }

    public static boolean isTeen(int d){
        return (d >12 && d <20);
    }
}
