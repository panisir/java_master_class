package e_oop_part_one.d_records;

public class Main {
    public static void main(String[] args) {
        for(int i=1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, null, null);
            // System.out.println(s.name() + " -> " + s.id());
            System.out.println(String.valueOf(s));
        }
    }
}
