import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountRegister reg = new AccountRegister();
while (true) {
    System.out.println("1. Skapa konto 2. Lista 3. Insattning 4. Uttag 5. Avsluta");
    String val = sc.nextLine();

 if (val.equals("1")) {
     System.out.print("Agare: ");
     String owner = sc.nextLine();
     reg.addAccount(owner, 0);
} else if (val.equals("2")) {
     reg.listAccounts();
} else if (val.equals("3")) {
     System.out.print("Agare: ");
     String owner = sc.nextLine();
     Account a = reg.findAccount(owner);
     if (a == null) {
         System.out.println("Konto hittades inte.");
     } else {
         System.out.print("Belopp: ");
         double b = Double.parseDouble(sc.nextLine());
         a.deposit(b);
     }
 } else if (val.equals("4")) {
     System.out.print("Agare: ");
     String owner = sc.nextLine();
     Account a = reg.findAccount(owner);
     if (a == null) {
         System.out.println("Konto hittades inte.");
     } else {
         System.out.print("Belopp: ");
         double b = Double.parseDouble(sc.nextLine());
         if (a.getBalance() < b) {
             System.out.println("------------------------------");
             System.out.println(" Otillräckligt saldo!");
             System.out.println("------------------------------");
             try { Thread.sleep(2500); } catch (Exception e) {}
         }
     }
 } else if (val.equals("5")) {
     break;
 }
}
sc.close();
    }
}