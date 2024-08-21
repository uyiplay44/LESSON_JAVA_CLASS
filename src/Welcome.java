import java.util.Scanner;

public class Welcome {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the value of a");
        int a = obj.nextInt();
        System.out.println("Please enter the value of b");
        int b = obj.nextInt();
        int z = a+b;
        System.out.printf("The product is %d", z);
    }
}
