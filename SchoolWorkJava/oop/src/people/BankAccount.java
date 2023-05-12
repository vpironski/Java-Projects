package people;

public class BankAccount {
    int accountNumber;
    double balance;
    String name;

    public BankAccount(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdrawal){
        if(this.balance >= withdrawal){
            balance -= withdrawal;
        }
        else{
            System.out.println("Error 1: Not enough credit in the account");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank Account Number: " + this.accountNumber + "\n" +
                "_________________________________________________ \n" +
                "Account holder name: " + this.name + "\n" +
                "Account balance: " + this.balance  + "\n" +
                "_________________________________________________ \n";
    }


}
