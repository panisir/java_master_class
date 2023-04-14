package f_oop_part_two.d_master_challenge;

public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Meal() {
        this(new Burger(), new Drink(), new SideItem());
    }

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void changeDrinkSize(String size) {
        this.drink.changeSize(size);
    }

    public void addToppingsToBurger(int toppings) {
        this.burger.addToppings(toppings);
    }

    public void printItemizedList() {
        System.out.println("------ Order list ------");
        System.out.println(this.burger.toString());
        System.out.println(this.drink.toString());
        System.out.println(this.sideItem.toString());
    }

    public void printDueAmount() {
        System.out.println("Total Amount is : " +
                (this.burger.getPrice() + this.drink.getPrice() + this.sideItem.getPrice()));
    }
}
