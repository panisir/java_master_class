package f_oop_part_two.d_master_challenge;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addToppingsToBurger(2);
        meal.changeDrinkSize("Large");

        meal.printItemizedList();
        meal.printDueAmount();
    }
}
