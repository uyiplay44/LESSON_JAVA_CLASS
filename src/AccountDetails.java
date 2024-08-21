/*
* Write a program that display the balance on your saving account and current account, provide you made a deposit into the two account.
*
* From the two account above make a withdrawal and let your two account display thw two balances.
* */


import java.util.Scanner;

public class AccountDetails {

    private String accountName;

    private double balance;

    //constructor
    public  AccountDetails(double initialBalance){
        if(initialBalance >0.0){
            balance=initialBalance;
        }
    }

    public void credit(double amount){
        balance=balance+amount;
    }

    public double getBalance(){
        return balance;
    }


    public void setAccountName(String name){
        accountName=name;
    }

    public String getAccountName(){
        return accountName;
    }

    public void displayAccount(){
        System.out.printf("Welcome to my bank account %s\n", getAccountName());
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        AccountDetails myaccount = new AccountDetails(700.0);
        System.out.printf("My account name is %s", myaccount.getAccountName());

        System.out.println("Please the account name");
        String thename=input.nextLine();
        myaccount.setAccountName(thename);

        System.out.println("Display the account details\n");
        myaccount.displayAccount();

        AccountDetails myaccount1 = new AccountDetails(200.50);
        AccountDetails myaccount2 = new AccountDetails(-7.89);

        //display account details for both saving and current

        System.out.printf("My saving account is %s:\n", myaccount1.getBalance());
        System.out.printf("My current account is %s:\n", myaccount2.getBalance());

        Scanner input1 = new Scanner(System.in);
        double depositAmount=0.0;
        System.out.println("Please enter deposit for savings");
        depositAmount=input1.nextDouble();
        System.out.printf("Saving Account: deposit %.1f\n", depositAmount);
        myaccount1.credit(depositAmount);

        Scanner input2 = new Scanner(System.in);
        double depositAmount1=0.0;
        System.out.println("Please enter deposit for current");
        depositAmount1=input2.nextDouble();
        System.out.printf("Current Account: deposit %.1f\n", depositAmount1);
        myaccount1.credit(depositAmount1);

        System.out.printf("Balance  for saving %.1f\n", myaccount1.getBalance());
        System.out.printf("Balance for current %.1f\n", myaccount2.getBalance());
    }
}
