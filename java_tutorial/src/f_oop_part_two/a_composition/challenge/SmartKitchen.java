package f_oop_part_two.a_composition.challenge;

public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        this(new Refrigerator(false), new DishWasher(false), new CoffeeMaker(false));
    }

    public SmartKitchen(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void addWater() {
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void orderFood() {
        refrigerator.orderFood();
    }

    public void doDished() {
        dishWasher.doDishes();
    }

    public void brewCoffee() {
        coffeeMaker.brewCoffee();
    }


}
