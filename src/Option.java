import javax.swing.JOptionPane;

public class Option {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome To Java We Are Moving Fast Now.");
        String name = JOptionPane.showInputDialog("What is your name");
        String message = String.format("Welcome, %s, to Java programming", name);
        JOptionPane.showMessageDialog(null, message);


        //Conditional Statement While Loop//
//        int counter =1;
//        while(counter<=10){
//            System.out.printf("%d\n", counter);
//            ++counter;
//
//            if(counter == 10) break;
//        }
        //Conditional statement Do....While Loop//
//        int counter1 =1;
//        do {
//            System.out.printf("%d\n", counter1);
//            ++counter1;
//        }while (counter1 <= 10);
//        System.out.println();


        //Conditional Statement For Loop//
//        for (int counter2 =2; counter2 <= 10; counter2++){
//            System.out.printf("%d\n", counter2);
//        }

       for (int salary = 300; salary <= 3600; salary+=300){
           System.out.printf("$%d\n", salary);
       }
    }
}