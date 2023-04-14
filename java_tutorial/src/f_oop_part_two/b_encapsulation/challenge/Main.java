package f_oop_part_two.b_encapsulation.challenge;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
         int tonerLevel = printer.addToner(48);
         int totalPrintedPages = printer.printPages(4);

        System.out.println("Toner level: " + tonerLevel);
        System.out.println("Total printed pages : " + totalPrintedPages);

        tonerLevel = printer.addToner(-30);
        totalPrintedPages = printer.printPages(9);

        System.out.println("Toner level: " + tonerLevel);
        System.out.println("Total printed pages : " + totalPrintedPages);
    }
}
