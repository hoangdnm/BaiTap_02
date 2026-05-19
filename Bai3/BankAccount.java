package Bai3;
public class BankAccount {
    private String accountNumber;
    private String nameAccount;
    private double balance;

    public String getNameAccount() {
        return nameAccount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setNameAccount(String nameAccount) {
        if(nameAccount != null && !nameAccount.trim().isEmpty()) {
            this.nameAccount = nameAccount;
        }
    }
 
    public BankAccount(String nameAccount, String accountNumber, double initialBalance) {
        this.balance = initialBalance;
        if(this.balance < 0) {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
        }
        this.nameAccount = nameAccount;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }else {
            System.out.println("Withdrawal amount exceeds balance or is invalid.");
        }
    }
    public void displayInfo() {
        String accStr = String.valueOf(accountNumber);
        String last4 = accStr.substring(accStr.length() - 4);
        System.out.println("Account Holder: " + nameAccount + " - Account Number: ****" + last4 + " - Balance: $" + balance);
    }
    public void transfer(BankAccount other, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }
}
