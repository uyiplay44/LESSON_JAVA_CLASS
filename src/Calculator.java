
    //The names are the properties and the method is the function.
    //If using the class you use them along the method.
    // when a function is inside a class is called method.
    //write a program that return the average of three different numbers enter by a user.
    //Write a program that returns the highest of three different numbers entered by a user. (Assignment).


    public class Calculator {

        public static double divide(double x, double y){
            double resultSum = x/y;
            return resultSum;
        }

        public static int add(int x, int y){
            int resultSum = x+y;
            return resultSum;
        }

        public static void main (String[]args) {
            System.out.printf("The sum is %.1f\n", Calculator.divide(10,30));
            System.out.printf("The sum is %d", Calculator.add(10,30));
        }
    }


