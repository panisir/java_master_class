package c_exressions_statements_metods.d_decimal_equal;

public class DecimalEqual {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.176,3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces (double d1, double d2){
        // Operator Precedence And using parenthesis are so important here !!!
        int rounded1 = (int) (d1 * 1000);
        int rounded2 = (int) (d2 * 1000);
        if(rounded1 == rounded2) {
            return true;
        }
        return false;
    }
}
