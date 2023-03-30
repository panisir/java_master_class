package e_oop_part_one.f_inheritance.a_challenge_part_one;

import java.net.Inet4Address;

public class Worker {

    private String name;
    private String birtDate;
    private String endDate;

    public Worker() {
    }

    public Worker(String name, String birtDate) {
        this.name = name;
        this.birtDate = birtDate;
    }

    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birtDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birtDate='" + birtDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
