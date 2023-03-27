package d_control_flow.switches;

public class IReadingInput {

    /**
     *  java src/d_control_flow/switches/IReadingInput.java
     * */
    public static void main(String[] args) {
        System.out.println(getInputFromConsole(2021));
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your Name ");
        System.out.println("Hi " + name + " welcome to the course");
        return "";
    }
}
