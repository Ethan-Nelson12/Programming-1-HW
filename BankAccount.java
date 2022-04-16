package Project1;

import java.util.Scanner;

public class BankAccount 
{
    private double balance;

    
    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance){
        balance = initalBalance;
    }


    public double getBalance(){
        return balance;
    }

 //test
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }


    public void monthlyfee(){
        withdraw(10);
    }

    // P(1+ R/n)^(nt) - P 
    // P = principal
    // t = years
    // R = annual interest rate
    // n = # of times its compunded
    // PEMDAS 
    public void calcInterest(double p, int t, double r, int n){
        double amount =  p * Math.pow(1 + (r/n), n*t);
        double compinterest = amount - p;
        System.out.println("Compund Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t +" years: "+ amount);
    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        /************************ */
        System.out.println("Please select and option:");
        System.out.println("-------------------------");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Compund Interest");
        System.out.println("5: Transfer Money");
        System.out.println("6: Simple Interest");
        System.out.println("0: Quit");
        System.out.println("-------------------------");

        selection = input.nextInt();
        return selection;
    }

    public static void overDraft(BankAccount bank, double value ){


    Scanner scan = new Scanner(System.in);
    double balance = bank.getBalance();
    double overDraftFee = 35;

        System.out.println("----------------------");
        System.out.println("Your Account Balance Has Gone Below 0, There Will Be a $35 Over Draft Fee If You Wish To Continue");
        System.out.println("Would you still like to withdraw? Yes or No");
        String answer = scan.nextLine();
        

    if (answer.toLowerCase().equals("yes"))
        {
    balance = balance - overDraftFee;
    System.out.println("Your new balance is: $" + balance);

        }
    else if (answer.toLowerCase().equals("no"))
    {
        System.out.println("Have a Nice Day!");
    }

    else
    {
        System.out.println("Error: Invalid input");
    }
    }

        public static void transfer(BankAccount one, BankAccount two, double amount)
        {
         double first = one.getBalance();
         double second = two.getBalance();
         double newBalanceOne; 
         double newBalanceTwo;
    
        newBalanceOne = first - amount; 
        newBalanceTwo = second + amount;

        System.out.println("Amount: $"+ amount + ", Was Transfered Into: gregChecking" );
        System.out.println("Your New Balance is: $" + newBalanceOne);
        System.out.println("gregChecking New Balance is: $" + newBalanceTwo);

        }
            public void simpleInterest(double p, int t, double r)
            {
                double amount = (p * r * t)/100;
                double simInterest = p + amount;
                System.out.println("Simple Interest after "+ t +" years is: $"+ amount);
                System.out.println("Total amount after "+ t +" years is: "+ simInterest);


            }
                public static void savingsAccount(BankAccount bank, BankAccount saveBank)
                {
                    
                    double balance1 = bank.getBalance();
                    double balance2 = saveBank.getBalance();
                    double amount;

                    Scanner scan = new Scanner(System.in);
                    System.out.println("Would you like to create a savings account? Yes or No");
                    String answer = scan.nextLine();
                    if(answer.toLowerCase().equals("yes"))
                    {
                    System.out.println("Great! How much money would you like to deposit into this savings account"); 
                    amount = scan.nextDouble();
                    balance1 = bank.getBalance() - amount;
                    balance2 = saveBank.getBalance() + amount;
                    System.out.println("You Now Have: $"+ balance2 +" In Your New Savings Account and: $"+ (balance1) +" Left In Your Checkings Account" );
                    System.out.println("Would You Like Compound or Flate rate Interest?");
                    System.out.println("Input 1 For Compound, or 2 For Flat Rate");
                    int answer2 = scan.nextInt();
                    if (answer2 == 1)
                    {
                        int answer3;
                        System.out.println("Please the amount of years");
                        answer3 = scan.nextInt();
                        saveBank.calcInterest(balance2, answer3, .0001, 4);

                    }
                    else if (answer2 == 2)
                    {
                        int answer4;
                        System.out.println("Please the amount of years");
                        answer4 = scan.nextInt();
                        bank.simpleInterest(balance1, answer4, .001);
                    }
                        


                    }
                    else if(answer.toLowerCase().equals("no"))
                    {
                        System.out.println();
                        System.out.println("Okay!");
                        System.out.println("Loading menu...");
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Error: Invalid Input");
                    }
                }

}
