import java.util.Scanner;

public class HighestNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user enter number
        System.out.println("First number: ");
        double a = scanner.nextDouble();

        System.out.println("Second number:");
        double b = scanner.nextDouble();

        System.out.println("Third number:");
        double c = scanner.nextDouble();

        double max = findMax(a, b, c);


        System.out.println("Display the highest Number:" + max);
    }

    private static double findMax(double a, double b, double c) {
        double max = a;

        if(a > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }
}
