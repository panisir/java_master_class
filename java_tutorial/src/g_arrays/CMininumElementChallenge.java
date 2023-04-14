package g_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CMininumElementChallenge {
    public static void main(String[] args) {
        int min = findMin(readIntegersAllInOne());
        System.out.println(min);
    }

    public static int[] readIntegersOneByOne(int... intArgs) {
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[5];
        int count = 0;
        while(count < intArr.length){
            intArr[count] = Integer.parseInt(scanner.nextLine());
            count++;
        }
        return intArr;
    }

    public static int[] readIntegersAllInOne(int... intArgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list of integers separated by comma");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        int count = 0;
        for(String split : splits) {
            values[count] = Integer.parseInt(split.trim());
            count++;
        }
        return values;
    }

    public static int findMin(int[] intArr) {
        int min = Integer.MAX_VALUE;
        for(int i : intArr){
            if(i < min){
                min = i;
            }
        }

        return min;
    }
}
