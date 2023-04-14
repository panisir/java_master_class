package f_oop_part_two.b_encapsulation.challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ( tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) < 0){
            System.out.println("Toner level should be in the range of 0 - 100 inclusive");
            return -1;
        }
        System.out.println("Toner amount increased from " + tonerLevel +" to " + (tonerLevel + tonerAmount));
        return tonerLevel + tonerAmount;
    }

    public int printPages(int pages){
        System.out.println("Number of " + pages + " printed");
        if(duplex) {
            System.out.println("This is a duplex printer");
        }
        pagesPrinted += pages;
        return pagesPrinted;
    }

}
