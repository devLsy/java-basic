package oop1.ex;

public class AcountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("잔액: " + account.balance);

        account.widhdraw(9000);
        System.out.println("잔액: " + account.balance);

        account.widhdraw(2000);
        System.out.println("잔액: " + account.balance);
    }
}
