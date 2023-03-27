package e_oop_part_one.a_class_challenge;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Neslihan Korkmaz");
        bankAccount.setAccountNumber(123456789);
        bankAccount.setEmail("neslihan@ykb.com");
        bankAccount.setPhoneNumber("5557685503");
        bankAccount.setBalance(1_123d);

        bankAccount.withDrawFund(123);
        System.out.println(bankAccount.getBalance());

        bankAccount.depositeFund(500);
        System.out.println(bankAccount.getBalance());

        bankAccount.withDrawFund(1600);
        System.out.println(bankAccount.getBalance());
    }
}
