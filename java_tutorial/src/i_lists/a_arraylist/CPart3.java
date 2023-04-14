package i_lists.a_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CPart3 {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>(
                List.of("apple", "banana", "orange", "yogurt", "eggs", "milk", "pickles", "mustard", "cheese")
        );
        System.out.println(groceries);
        System.out.println();

        /**
         * GETTING THE ITEM WITH INDEX
         * */
        System.out.println("----------GETTING THE ITEM WITH INDEX----------");
        System.out.println("Third Item = " + groceries.get(2));
        System.out.println();

        /**
         * SEARCHING FOR AN ITEM WITH 'contains' method
         * */
        System.out.println("----------SEARCHING FOR AN ITEM WITH----------");
        if(groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }
        System.out.println();

        /**
         * INDEX OF ITEMS
         * */
        System.out.println("----------INDEX OF ITEMS----------");
        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));
        System.out.println();

        /**
         * IF WE HAVE TWO SAME ELEMENT IN ARRAY
         * First one will be removed with the
         * remove operation
         * */
        System.out.println("----------REMOVE ITEM----------");
        groceries.remove("yogurt");
        System.out.println(groceries);
        System.out.println();

        /**
         * REMOVING ALL
         * */
        System.out.println("----------REMOVE MULTIPLE ITEMS----------");
        groceries.removeAll(List.of("apple", "yogurt"));
        System.out.println(groceries);
        System.out.println();

        /**
         * REMOVE ITEMS WITH RETAIN
         * retains the given ones and
         * removes rest
         * */
        System.out.println("----------RETAIN ITEMS----------");
        groceries.retainAll(List.of("milk", "cheese", "banana"));
        System.out.println(groceries);
        System.out.println();

        /**
         * CLEAR (EMPTY) WHOLE LIST
         * */
        System.out.println("----------CLEAR LIST----------");
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());
        System.out.println();

        /**
         * Arrays.asList(...)
         * We can produce list
         * with the Arrays method.
         * It's similar to List.of(...)
         * */
        System.out.println("----------PRODUCE LIST WITH ARRAYS class----------");
        groceries.addAll(List.of("apples", "milk", "mustard"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);
        System.out.println();

        /**
         * Sorting Lists with Comparator
         * */
        System.out.println("----------SORTING WITH COMPARATOR----------");
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
        System.out.println();

        /**
         * Another way to get a list
         * from an array with a different method
         * on ArrayList
         * */
        System.out.println("----------CREATE LIST WITH ARRAYLIST METHOD----------");
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
        System.out.println();

        /**
         * IMPORTANT NOTE WITH
         * Arrays.asList(...)
         *
         * If we create a ArrayList this way
         * after changes to arraylist
         * the first array also be affected by changes
         * */
        System.out.println("----------Arrays.list(...) changes----------");
        String[] array = new String[]{"item1", "item2", "item3"};
        System.out.println(Arrays.toString(array));
        var arrayList = Arrays.asList(array);
        System.out.println(arrayList);
        arrayList.set(0, "item0");
        System.out.println(arrayList);
        System.out.println(Arrays.toString(array));
        System.out.println();

        /**
         * CREATE ARRAY from ARRAYLIST
         * */
        System.out.println("----------CREATE ARRAY from ARRAYLIST----------");
        ArrayList<String> arrayList2 = new ArrayList<>(List.of("Item1", "Item2"));
        String[] array2 = arrayList2.toArray(new String[0]);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        /**
         * What if create an arraylist
         * with capacity of 10.
         * And decide to extend the array
         * */
        System.out.println("--------------Array Capacity Extending--------------------");
        ArrayList<Integer> integerArrayList = new ArrayList<>(5);
        integerArrayList.addAll(List.of(1,2,3,4,5));
        System.out.println("First capacity : " + integerArrayList.size());

        /**
         * After initial capacity is reached
         * Add operations costs more
         * in both *Memory and *time
         *
         * But the java language does not really specify
         * how it determines the new capacity.
         *
         * Big(0) Notation
         * If the list size has not been reached out yet,
         * the cost of add operation is O(1)
         *
         * But after the limit is reached
         * when we add new element to list
         * all the elements need to be copied in memory.
         * So this single add op. would have a maximum cost O(n)
         *
         * When we use index on arraylist operations
         * like add(index, item), remove(index)
         * */
        integerArrayList.add(6);
        System.out.println("Last capacity : " + integerArrayList.size());

        integerArrayList.add(2, 9);
        System.out.println("The last version of the arraylist : " + integerArrayList);
        System.out.println("Last capacity : " + integerArrayList.size());

        /**
         * After this point we'll move on with linked list in the next chapter.
         * */
    }
}
