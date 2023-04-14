package f_oop_part_two.a_composition.challenge;

public class Appliance {

    private boolean hasWorkToDo;

    public Appliance(){

    }

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }
}
