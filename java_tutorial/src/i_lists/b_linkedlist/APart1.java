package i_lists.b_linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class APart1 {

    /**
     * NOT INDEXED
     * LinkedList is not indexed at all.
     * */

    /**
     * NO NEAT ORDER
     * There is no array, storing the items in a neat ordered way
     * as we saw with the ArrayList
     * */

    /**
     * CHAIN
     * Each element in a linked list
     * forms a chain.
     *
     * And the chain has links to previous element
     * and the next element.
     *
     * (PREV) <-- (OUR_ITEM) --> (NEXT)
     * This architecture is called doubly linked list.
     * */

    /**
     * The array list is usually default choice for a list
     * if you use predominantly for storing and reading data
     * <p>
     * If you know the maximum capacity, The arraylist
     * is better to use BUT SET IT'S CAPACITY
     */

    public static void main(String[] args) {
        LinkedList<String> llFamily = new LinkedList<>();
        addMoreElements(llFamily);
        System.out.println(llFamily);

        // removeElements(llFamily);
        // System.out.println(llFamily);

        // getElements(llFamily);

        // printItineraryWithEnhancedLoop(llFamily);

        printItineraryWithIterator(llFamily);
    }

    public static void addMoreElements(LinkedList<String> ll) {
        /** List Methods */
        ll.addFirst("Melih");
        ll.addLast("Neslihan");

        /**Queue Methods */
        ll.offer("İsmail");
        ll.offerFirst("Leman");
        ll.offerLast("Melek");
        ll.offerLast("Harun");

        /** Stack Methods */
        ll.push("Burak Efe");
    }

    public static void removeElements(LinkedList<String> ll) {
        System.out.println(ll);
        String removed = ll.remove(4);
        System.out.println(removed + " was removed");

        System.out.println(ll);
        ll.remove("Harun");
        System.out.println("Harun" + " was removed");

        System.out.println(ll);
        removed = ll.remove(); // removes first element
        System.out.println(removed + " was removed");

        System.out.println(ll);
        String popped = ll.pop();
        System.out.println(popped + " was popped out");

        /** Queue/Deque Methods */
        System.out.println(ll);
        String polled = ll.poll();
        System.out.println(polled + " was polled");
    }

    public static void getElements(LinkedList<String> list) {
        System.out.println("Element with list.get(4) : " + list.get(4));
        System.out.println("Element with list.getFirst : " + list.getFirst());
        System.out.println("Element with list.getLast() : " + list.getLast());
        System.out.println("Darwin index with list.indexOf(\"Leman\") : " + list.indexOf("Leman"));
        System.out.println("Darwin index with list.indexOf(\"İsmail\") : " + list.indexOf("İsmail"));

        /** Queue retrieval method */
        System.out.println("Element from element() : " + list.element());

        /** Stack retrieval methods */
        System.out.println("Element from peek() : " + list.peek());
    }

    public static void printItineraryWithEnhancedLoop(LinkedList<String> ll) {
        System.out.println("Family Game starts at : " + ll.getFirst());
        String previous = ll.getFirst();
        for (String member : ll) {
            System.out.println("--> From : " + previous + " to " + member);
            previous = member;
        }
        System.out.println("Trip ends at " + ll.getLast());
    }

    public static void printItineraryWithIterator(LinkedList<String> list) {
        System.out.println("Family Game starts at : " + list.getFirst());
        String previous = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var member = iterator.next();
            System.out.println("--> From : " + previous + " to " + member);
            previous = member;
        }
        System.out.println("Trip ends at : " + list.getLast());
    }
}