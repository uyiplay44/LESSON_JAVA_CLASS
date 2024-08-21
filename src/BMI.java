/*
* 1. Write a java program that reutn the product of three numbers ebtered  by a user.
* 2. Write a java program that return the a number, its square and cube respectly.
*
* 3. The body Mass Index(BMI) of a human is given by the formular
*
* BMI =   Weight in Kilgram / Height in Meters * Height in Meters.
*
* BMI Values
* UnderWeight: less than 18.5.
* Normal: Between 18.5. and 24.9.
* Overweight: Between 25 and 29.9.
* Obese 30 or greater
* */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height;
        double weight;
        double BMI;
        System.out.println("Please enter your height in meters");
        height=input.nextInt();
        System.out.println("Please enter your height in Kilogram");
        weight=input.nextInt();
        BMI=weight/(height*height);
        System.out.printf("Your BMI is %f.1\n", BMI);

        if(BMI<18.5){
            System.out.println("You are underweight, please increase your food intake");
        }else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("You are normal, please maintain your food state of health");
        }
    }
}
