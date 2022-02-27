package academy.javabasics;

public class OperatorChallenge {

    public static void main(String[] args) {

        double numb1 = 20.00;

        double numb2 = 80.00;

        double totalNumb = (numb1 + numb2) * 100.00;

        System.out.println("My values total is " + totalNumb);

        double modNumb = totalNumb % 40.00;

        System.out.println("My remainder is " + modNumb);

        boolean isNoRemainder = true ? modNumb == 0 : modNumb != 0;  // (modNumb == 2) ? true : false;

        System.out.println("Is there no remainder? " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }


    }
}
