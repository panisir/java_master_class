package i_lists.a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        ArrayList<String> itemList = new ArrayList<>();
        do {
            System.out.print("Enter 0 to exit\nEnter 1 to add\nEnter 2 to remove\n");
            System.out.print("Option: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    System.out.print("Item to Add : ");
                    String items = scanner.nextLine();
                    String trimmed =  items.replaceAll("\\s", "");
                    String[] split = trimmed.split(",");
                    itemList.addAll(List.of(split));
                    System.out.print(itemList);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Item to Remove : ");
                    String items = scanner.nextLine();
                    String trimmed =  items.replaceAll("\\s", "");
                    String[] split = trimmed.split(",");
                    itemList.removeAll(List.of(split));
                    System.out.print(itemList);
                    System.out.println();
                    break;
                }
                case 0: {
                    System.out.println(itemList);
                    System.out.println("Melo Out !!! BYE !!!!");
                    break;
                }
                default: {
                    System.out.print("Enter 0 to exit\nEnter 1 to add\nEnter 2 to remove\n");
                }
            }
        } while (option != 0);

    }
}
