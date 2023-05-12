package people;

public class Bank {
    public static void exampleAccount(){
        BankAccount account = new BankAccount(20108,0.90,"VIHREN PIRONSKI");
        System.out.println("Here is an exemplary account: \n");
        System.out.println(account);
        account.deposit(275.00);
        System.out.println(account);
        account.withdraw(0.90);
        System.out.println(account);
    }

    public static void main(String[] args) {
        exampleAccount();
    }
}
