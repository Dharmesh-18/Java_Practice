import java.util.Scanner;

public class J5_Strings_Intro {

    public static void main(String[] args) {


//        String  name = "Dharmesh";
//        String name2 = new String("Goal");
//        System.out.printf("Name :  %s",name);
//        System.out.println("");
//        System.out.format("Name 2 : %s", name2);
//        String blank = " ";
//        System.out.println(blank);

//        taking input string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = 10;
        Float c = (float)b;
        System.out.println("Name is: "+ name);
        System.out.println(b);
    }
}
