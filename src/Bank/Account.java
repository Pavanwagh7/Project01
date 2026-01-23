package Bank;

public class Account {
    private final long acc_number ;
    private String name;
    private double balance;


    public void deposit (double deposit) {
        this.balance += deposit;
    }

    public long get_acc_number() {
        return acc_number;
    }
    public double getBalance() {
        return balance;
    }


    //this constructor will be called when customer wants to open an account
    public Account(long acc_number,String name) {
        this.acc_number = acc_number;
        this.name = name;
        this.balance = 0.0;
    }
}
