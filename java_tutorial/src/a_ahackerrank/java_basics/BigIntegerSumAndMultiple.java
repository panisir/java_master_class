package a_ahackerrank.java_basics;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSumAndMultiple {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = 2;
        BigInteger[] numbers = new BigInteger[2];
        for (int i = 0; i < n; i++) {
            numbers[i] = new BigInteger(sc.next());
        }

        BigInteger sum = new BigInteger(String.valueOf(0));
        BigInteger multiple = new BigInteger(String.valueOf(1));
        for (BigInteger b : numbers) {
            sum = sum.add(b);
            multiple = sum.multiply(b);
        }

        System.out.println(sum);
        System.out.println(multiple);

        sc.close();
    }
}
