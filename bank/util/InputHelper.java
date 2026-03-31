package util;

import java.util.Scanner;

public class InputHelper {
    private Scanner sc;

    //Constructor
    public InputHelper (Scanner sc) {
        this.sc = sc;
    }

    //Integer input validation
    public int nextInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println ("** Invalid input **");
            }
        }
    }

    //Double input validation
    public double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println ("** Invalid input **");
            }
        }
    }

    //String input validations

    public String inputName () {
        while (true) {
            System.out.print ("Name : ");
            String name = sc.nextLine();

            name = name.trim();

            if (isNameEmpty(name)) {
                System.out.println("Invalid Name");
                continue;
            }

            boolean isValid = true;
            for (int i = 0;i < name.length();i++) {
                char ch = name.charAt(i);
                if (Character.isLetter(ch) || ch == ' ' ) {
                    continue;
                }
                else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) return name;
            System.out.println("Invalid Name");
        }
    }

    private boolean isNameEmpty(String name) {return name.length() == 0 ? true : false;}

}
