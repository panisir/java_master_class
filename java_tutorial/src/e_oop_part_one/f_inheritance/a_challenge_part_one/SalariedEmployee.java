package e_oop_part_one.f_inheritance.a_challenge_part_one;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birtDate, String hireDate, double annualSalary) {
        super(name, birtDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire() {
        /** This method is from the Worker class
         * So parent methods can be call from any descendent class method
         * */
        terminate("12/12/2023");
        isRetired = true;
    }

    @Override
    public double collectPay() {
        double payCheck = (annualSalary / 26);
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }
}
