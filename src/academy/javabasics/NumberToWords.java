package academy.javabasics;

public class NumberToWords {

    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
        }

        int reverseNum = reverse(number);

        for(int i = 0; i < getDigitCount(number);i++){
            switch (reverseNum%10){
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
            }
            reverseNum/=10;
        }

    }

    public static int reverse(int number){
        int reverseNum = 0;
        while(number !=0){
            reverseNum = reverseNum* 10 + number%10;
            number /= 10;
        }
        return reverseNum;

    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 1;
        while(number > 9){
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(100);





    }

}
