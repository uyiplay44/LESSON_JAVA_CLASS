import java.util.Scanner;

public class Userdisplay {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String fistname, secondname, middlename;

        System.out.println("Enter first name");
        fistname=obj.next();
        System.out.println("Enter second name");
        secondname=obj.next();
        System.out.println("Enter second name");
        middlename=obj.next();

        System.out.printf("My full name is %s %s %s", fistname, secondname, middlename);
    }
}
