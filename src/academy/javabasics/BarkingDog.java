package academy.javabasics;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(shouldWakeUp(true, 23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking){
            if(hourOfDay <8  && hourOfDay >= 0 || hourOfDay >22 && hourOfDay < 24){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }



    }
}
