package academy.javabasics;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        /*
        1 hour = 60 minutes;
        1 day = 24 hours = 1440 minutes;
        1 year = 365 days = 525,600 minutes;
         */
        if(minutes <0){
            System.out.println("Invalid Value");
        }else{
            int years = (int) minutes /525600;
            int days = (int) (minutes%525600) / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

    public static void main(String[] args) {
        printYearsAndDays(525_600);
        printYearsAndDays(1_051_200);
        printYearsAndDays(561600);
        printYearsAndDays(-525600);


    }
}
