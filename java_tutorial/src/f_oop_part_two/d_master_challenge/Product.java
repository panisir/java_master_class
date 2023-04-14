package f_oop_part_two.d_master_challenge;

public class Product {

    public String name;
    public double price;
    private String size;
    private String type;

    public Product() {
    }

    public Product(String name, double price, String size, String type) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    protected void changeSize(String size) {
        System.out.println(this.getClass().getSimpleName() + "' size changed to " + size);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
