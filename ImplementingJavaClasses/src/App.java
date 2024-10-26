public class App {
    public static void main(String[] args) throws Exception {
        Account myAccount = new Account(12345, "Erick Nyakundi", 0.0);
        myAccount.deposit(10000);
        System.out.println("Balance: " + myAccount.getBalance());

        myAccount.withdraw(5000);
        System.out.println("Balance: " + myAccount.getBalance());
    }
}
