package academy.javabasics;

public class ParsingValuesFromString {

    public static void main(String[] args) {

        String numAsString = "2018";
        System.out.println("number as string = " + numAsString);

        int number = Integer.parseInt(numAsString);
        double number2 = Double.parseDouble(numAsString);
        System.out.println("number = " + number);
        System.out.println("number as double " + number2);

        numAsString += 1;
        number +=1;
        number2 +=1;

        System.out.println("number as string = " + numAsString);
        System.out.println("number = " + number);
        System.out.println("number as double = "  + number2);
    }
}
