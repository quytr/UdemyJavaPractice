package academy.javabasics;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double numb1, double numb2){
        int castNumb1 = (int) (numb1*1000);
        int castNumb2 = (int) (numb2*1000);

        System.out.println(castNumb1 + ", " + castNumb2);


        if (castNumb1 == castNumb2){
            return true;
        }else{
            return false;
        }
    }
}
