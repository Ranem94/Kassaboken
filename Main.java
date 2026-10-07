import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountRegister reg = new AccountRegister();

        while (true) {
            System.out.println("\n1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Satt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.print("Val: ");
            String val = sc.nextLine();

            if (val.equals("1")) {
                System.out.print("Agare: ");
                String owner = sc.nextLine();
                System.out.print("Belopp: ");
        double b = Double.parseDouble(sc.nextLine());
        reg.addAccount(owner, b);
        System.out.println("Konto skapat.");

            } else if (val.equals("2")) {
                reg.listAccounts();

            } else if (val.equals("3")) {
                System.out.print("Agare: ");
             String owner = sc.nextLine();
                Account Anna = reg.findAccount(owner);
                if (Anna == null) {
                    System.out.println("Konto hittades inte.");
                } else {
                    System.out.print("Belopp: ");
                    double b = Double.parseDouble(sc.nextLine());
                    Anna.deposit(b);
                }
            } else if (val.equals("5")) {
                break;
            }
        }
        sc.close();
    }
}