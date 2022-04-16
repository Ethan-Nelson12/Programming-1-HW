package Project1;

import java.util.Scanner;



public class BankAccountTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello Welcome! Please Enter your Name:");
        BankAccount gregChecking = new BankAccount(20000);
        BankAccount name_savings = new BankAccount();
        BankAccount savingsAcc = new BankAccount();
        String name = keyboard.nextLine();
        System.out.println("Welcome " + name + ", How much would you like start your account with?");
        double startAmount = keyboard.nextDouble();
        BankAccount name_checking = new BankAccount(startAmount);

        System.out.println("Great! "+ name+" Your starting balance is: $"+ name_checking.getBalance());
        System.out.println();
        if(startAmount >= 10000)
            {
                BankAccount.savingsAccount(name_checking, name_savings);
            
            }
            
        int menuSelection = BankAccount.menu();
        System.out.println(menuSelection);
        
        if(menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+name_checking.getBalance());

        }else if (menuSelection == 2)
                {
            System.out.println("Please enter the amount to deposit");
            double depositAmount = keyboard.nextDouble();
            name_checking.deposit(depositAmount);
            System.out.println("Amount: $"+depositAmount + " Was Deposited");
            System.out.println("Total Balance: $" + name_checking.getBalance());

                }
        else if (menuSelection == 3)
        {
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount = keyboard.nextDouble();
            name_checking.withdraw(withdrawAmount);
            
            System.out.println("Amount: $"+withdrawAmount + " Was Withdrawn");
            if(name_checking.getBalance() <= 0)
            {
                BankAccount.overDraft(name_checking, withdrawAmount);
            }
            else
            {
                System.out.println("Your New Total Balance is: $" + name_checking.getBalance());
            }
        
        }
        else if(menuSelection == 4){

            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.calcInterest(name_checking.getBalance(), years, 0.15, 12);
        }
        else if (menuSelection == 5)
        {
            System.out.println("Please enter the amount you would like to Transfer:");
            double transferAmount = keyboard.nextDouble();
            BankAccount.transfer(name_checking, gregChecking, transferAmount);

        }
        else if (menuSelection == 6)
        {
            System.out.println("Please enter the amount of years: ");
            int years = keyboard.nextInt();
            name_checking.simpleInterest(name_checking.getBalance(), years, .05);
            
            

        }
        else if (menuSelection == 0)
        {
            System.out.println("Have a nice day!");
        }
        else
        {
            System.out.println("Error: No Valid Selection");
        }
    }
}
