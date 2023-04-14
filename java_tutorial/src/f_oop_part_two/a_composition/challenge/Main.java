package f_oop_part_two.a_composition.challenge;

public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.addWater();
        smartKitchen.loadDishWasher();
        smartKitchen.pourMilk();

        smartKitchen.doDished();
        smartKitchen.brewCoffee();
        smartKitchen.orderFood();

        smartKitchen.doDished();
        smartKitchen.brewCoffee();
        smartKitchen.orderFood();
    }
}
