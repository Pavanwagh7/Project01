package CBS;

import java.util.Scanner;

public class Dashboard {
     public void menu() {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();

        //dash board
        while(true) {
            System.out.println();//new line
            System.out.println("*********************************");
            System.out.println("**** Welcome to Bank of Java ****");
            System.out.println("*********************************");
            System.out.println("Press 1 to create New Account ***");
            System.out.println("Press 2 to use Existing Account *");
            System.out.println("Press 3 to quit *****************");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3){
                System.out.println("** Thanks for using Bank of Java **");
                break;
            }

            switch (choice) {
                case 1:
                    op.create_new_acc(sc);
                    System.out.println("** Thanks for using Bank of Java **");
                    break;
                case 2:
                    //Existing Account dialouge
                    System.out.println("**** Existing account dialouge ****");
                    System.out.println("press 1 to check the balance ******");
                    System.out.println("press 2 to Deposit an amount ******");
                    System.out.println("press 3 to Withdraw an amount *****");
                    System.out.println("Press 4 to go back ****************");

                    int subchoice = sc.nextInt();

                    if (subchoice == 4) {
                        break;
                    }

                    switch (subchoice) {
                        case 1://check balance
                            System.out.println("Enter an Account number : ");
                            op.check_balance (sc.nextLong());
                            break;
                        case 2://Deposit Amount
                            System.out.print("Enter an Account number : ");
                            long account_number = sc.nextLong();

                            System.out.print("Enter Amount: ");
                            double amount = sc.nextDouble();

                            op.deposit (account_number,amount);
                            break;
                        case 3://Withdraw Amount
                            System.out.println("*** Withdrawal ***");
                            System.out.print("Enter an Account number : ");
                            account_number = sc.nextLong();

                            System.out.print("Enter Amount: ");
                            amount = sc.nextDouble();

                            op.withdraw (account_number,amount);
                            break;
                        default:
                            System.out.println("Invalid Operation");
                    }

                    break;
                default:
                    System.out.println("**Invalid Operation**");
            }
        }
        sc.close();
    }
}
