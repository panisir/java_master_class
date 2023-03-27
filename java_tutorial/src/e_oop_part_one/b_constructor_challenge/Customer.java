package e_oop_part_one.b_constructor_challenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Neslihan", 1_500_500d, "nesli@mmail.com");
    }

    public Customer(String name, String email) {
        this(name, 1_400_300d, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
