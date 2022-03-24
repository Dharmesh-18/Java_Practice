import java.util.Scanner;

public class J10_For_Loops {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to print odd numbers upto: ");
//        int num = sc.nextInt();
//
//        for(int i = 0; i<num; i++){
//            System.out.println(2*i + 1);
//        }
//        System.out.println("Finish!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print natural numbers from: ");
        int num = sc.nextInt();

        for (int i = num; i>0; i--){
            if(i%2 == 0)
                continue;
            if(i==4)
                break;
            System.out.println(i);
        }


    }
}
