package Bank;

public class Account {
    private long acc_number ;
    public String name;
    private double balance;

    public void set_accNum (long acc_number) {
        this.acc_number = acc_number;
    }
    public void set_balance (double deposit) {
        this.balance = deposit;
    }

    public long get_acc_number() {
        return acc_number;
    }
    public double getBalance() {
        return balance;
    }


    //this constructor will be called when customer wants to open an account
    public Account(String name) {
        this.name = name;
    }
}
