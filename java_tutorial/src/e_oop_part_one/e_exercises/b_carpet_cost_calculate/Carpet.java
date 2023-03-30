package e_oop_part_one.e_exercises.b_carpet_cost_calculate;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0 ? 0: cost;
    }

    public double getCost(){
        return this.cost;
    }
}
