package c_exressions_statements_metods;

public class MinutesToYears {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
        }

        int hours = (int) minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int finalDays = days % 365;

        System.out.println(minutes + " min = " + years + "y and " + finalDays +"d");
    }
}
