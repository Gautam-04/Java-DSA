package OOPs;

public class Question11 {
//    Write a Java program to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount.
//    The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit,
//    withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount
//    should implement the Account interface and have their own unique methods.

    public static void main(String[] args) {
        double balance = 45000;
SavingsAccount save = new SavingsAccount(balance,4);
        System.out.println(save.viewBalance());
        System.out.println(save.applyBonus());
        System.out.println(save.CalculateInt());
        save.Deposit(40000);
        System.out.println(save.viewBalance());
    }
}

class Bank{

}

interface Account{
    void Deposit(double x);
    void withdraw(double y);
    double CalculateInt();
    double viewBalance();
}

class SavingsAccount implements Account{
    private double balance;
    private double interestrate;

    public SavingsAccount(double balance,double interestrate){
        this.balance = balance;
        this.interestrate = interestrate;
    }

    @Override
    public void Deposit(double x) {
balance += x;
    }

    @Override
    public void withdraw(double y) {
if(balance < y){
    System.out.println("Insufficient Balance");
} else{
    balance -= y;
}
    }

    @Override
    public double CalculateInt() {
        double interest = balance * interestrate / 100;
        balance += interest;;
        return balance;
    }

    @Override
    public double viewBalance() {
return balance;
    }
    public double applyBonus() {
        balance += 10; // Example: A unique method for adding a bonus to savings account
        return balance;
    }

}

class CurrentAccount implements Account{

    @Override
    public void Deposit(double x) {

    }

    @Override
    public void withdraw(double y) {

    }

    @Override
    public double CalculateInt() {
        return 0;
    }

    @Override
    public double viewBalance() {
return 0;
    }
}

