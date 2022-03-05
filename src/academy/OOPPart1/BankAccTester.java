package academy.OOPPart1;

public class BankAccTester {

    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();//"8955", 0.00, "Bob Taylor", "myemail@bob.com", "705-9875-3214");

        System.out.println(bankAcc.getAccNumber());
        System.out.println(bankAcc.getBalance());

        bankAcc.withdraw(100);

        bankAcc.deposit(50);
        bankAcc.withdraw(100);

        bankAcc.deposit(51);
        bankAcc.withdraw(100);
    }
}
