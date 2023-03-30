package e_oop_part_one.f_inheritance.a_challenge_part_one;

public class Main {
    public static void main(String[] args) {

        Employee melih = new Employee("Melih",
                "20/11/1991",
                "20/09/2021");

        System.out.println(melih);
        System.out.println("Age = " + melih.getAge());
        System.out.println("Pay = " + melih.collectPay());

        SalariedEmployee neslihan = new SalariedEmployee("Neslihan",
                "30/04/1993",
                "03/03/2021",
                35000);

        System.out.println(neslihan);
        System.out.println("Neslihan's Paycheck = $" + neslihan.collectPay());
        neslihan.retire();
        System.out.println("Neslihan's Pension check = $" + neslihan.collectPay());

        HourlyEmployee emre = new HourlyEmployee("Emre",
                "05/04/1995",
                "01/01/2015",
                15);
        System.out.println(emre);
        System.out.println("Emre's Paycheck = $" + emre.collectPay());
        System.out.println("Emre's Holiday Pay = $" + emre.getDoublePay());
    }
}