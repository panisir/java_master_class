package g_arrays;

import java.util.Arrays;

public class ReferenceTypesVsValueTypes {
    public static void main(String[] args) {

        /**
         * Since the array is an object in java
         * if we assign a variable to another
         * these two point at same memory slot.
         * It means they references of same resource.
         * And if we make a change using one of them
         * it affects same resource and the other reference
         * will affected
         *
         * See the example below
         * */
        int[] intArr = new int[] {0,1,2,3,4};
        int[] myIntArr = intArr;
        myIntArr[0] = 5;
        System.out.println("myIntArr : " + Arrays.toString(myIntArr));
        System.out.println("intArr : " + Arrays.toString(intArr));

        /**
         * So lets use Arrays.copyOf()
         * and see what happens
         *
         * As you see, the change in second array did not affect
         * the first one because copyOf method create a new and
         * separate resource in memory.
         * */
        int[] firstArr = new int[] {10, 11, 12 ,13};
        int[] secondArr = Arrays.copyOf(firstArr, firstArr.length);
        secondArr[0] = 9;
        System.out.println("First array : " + Arrays.toString(firstArr));
        System.out.println("Second array : " + Arrays.toString(secondArr));

    }
}
