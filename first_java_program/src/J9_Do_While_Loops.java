import java.util.Scanner;

public class J9_Do_While_Loops {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number uptill you want to print.");
        int a = sc.nextInt();

        int i = 1;

        do{
            System.out.println(i);
            i++;
        }while(i<=a);

        System.out.println("Finish!");
    }
}
