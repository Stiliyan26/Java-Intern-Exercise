package ExpressionsAndStatements.Overload;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        //System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds){
//        int hours = seconds / 3600;
//        int minutes = (seconds - hours * 3600) / 60;
//        int secondsRemaining = seconds - (hours * 3600 + minutes * 60);
//
//        String result = hours + "h " + minutes + "m " + secondsRemaining + "s";
        int minutes = seconds / 60;

        return  getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int secondsRemaining = seconds % 60;

        String result = hours + "h " + remainingMinutes + "m " + secondsRemaining + "s";

        return result;
    }
}
