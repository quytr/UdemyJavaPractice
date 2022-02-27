package academy.javabasics;

import javax.imageio.stream.ImageInputStream;

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        int hours = 0;
        String output = null;
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            if (minutes > 59) {
                hours = minutes / 60;
                minutes = minutes % 60;
            }
            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "m";
            if (minutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            output = hoursString + minutesString + secondsString;
        } else {
            output = "Invalid value";

        }
        return output;


    }

    public static String getDurationString(int seconds) {
        String output = null;
        int minutes = 0;
        if (seconds >= 0) {
            if (seconds > 59) {
                minutes = seconds / 60;
                seconds = seconds % 60;
            }
            output = minutes + "m" + seconds + "s";
        } else {
            output = "Invalid value";

        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(120, 50));
        System.out.println(getDurationString(20, 5));
        System.out.println(getDurationString(2, 8));
        System.out.println(getDurationString(152, 9));
        System.out.println(getDurationString(201, 56));


        System.out.println(getDurationString(122));
    }

}

