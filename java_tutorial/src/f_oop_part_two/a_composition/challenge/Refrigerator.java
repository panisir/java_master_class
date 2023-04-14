package f_oop_part_two.a_composition.challenge;

public class Refrigerator extends Appliance {

    public Refrigerator() {
    }

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood() {
        if (super.isHasWorkToDo()) {
            System.out.println("Food ordered");
            super.setHasWorkToDo(false);
        }

    }
}
