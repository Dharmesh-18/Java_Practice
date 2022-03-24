import java.util.Scanner;

public class J36_Error_Exception_Handling {
    public static void main(String[] args) {

        int a = 50;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();


//        int c = a/b;
//        System.out.println(c);

        try{

            int c = a/b;
            System.out.println("Result of the division is: " + c);
        }
        catch (Exception e ){
            System.out.println("Operation aborted.. Reason: ");
            System.out.println(e);
        }
        System.out.println("This is out of try catch block so it will run ");
    }
}
