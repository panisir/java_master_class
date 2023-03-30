package e_oop_part_one.b_constructor_challenge;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Melih", 1_250_300d, "melo@melo.com");
        Customer customer2 = new Customer("Leman", "leman@melo.com");
        Customer customer3 = new Customer();

        System.out.println("-------- Customer 1 --------");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getCreditLimit());

        System.out.println("-------- Customer 2 --------");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());
        System.out.println(customer2.getCreditLimit());

        System.out.println("-------- Customer 3 --------");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());
        System.out.println(customer3.getCreditLimit());

    }
}