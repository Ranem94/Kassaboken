public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > balance)  {
            System.out.println("Fel: Inte tillrackligt med pengar.");
        }
        else {balance = balance - amount;
        }
    }
    public void printInfo() {
        System.out.println(owner + ": " + balance + " kr");
    }
}