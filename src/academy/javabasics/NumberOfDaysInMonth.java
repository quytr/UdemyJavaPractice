package academy.javabasics;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

//        return (year<1||year>=9999) ? false: ((year%4==0)&&(year%100!=0))||(year%400==0);

        if (year >= 1 && year <= 9999) {
            return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? true : false;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {

//        return ((month<1)||(month>12)||(year<1)||(year>9999))? -1: (isLeapYear(year)&&month==2)? 29: (month==11 || month==4 || month==6 || month==9)? 30: (month==2)? 28: 31;

        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    days = isLeapYear(year) ? 29 : 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }

        }
        return days;
    }


    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}