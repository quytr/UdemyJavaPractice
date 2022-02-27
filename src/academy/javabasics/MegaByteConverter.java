package academy.javabasics;

public class MegaByteConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-5000);
        printMegaBytesAndKiloBytes(3000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megaBytes = (kiloBytes / 1024);

        int remainder = kiloBytes % 1024;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB" );
        }

    }
}
