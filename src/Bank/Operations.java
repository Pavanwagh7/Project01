package Bank;


import java.util.Scanner;

public class Operations {
    //generation of account number for new account
    long ac_num = 100000;
    void  genarate_ac_number () {
        ac_num += 1;
    }

    //open new account
    void create_new_acc (Scanner sc) {
        //new account deatails
        System.out.print("********** Provide Details **********\nname : ");
        String name = sc.nextLine();

        sc.nextLine();

        System.out.print("Initial_Deposite : ");
        double deposit = sc.nextDouble();

        genarate_ac_number();//generated new account number

        //call the constructor
        Account new_acc = new Account(ac_num,name);//object created

        new_acc.deposit(deposit);//initial deposit

        //opened account succesfully
        System.out.println("** Status : Account is opened succesfully **");
        System.out.println("********** Your Account number is **********\nA/C :" + new_acc.get_acc_number());
        System.out.println();//new line
    }





    /**
     *  Opeartions related to existing account
     * */
    void deposit (double amount) {
        //yet to develope
        System.out.println("** Money deposited succesfully **");
        System.out.println();//new line
    }
    void withdraw (double amount) {
        //yet to develope
        System.out.println("** Money withdrawn succesfully **");
        System.out.println();//new line
    }
    void check_balance () {

    }

}
