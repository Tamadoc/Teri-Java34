package se.lexicon.teri.lesson3;

// Basic bank account class
public class BankAccount {
    static private int nextAccountNumber = 123456789;
    private int accountNumber;
    private double accountBalance;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountHolderPhone;

    BankAccount(double balance, String holderName, String holderEmail, String holderPhone) {
        this();
        this.accountBalance = balance;
        this.accountHolderName = holderName;
        this.accountHolderEmail = holderEmail;
        this.accountHolderPhone = holderPhone;
    }

    BankAccount() {
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public void setAccountBalance(double balance) {
        this.accountBalance = balance;
    }

    public void setAccountHolderName(String holderName) {
        this.accountHolderName = holderName;
    }

    public void setAccountHolderEmail(String holderEmail) {
        this.accountHolderEmail = holderEmail;
    }

    public void setAccountHolderPhone(String holderPhone) {
        this.accountHolderPhone = holderPhone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public String getAccountHolderPhone() {
        return accountHolderPhone;
    }

    private void depositFunds(double deposit) {
        if (deposit > 0) {
            accountBalance += deposit;
        }
    }

    private void withdrawFunds(double withdrawal) {
        if (accountBalance > withdrawal) {
            accountBalance -= withdrawal;
        }
    }

    public static void main(String[] args) {
        BankAccount test1 = new BankAccount();
        test1.setAccountBalance(1000);
        test1.setAccountHolderName("Me Messon");
        test1.setAccountHolderEmail("me@me.com");
        test1.setAccountHolderPhone("0000-111 11");

        BankAccount test2 = new BankAccount(2000, "You Yousson", "you@you.com", "1111-222 22");

        System.out.println(test1.getAccountNumber());
        System.out.println(test1.getAccountBalance());
        System.out.println(test1.getAccountHolderName());
        System.out.println(test1.getAccountHolderEmail());
        System.out.println(test1.getAccountHolderPhone());
        System.out.println();
        System.out.println(test2.getAccountNumber());
        System.out.println(test2.getAccountBalance());
        System.out.println(test2.getAccountHolderName());
        System.out.println(test2.getAccountHolderEmail());
        System.out.println(test2.getAccountHolderPhone());
    }
}
