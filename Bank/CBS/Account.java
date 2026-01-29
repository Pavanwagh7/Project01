package CBS;

public class Account {
    private final long acc_number ;
    private String name;
    private double balance;

    //method is for the initial deposit at the time of account opening
    public void deposit (double deposit) {
        this.balance += deposit;
    }


    //withdraw
    public void withdraw (double amount) {
        this.balance = this.balance - amount;
    }


    public long get_acc_number () { return acc_number; }
    public String getName() { return name; }
    public double getBalance() { return balance; }


    //this constructor will be called when customer wants to open an account
    public Account(long acc_number,String name) {
        this.acc_number = acc_number;
        this.name = name;
        this.balance = 0.0;
    }
}