package f_oop_part_two.a_composition.challenge;

public class DishWasher extends Appliance {
    public DishWasher() {
    }

    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(){
        if(super.isHasWorkToDo()){
            System.out.println("Dishes Done");
            super.setHasWorkToDo(false);
        }
    }
}
