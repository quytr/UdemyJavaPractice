package academy.javabasics;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(29);
        checkNumber(-5);
        checkNumber(0);
    }

    public static void checkNumber(int number){
        if(number >0){
            System.out.println(number + " is positive number");
        }else if(number < 0){
            System.out.println(number + " is negative number");
        }else{
            System.out.println(number + " is zero");
        }
    }


}
