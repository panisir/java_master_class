package b_intellij_basics.c_equals_operator;

public class EqualsOperator {

    /**
     * Let's see Assignment operator VS Equals Operator */
    public static void main(String[] args) {
        int newValue = 50;
        if(newValue  == 50){
            System.out.println("This is an error");
        }

        boolean isBus = false;

        /**
         * NOTE: if we use assignment operator
         * to check equavalance it will compile
         * the first code block
         *
         * Instead, use '==' operator
         * * */
        if(isBus = true){
            System.out.println("This is a bus");
        }else {
            System.out.println("This is not a bus");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is a car");
        }else {
            System.out.println("This is not a car");
        }

    }
}
