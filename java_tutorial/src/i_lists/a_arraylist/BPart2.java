package i_lists.a_arraylist;

import java.util.ArrayList;
import java.util.List;

public class BPart2 {
    public static void main(String[] args) {
        System.out.println("-----------------CONVERT ARRAY TO LIST-------------------------");
        /**
         * CONVERT ARRAY TO LIST
         *
         * With the static factory method of list
         * List.of(...)
         *
         * */

        String[] items = {"Apple", "Banana", "Orange"};
        List<String> itemList = List.of(items);
        System.out.println(itemList);

        System.out.println("-----------------IMMUTABLE LIST-------------------------");
        /**
         * The code below prints out
         * // it prints out java.util.ImmutableCollections$ListN
         *
         * So it means it is an immutable list.
         * If we try to add new items it will give error.
         * */
        System.out.println(itemList.getClass().getName());
        // itemList.add("onion"); gives error

        System.out.println("-----------------MAKE MUTABLE-------------------------");
        /**
         * To mutate we need to make the list mutable first
         * */
        ArrayList<String> groceries = new ArrayList<>(itemList);
        groceries.add("union");
        System.out.println(groceries);

        System.out.println("-----------------ONE WAY TO CREATE AN ARRAYLIST-------------------------");
        /**
         * A way to create an ArrayList
         * and populate it with small array
         * */
        ArrayList<String> nextGroceries = new ArrayList<>(
                List.of("pickes", "mustard", "cheese")
        );
        System.out.println(nextGroceries);

        System.out.println("-----------------ADD MULTIPLE ITEMS TO ARRAYLIST-------------------------");
        groceries.addAll(nextGroceries);
        System.out.println(groceries);

    }
}
