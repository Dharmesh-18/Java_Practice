import java.sql.SQLOutput;
import java.util.Scanner;


public class practice_8_Functions {

    static void multiplication(int n){
        for(int i = 1; i<= 10; i++){
            System.out.println(n +"X"+ i+ " = "+ n*i);
        }
    }

    static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j = 0; j<i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    private static int sumTill(int num) {

        if(num==0){
            return 0;
        }
        if(num ==1){
            return 1;
        }
        else{
            return num + sumTill(num-1);
        }
    }

    private static void patternRev(int num) {
        for(int i = num; i>=0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    private static int fibonacci(int num) {
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    private static float average(int ...arr) {
        float sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum/arr.length;
    }

    private static void pattern_rec(int num) {
        if(num>0){
            pattern_rec(num-1);

            for(int i = 0; i< num; i++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        Q:1:
//        System.out.println("Enter the number to print the table for: ");
//        int num = sc.nextInt();
//        multiplication(num);

//        Q:2:
//        System.out.println("Enter the number of lines you want in the pattern:");
//        int num = sc.nextInt();
//        pattern(num);

//        Q:3:
//        System.out.println("Enter the number up till you want the sum of:");
//        int num = sc.nextInt();
//        System.out.println("The sum is : "+sumTill(num));

//        Q:4:
//        System.out.println("Enter the number of lines you want in the pattern:");
//        int num = sc.nextInt();
//        patternRev(num);

//        Q:5:
//        System.out.println("Which term of fibonacci series you want:");
//        int num = sc.nextInt();
//        System.out.println(fibonacci(num));

//        Q:6:
//        System.out.println("Enter the numbers to calculate the average: ");
//        float avg = average(1,2,3,4,5,6);
//        System.out.println(avg);

//        Q:7:
//        System.out.println("Enter number of lines you want to print the pattern: ");
//        int num = sc.nextInt();
//        pattern_rec(num);


    }

}
