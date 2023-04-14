package f_oop_part_two.d_master_challenge;

public class Drink extends Product {

    public Drink() {
        this("Drink", "Medium", "Coca");
    }

    public Drink(String name, String size, String type) {
        super(name, type.equals("Coca") ? 3 : 2, size, type);
    }

    @Override
    protected void changeSize(String size) {
        switch (size.toLowerCase().charAt(0)) {
            case 'S' -> {
                super.setSize("Small");
                super.setPrice(1);
            }
            case 'L' -> {
                super.setSize("Large");
                super.setPrice(3);
            }
            default -> {
                super.setSize("Medium");
                super.setPrice(2);
            }
        }
    }

}
