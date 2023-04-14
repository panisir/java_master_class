package g_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] intArr = takeIntegersFromInput();
        int[] reversedArray = reverseArray(intArr);
        System.out.println(Arrays.toString(reversedArray));
    }

    private static int[] reverseArray(int[] arr) {
        int[] arrToSort = Arrays.copyOf(arr, arr.length);
        int startIndex = 0;
        int endIndex = arrToSort.length - 1;
        while (endIndex > (arrToSort.length / 2) - 1) {
            int temp = 0;
            temp = arrToSort[endIndex];
            arrToSort[endIndex] = arrToSort[startIndex];
            arrToSort[startIndex] = temp;
            startIndex++;
            endIndex--;
        }

        return arrToSort;
    }

    private static int[] takeIntegersFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integers separated by comma");
        String string = scanner.nextLine();
        String[] splits = string.split(",");
        int[] intArr = new int[splits.length];
        int count = 0;
        for (String split : string.split(",")) {
            intArr[count] = Integer.parseInt(split.trim());
            count++;
        }
        return intArr;
    }
}
