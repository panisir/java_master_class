package c_exressions_statements_metods.f_method_overloading;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 65));
    }

    public static String getDurationString(int seconds){
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes,  remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s"; // XXh YYm ZZs
    }
}
