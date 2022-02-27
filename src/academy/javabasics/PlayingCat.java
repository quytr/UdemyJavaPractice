package academy.javabasics;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

//        int upperLimit = summer ? 45 : 35;
//        return temperature >= 25 && temperature <= upperLimit;

        if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        } else if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }
}
