import java.util.Scanner;

public class Second {

    public static void main(String[] args){
        float pi = 3.142f;
        int r = 5;
        double A = pi * r * r;
        System.out.printf("The Area of the circle is %f\n", A);
        Scanner obj = new Scanner(System.in);
        int radius = obj.nextInt();
        double Area = pi * radius * radius;
        System.out.printf("The area of the circle is %f", Area);
    }
}
