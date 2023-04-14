package f_oop_part_two.d_master_challenge;

public class Burger extends Product {
    private int toppings;

    public Burger() {
        this("Hamburger",
                5,
                "Small",
                "Standart",
                0);
    }

    public Burger(String type, int price, String size, int toppings) {
        this("Hamburger",
                type.equals("Deluxe") ? 20 : price,
                type.equals("Deluxe") ? "Large" : size,
                type,
                toppings);
    }

    public Burger(String name, double price, String size, String type, int toppings) {
        super(name, price, size, type);
        this.toppings = toppings;
    }

    public void addToppings(int toppings) {
        this.toppings = Math.min((this.toppings + toppings), 3);
        double extraPrice = 0.0;
        if (!super.getType().equals("Deluxe")) {
            extraPrice = 3 * toppings;
        }
        super.setPrice(super.getPrice() + extraPrice);
    }

    @Override
    public String toString() {
        return "Burger{" +
                "toppings=" + toppings +
                "} " + super.toString();
    }
}
