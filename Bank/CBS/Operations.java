
package CBS;



import java.util.Scanner;
import Repository.AccountsRepo;

public class Operations {
    //generation of account number for new account
    long ac_num = 100000;
    void  genarate_ac_number () {
        ac_num += 1;
    }

    //create an instance of class AccountRepository
    AccountsRepo ar = new AccountsRepo();








    //open new account
    void create_new_acc (Scanner sc) {
        //new account deatails
        System.out.print("********** Provide Details **********\nName : ");
        String name = sc.nextLine();

        System.out.print("Initial_Deposite : ");
        double deposit = sc.nextDouble();

        genarate_ac_number();//generated new account number

        //call the constructor
        Account new_account_object = new Account(ac_num,name);//object created

        new_account_object.deposit(deposit);//initial deposit

        //opened account succesfully
        System.out.println("** Status : Account is opened succesfully **");
        System.out.println("********** Your Account number is **********\nA/C :" + new_account_object.get_acc_number());
        System.out.println();//new line

        //store an account
        ar.saveAccount(ac_num,new_account_object);
    }





    /**
     *  Opeartions related to existing account
     * */
    //deposit amount
    void deposit (long account_number,double amount) {
       Account object = ar.returnObject_for_AccountNumber(account_number);

        if (object != null) {
            object.deposit(amount);
            System.out.println("** Amount deposited **");
        }
        else
            System.out.println("** Account does not Exist **");
    }


    //withdrawal
    void withdraw (long account_number,double amount) {
        Account object = ar.returnObject_for_AccountNumber(account_number);

        if (object != null) {
            object.withdraw (amount);
            System.out.println("** Amount withdrawn **");
        }
        else
            System.out.println("** Account does not Exist **");
    }


    //check balance
    void check_balance (long account_number) {
        Account object = ar.returnObject_for_AccountNumber(account_number);

        if (object != null) {
            System.out.println("Name: " + object.getName());
            System.out.println("Balance: " + object.getBalance());
        }
        else
            System.out.println("Account does not Exist");
    }

}
