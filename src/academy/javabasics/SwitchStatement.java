package academy.javabasics;

public class SwitchStatement {
    public static void main(String[] args) {
        char letter = 'A';


        switch (letter){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(letter + " was found");
                break;
            default:
                System.out.println("not found");
        }


    }
}
