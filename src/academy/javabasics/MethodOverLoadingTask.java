package academy.javabasics;

public class MethodOverLoadingTask {

    public static double calcFeetAndInchesToCentimeters(double feet, double inch){

        if(feet >0 && inch >0 && inch <=12){
            double centimeter = (feet * 30.48) + (inch * 2.54);
            System.out.println(feet + " feet + " + inch + " inched = " + centimeter + " cm");
            return centimeter;
        }else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inch){
        if(inch >0){
            double feet = (int)inch/12;
            double remainder = inch%12;
            System.out.println(inch + " inches = " + feet + " feet and " + remainder + " inches");
            return feet;
        }else{
            System.out.println("Invalid inches parameter");
            return -1;
        }
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7,5);
        calcFeetAndInchesToCentimeters(0,10);
        calcFeetAndInchesToCentimeters(7,0);

        calcFeetAndInchesToCentimeters(100);

//        double number = (int)(105/12);
//        double number2 = (int)105%12;
//        double number3 = 105%12;
//        System.out.println(number);
//        System.out.println(number2);
//        System.out.println(number3);




    }


}
