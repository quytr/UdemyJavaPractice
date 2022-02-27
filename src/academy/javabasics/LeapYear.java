package academy.javabasics;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(-1982));

    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
