import java.util.Scanner;

public class J3_taking_input_from_user {
    public static void main(String[] args) {
        System.out.println("Taking input from the user..");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1:");
//        boolean b1 = sc.hasNextInt();
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2:");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        float sum = a + b;
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name);


    }

}
