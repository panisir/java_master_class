package b_intellij_basics.d_ternary_operator;

public class TernaryOperator {

    /**
     * Condition ?: Operator
     *
     * Java calls it the Conditional Operator
     * has three operands
     *
     * Ternary operator is a shortcut to assigning one of two values
     * to a variable, depending on a given condition.
     *
     * operand1 ? operand2 : operand3
     *
     * The first condition(operand1) is always the condition test so boolen
     * and the others do not have to be booleans.
     * */

    public static void main(String[] args) {

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println(isDomestic);
    }
}
