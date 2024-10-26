package nyakundi;

public class Main {
    public static void main(String[] args) {
        Admin curAdmin = new Admin(32761641, "Erick", "Nyakundi@@3030");
        User curUser = new User(4455, "John");

        if (curAdmin.authenticate("Nyakundi@@3030")) {
            System.out.println("Authentication successful.");
            curAdmin.performOperation(new Update());
        } else {
            System.out.println("Authentication failed.");
        }

        curUser.performOperation(new View());
    }
}