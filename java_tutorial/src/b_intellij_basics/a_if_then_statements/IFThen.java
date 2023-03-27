package b_intellij_basics.a_if_then_statements;

public class IFThen {
    public static void main(String[] args) {
        boolean isAlien = true;
        boolean isHuman = false;

        if(!isAlien){
            System.out.println("It is not an alien");
        }else {
            System.out.println("It is an alien");
        }

        if(isHuman == true){
            System.out.println("It's a human");
        }else {
            System.out.println("It's not a human");
        }
    }
}
