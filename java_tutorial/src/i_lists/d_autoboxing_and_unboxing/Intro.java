package i_lists.d_autoboxing_and_unboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Intro {
    /**
     * Java supports primitive types.
     * Most of OOP languages does not support.
     * But sometimes primitives more efficient to store data.
     * <p>
     * But we can use primitives with ArrayList or LinkedList.
     * We must use Classes with them.
     * <p>
     * Using class and also getting benefits of primitives
     * Java provides wrapper classes.
     * <p>
     * And we can use wrappers with collections like Integer, Boolean etc.
     * <p>
     * We can go from a primitive to a wrapper, it is called 'BOXING'
     * We can go from a wrapper to a primitive, it is called 'UNBOXING'
     */
    public static void main(String[] args) {
        /** How do we box ?
         * Each wrapper has a static overloaded factory method
         * the valueOf()
         * which takes primitive and returns an instance of the wrapper class.
         * */
        Integer boxed = Integer.valueOf(15);

        /** Deprecated boxing using the wrapper constructor */
        /** Deprecated after JDK-9 */
        Integer boxed2 = new Integer(15);

        /** What is Autoboxing  */
        Integer boxed3 = 15;
        int unboxed = boxed3;

        ArrayList<Integer> intWrapperArray = new ArrayList<>();
        intWrapperArray.add(2);
        intWrapperArray.add(3);
        intWrapperArray.add(4);
        intWrapperArray.add(5);
        int[] intArr = new int[6];
        int count = 0;
        for (int intWrap : intWrapperArray) {
            intArr[count] = intWrap;
            count++;
        }
        System.out.println(Arrays.toString(intArr));

    }
}
