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
                    System.out.println("Existing Account");
                    break;
                default:
                    System.out.println("**Invalid Operation**");
            }
        }
        sc.close();
    }
}
