package e_oop_part_one.f_inheritance.a_challenge_part_one;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee() {
    }

    public Employee(String name, String birtDate, String hireDate) {
        super(name, birtDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
