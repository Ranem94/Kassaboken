import java.util.ArrayList;

public class AccountRegister {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(String owner, double balance) {
        Account Anna = new Account(owner, balance);
        accounts.add(Anna);
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("Inga konton.");
        } else {
            for (Account Anna : accounts) {
                Anna.printInfo();
            }
        }
    }

    public Account findAccount(String owner) {
        for (Account Anna : accounts) {
            if (Anna.getOwner().equals(owner)) {
                return Anna;
            }
        }
        return null;
    }
}