package ATM_Interface;

import java.util.Scanner;

public class ATM_Machine {
    static double initial_amt;
    static Scanner sc = new Scanner(System.in);
    public static void start() {

        System.out.println("Enter initial bank balance : Rs");
        initial_amt = sc.nextDouble();
        choice();
    }
    static void choice(){
        System.out.println("1 -> Withdraw");
        System.out.println("2 -> Deposit");
        System.out.println("3 -> Check Balance");
        System.out.println("4 -> Exit");
        System.out.println("Choose the value for correspondent operation :");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter amount to withdraw ");
                double withdrawl_amt = sc.nextDouble();
                if(withdrawl_amt> initial_amt){
                    System.out.println("Insufficient Funds..");
                    choice();
                }
                else{
                    initial_amt = initial_amt-withdrawl_amt;
                    choice();
                }
            case 2:
                System.out.println("Enter amount to deposit :");
                double deposit_amt = sc.nextDouble();
                initial_amt = initial_amt+deposit_amt;
                choice();
            case 3:
                System.out.println("Available balance RS"+initial_amt);
                choice();
            case 4:
                System.out.println("Exiting from ATM Machine ...\n Thanks for using");
                System.exit(0);
        }
    }
}
