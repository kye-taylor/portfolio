package com.company;
import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {

    public static int balance = 2400;
    public static int pincode = 1324;
    public static int usercode = 0;

    public static void main(String[] args) {
        int trys = 0;

        Scanner number_input = new Scanner (System.in);
        while (usercode != pincode)
        {
            System.out.println("That code is incorrect. Please retry.");
            System.out.println("Please Enter your Pin: ");
            usercode = number_input.nextInt();
            trys++;
            if (trys == 3)
            {
                System.out.println("Too meny attempts, account locked. Please phone the bank.");
                return;
            }
        }
        if (usercode == pincode)
        {
            menu();
        }

    }

    public static void menu() {
        int menuchoice = 0;

        System.out.println("====================================");
        System.out.println("    Welcome to the Bank account     ");
        System.out.println("    (1) Display your Balance        ");
        System.out.println("   (2) Deposit into your account    ");
        System.out.println("  (3) Withdraw out of your account  ");
        System.out.println("    (4) Logout of your account      ");
        System.out.println("====================================");

        Scanner number_input = new Scanner (System.in);
        System.out.println("Please enter the option you would like to use: ");
        menuchoice = number_input.nextInt();

        switch(menuchoice) {
            case 1:
                    balance();
                break;
            case 2:
                    deposit();
                break;
            case 3:
                    withdraw();
                break;
            case 4:
                    System.out.println("Thank you for banking with us.");
                break;
            default:
                    menu();
        }
    }
    public static void balance() {
        System.out.println("Your balance is " + balance);
        menu();
    }
    public static void deposit() {
        int deposit = 0;

        System.out.println("How much would you like to deposit: ");
        Scanner number_input = new Scanner (System.in);
        deposit = number_input.nextInt();

        balance = deposit + balance;
        balance();
    }
    public static void withdraw() {
        int withdraw = 0;

        System.out.println("How much would you like to deposit: ");
        Scanner number_input = new Scanner (System.in);
        withdraw = number_input.nextInt();

        if (withdraw < balance)
        {
            balance = withdraw - balance;
            balance();
        }
        else
        {
            System.out.println("Insufficient Funds.");
            menu();
        }
    }
}
