package i_lists.a_arraylist;

import java.util.ArrayList;
import java.util.List;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    }
}

public class APart1 {

    /**
     * We saw arrays.
     * Arrays are mutable but not resizable.
     * We have collections and list for that.
     * For arrays we have an enhanced version is ArrayList
     * ArrayList are resizable.
     * And of course much more advanced feature it has.
     */

    public static void main(String[] args) {
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("orange", "PRODUCE", 5);
        groceryItems[1] = new GroceryItem("lemonade", "PRODUCE", 4);
        // groceryItems[2] = "biscuit"; gives error type is different
        groceryItems[2] = new GroceryItem("biscuit", "PRODUCE", 2);
        // groceryItems[3] = new GroceryItem("sugar powder", "PRODUCE", 1); gives error index bound

        // -------------------
        /**
         * '<>' this is the diamond operator
         * in Java we use it to infer the type
         * */
        ArrayList<GroceryItem> groceryItemArrayList = new ArrayList<>();
        // ArrayList groceryItemArrayList = new ArrayList();
        groceryItemArrayList.add(new GroceryItem("orange", "PRODUCE", 5));
        groceryItemArrayList.add(new GroceryItem("lemonade", "PRODUCE", 4));
        // groceryItemArrayList.add("Biscuit");
        System.out.println(groceryItemArrayList);

        /**
         * ADD ITEMS WITH OR WITHOUT INDEX
         * As we see in the examples below
         * We can add a new element to the index we want directly
         * */
        groceryItemArrayList.add(0, new GroceryItem("apple", "PRODUCE", 3));
        System.out.println(groceryItemArrayList);
        groceryItemArrayList.add(1, new GroceryItem("banana", "PRODUCE", 7));
        System.out.println(groceryItemArrayList);
        groceryItemArrayList.add(new GroceryItem("onion", "PRODUCE", 2)); // will add to the end without index
        System.out.println(groceryItemArrayList);

        /**
         * REMOVE ITEMS
         * */
        groceryItemArrayList.remove(1); // it will remove bananas
        System.out.println(groceryItemArrayList);

    }


}
