package i_lists.c_iterator;

import java.util.LinkedList;

public class Main {

    /**
     * We've mainly used for loops to traverse
     * or step through elements in an array or list
     *
     * Traditional loop for index to index
     * Enhanced loop step through elements one at a time
     *
     * BUT java provides other means to traverse lists.
     * */

    /**
     * TWO ALTERNATIVES
     * (1) Iterator
     * - It allows us to iterate list and modify
     * - iterator.remove()
     * - It iterates forward only
     * - only support remove method.
     * (2) ListIterator
     * - It allows us to iterate list and modify
     * - It iterates both forward and backwards.
     * - It supports remove, add, set methods
     */
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Balıkesir");
        cities.add("İzmir");
        cities.add("Bursa");
        // iteratorLoop(cities);
        listIteratorLoop(cities);

    }

    public static void iteratorLoop(LinkedList<String> list) {
        System.out.println(list);
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("İstanbul")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void listIteratorLoop(LinkedList<String> list) {
        System.out.println(list);
        var literator = list.listIterator(2);
        System.out.println("2nd element with list iterator : " + literator);
        System.out.println("previous of second list iterator : " + literator.previous());


        while (literator.hasNext()){
            System.out.println(literator.next());
        }
        while (literator.hasPrevious()){
            System.out.println(literator.previous());
        }
        System.out.println(list);
    }
}
