package academy.javabasics;

public class WhileStatement {

    public static boolean isEvenNumber(int number){
        return number%2==0 ? true : false;
    }

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound =0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if(evenNumbersFound >=5){
                break;
            }

        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

        int count = 1;
        while(count!=6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true){
            if(count ==6){
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;

        }while(count!=6);



    }
}
