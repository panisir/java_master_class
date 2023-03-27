package c_exressions_statements_metods.f_method_overloading;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }
    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54d;
    }

    public static double convertToCentimeters(int heightInFeet, int reminderHeightInInches){
        return (heightInFeet * 12 + reminderHeightInInches) * 2.54d;
    }

}
