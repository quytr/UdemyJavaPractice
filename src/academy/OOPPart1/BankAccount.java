package academy.OOPPart1;

public class BankAccount {

    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double money) {
        System.out.println("Deposit of " + money + ". New balance is " + (this.balance += money));
    }

    public void withdraw(double money) {
        System.out.println((money <= this.balance) ? "After withdraw, your balance is " + (this.balance - money) : "Not enough money to withdraw");
    }

}
