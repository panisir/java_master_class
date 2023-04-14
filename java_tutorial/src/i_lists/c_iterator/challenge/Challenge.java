package i_lists.c_iterator.challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        addPlace(new Place("Balıkesir", 0), places);
        addPlace(new Place("İzmir", 250), places);
        addPlace(new Place("Çanakkale", 290), places);
        addPlace(new Place("Aydın", 360), places);
        addPlace(new Place("Muğla", 400), places);

        application(places);
    }

    public static void addPlace(Place place, LinkedList<Place> places) {
        places.add(place);
    }

    private static void listPlaces(LinkedList<Place> ll) {
        ListIterator<Place> li = ll.listIterator();
        while (li.hasNext()) {
            // System.out.println(li.next());
            Place p = li.next();
            System.out.println(p.getName() + "(" + p.getDistance() + ")");
        }
    }

    public static void printMenu() {
        System.out.println("Available Actions(Select word or letter) : ");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(W)here Am I ?");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");
    }

    public static void application(LinkedList<Place> ll) {
        ListIterator<Place> li = ll.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        printMenu();
        while (!quit) {
            if (!li.hasPrevious()) {
                System.out.println("Current index: " + (li.previousIndex() + 1));
                System.out.println("Start Place : " + li.next());
                forward = true;
            }
            if (!li.hasNext()) {
                System.out.println("Current index: " + (li.nextIndex() - 1));
                System.out.println("Final Place : " + li.previous());
                forward = false;
            }

            System.out.printf("Option : ");
            String selectedOption = scanner.nextLine();
            selectedOption = selectedOption.replaceAll("\\s", "");

            switch (selectedOption.toLowerCase().substring(0, 1)) {
                case "f": {
                    if(!forward){
                        li.next();
                        forward = true;
                    }
                    if (li.hasNext()) {
                        System.out.println(li.next());
                    }
                    break;
                }
                case "b": {
                    if(forward){
                        li.previous();
                        forward = false;
                    }
                    if (li.hasPrevious()) {
                        System.out.println(li.previous());
                    }
                    break;
                }
                case "l": {
                    listPlaces(ll);
                    break;
                }
                default: {
                    quit = true;
                    break;
                }
            }
        }
    }
}
