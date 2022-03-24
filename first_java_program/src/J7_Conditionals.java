import java.util.Scanner;

public class J7_Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age please:");
        int age = sc.nextInt();

//        if(age<18){
//            System.out.println("No! you can not drive yet! TOO EARLY!!");
//        }
//        else if(age >= 90){
//            System.out.println("No! you can not drive now! TIME TO REST!!");
//        }
//        else{
//            System.out.println("Yes! you can drive! HAVE FUN!!");
//        }

//        *********switch me use hone wala variable can be int, char or string*********

        switch (age){
            case 12:
                System.out.println("You are going to be teenager!");
                break;
            case 20:
                System.out.println("You are going to be an adult!");
                break;
            case 22:
                System.out.println("You have got your job!");
                break;
            case 50:
                System.out.println("You are going to retire!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }

    }
}
