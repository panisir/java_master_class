package f_oop_part_two.a_composition.challenge;

public class CoffeeMaker extends Appliance {

    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee() {
        if (super.isHasWorkToDo()) {
            System.out.println("Coffee Brewed");
            super.setHasWorkToDo(false);
        }
    }
}
