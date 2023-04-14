package g_arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr2D = new int[4][4];

        /**
         * Try to print out the whole 2d array
         * */
        System.out.println(Arrays.toString(arr2D));

        /**
         * Looping a 2d array in traditional way
         * */
        System.out.println("*".repeat(7) + "Looping a 2d array in traditional way" + "*".repeat(7));
        for (int i = 0; i < arr2D.length; i++) {
            var innerArray = arr2D[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*".repeat(7) + "Looping a 2d array with enhanced loop" + "*".repeat(7));
        /**
         * Looping a 2d array with enhanced loop
         * */
        for (int[] innerArr : arr2D) {
            for (int i : innerArr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("*".repeat(7) + "Looping a 2d array with java.util.Arrays" + "*".repeat(7));
        /**
         * Looping a 2d array with java.util.Arrays
         * */
        System.out.println(Arrays.deepToString(arr2D));

    }
}
