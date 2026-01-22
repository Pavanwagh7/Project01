package Bank;

public class Account {
    long acc_number ;
    String name;
    double balance;

    //this constructor will be called when customer wants to open an account
    public Account(long acc_number,String name, double balance) {
        this.acc_number = acc_number;
        this.name = name;
        this.balance = balance;
    }
}
