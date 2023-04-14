package a_ahackerrank.java_basics;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalChallenge {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                return i1.compareTo(i2);

            }
        };

        // Arrays.sort(s, 0, n, customComparator);
        Arrays.sort(s, 0, n, stringComparator.reversed());

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
