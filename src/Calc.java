
import java.util.Scanner;
public class Calc {

    public static double findAverage(int x, int y, int z){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Value of x");
        x=obj.nextInt();
        System.out.println("Enter Value of y");
        y=obj.nextInt();
        System.out.println("Enter Value of z");
        z=obj.nextInt();


        double average = (x+y+z)/3;
        return average;
    }

    public static void main(String[] args) {
        int x=2,y=3,z=10;
        Calculator calc=new Calculator();
        System.out.printf("The Average of three number is %3f", Calc.findAverage(x,y,z));
    }
}
