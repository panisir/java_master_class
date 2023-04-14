package g_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class AChallengeOne {
    public static void main(String[] args) {
        int[] intArr = new int[11];
        Random random = new Random();
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = random.nextInt(0, 100);
        }
        System.out.println("Unsorted Array : " + Arrays.toString(intArr));

        Arrays.sort(intArr);
        System.out.println("ASC Sorted Array : " + Arrays.toString(intArr));

        int[] descSortedArr = sortArrayDescending(Arrays.copyOf(intArr, intArr.length));
        System.out.println("DESC Sorted Array : " + Arrays.toString(descSortedArr));

        Arrays.sort(descSortedArr);
        System.out.println("DESC Resorted Array : " + Arrays.toString(descSortedArr));

        double[] dArr = new double[10];
        System.out.println("Double Array : " + Arrays.toString(dArr));
    }

    public static int[] sortArrayDescending(int[] ascSortedArr){
        int startCount = 0;
        int endCount = ascSortedArr.length - 1;
        int temp;
        while(endCount >= ascSortedArr.length / 2){
            temp = ascSortedArr[endCount];
            ascSortedArr[endCount] = ascSortedArr[startCount];
            ascSortedArr[startCount] = temp;
            endCount --;
            startCount++;
        }

        return ascSortedArr;
    }
}
