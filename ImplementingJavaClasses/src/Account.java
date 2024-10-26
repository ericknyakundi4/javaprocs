public class Account {
  private int accountNo;
  private String accountName;
  private double balance;

  // Constructor
  public Account(int accountNo, String accountName, double initialBalance) {
      this.accountNo = accountNo;
      this.accountName = accountName;
      this.balance = initialBalance;
  }

  // Deposit method
  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
      } else {
          System.out.println("Deposit amount must be greater than 0.");
      }
  }

  // Withdrawal method
  public void withdraw(double amount) {
      if (amount > 0 && amount <= balance) {
          balance -= amount;
      } else {
          System.out.println("Insufficient funds or invalid amount.");
      }
  }

  // Getter methods
  public int getAccountNo() {
      return accountNo;
  }

  public String getAccountName() {
      return accountName;
  }

  public double getBalance() {
      return balance;
  }
}
