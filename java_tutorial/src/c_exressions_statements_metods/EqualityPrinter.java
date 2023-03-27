package c_exressions_statements_metods;

public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,2,1);
    }
    public static void printEqual(int n1, int n2, int n3){

        if((n1 < 0) || (n2 < 0) || (n3 < 0) ){
            System.out.println("Invalid Value");
            return;
        }

        if(n1 == n2 && n2 == n3){
            System.out.println("All numbers are equal");
            return;
        } else if(n1 == n2 || n2 == n3 || n1 == n3){
            System.out.println("Neither all are equal or different");
            return;
        }

        System.out.println("All numbers are different");
    }
}


