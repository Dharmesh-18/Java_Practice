import java.util.Scanner;

public class J37_Handling_Multiple_Exceptions {

    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 50;
        marks[1] = 60;
        marks[2] = 70;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index you want ot operate with: ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index is : " + marks[ind]);
            System.out.println("The result of division is : " + marks[ind]/ number);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
