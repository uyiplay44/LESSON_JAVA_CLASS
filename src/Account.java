import java.util.Scanner;

public class Account {

    private String AccountName;

    public void setAccountName(String accountName){
        AccountName=accountName;
    }

    public String getAccountName(){
        return AccountName;
    }

    public void displayAccount(){
        System.out.printf("Welcome to my account: %s\n", getAccountName());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account myaccount = new Account();

        System.out.println("Please enter your saving account name again");
        String thename= scanner.nextLine();
        myaccount.setAccountName(thename);
        myaccount.displayAccount();
    }


}
