import java.util.Scanner;

public class Classwork {

    public static void main(String[]args){


        Scanner input = new Scanner(System.in);
        System.out.println("The first number:");
        int a = input.nextInt();
        System.out.println("The second number:");
        int b = input.nextInt();
        System.out.println("The third number:");
        int c = input.nextInt();

        int result = a+b+c/3;
        System.out.println(result);

        System.console();
    }
}
