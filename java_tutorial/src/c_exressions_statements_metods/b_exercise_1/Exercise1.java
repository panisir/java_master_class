package c_exressions_statements_metods.b_exercise_1;

public class Exercise1 {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int remainderKiloBytes = kiloBytes % 1024;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        String message = kiloBytes + " KB" + " = " + megaBytes + " MB";

        if(remainderKiloBytes >= 0) {
            message = " " + message + " And " + remainderKiloBytes + " KB";
        }

        System.out.println(message);
    }
}
