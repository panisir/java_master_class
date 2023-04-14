package f_oop_part_two.d_master_challenge;

public class SideItem extends Product {

    public SideItem() {
        this("Site Item", 4, "Medium", "Potatoe");
    }
    public SideItem(String name, double price, String size, String type) {
        super(name, price, size, type);
    }

}
