package exceptionHandling;

public class CustomExceptionExample {

    public static void main(String[] args) {

        BankAcount bankAcount = new BankAcount(5000);
        try {
            bankAcount.withdraw(6000);
        } catch (InsufficientFundsException e) {
            e.getMessage();
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class BankAcount {
    private double balance;

    public BankAcount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance available ...! " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance:" + balance);
    }
}
