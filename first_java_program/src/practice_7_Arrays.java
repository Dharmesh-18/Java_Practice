import java.util.Arrays;
import java.util.Scanner;

public class practice_7_Arrays {

    public static void main(String[] args) {

//        Q: 1 : simple traverse and addition of array elements
//        float[] numbers = {1.2f, 2.3f, 3.4f, 4.5f, 5.6f};
//
//        float sum = 0;
//         for(float number : numbers){
//             sum += number;
//         }
//        System.out.println(sum);

//        Q: 2 : Linear search
//        int[] numbers = {1, 2, 3, 4, 5};
//        boolean found = false;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number you want to search in the given array:");
//         int search = sc.nextInt();
//         for (int number : numbers){
//             if(number == search){
//                 found = true;
//             }
//         }
//        System.out.println("Number "+ search+ " found in the array :  "+ found);

//        Q: 3 : Average of marks
//        int [] marks = {10,12,15, 14, 10};
//        float sum = 0;
//        for(float mark: marks){
//            sum += mark;
//        }
//        System.out.println("Average marks are: "+ sum/marks.length);

//        Q : 4: matrix addition
//        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
//        int[][] mat2 = {{2, 3, 5}, {6, 3, 5}};
//
//        int[][] result = {{0, 0, 0}, {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for (int[] row : result) {
//            for (int number : row) {
//                System.out.print(number + "\t");
//            }
//            System.out.println("");
//        }

//        Q : 5 : Array reversal
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//        int temp = 0;
//        for (int i = 0; i < numbers.length / 2; i++) {
//            temp = numbers[i];
//            numbers[i] = numbers[numbers.length - 1 - i];
//            numbers[numbers.length - 1 - i] = temp;
//        }
//
//        for (int number : numbers) {
//            System.out.print(number + "\t");
//        }

//        Q : 6 : max element in array
//        int[] numbers = {4, 503, 53, 5, 6, 65, 55, 43};
//
//        int max = numbers[0];
//        for (int number : numbers) {
//            if (number > max) {
//                max = number;
//            }
//        }
//
//        System.out.println("Maximum element in the array is: " + max);

//        Q : 7 : min element in the array
//        int[] numbers = {43,67,34,5,36,324,5342,124,32,5 };
//        int min = numbers[0];
//        for (int number : numbers){
//            if(number< min){
//                min = number;
//            }
//        }
//        System.out.println("Minimum element in the array is: "+ min);

//        Q : 8 : Checking if the array is sorted or not
        int[] numbers = {34, 350, 506, 1000};

        boolean sorted = true;

        for(int i = 0; i < numbers.length-1 ; i++){
            if(numbers[i] >numbers[i+1]){
                sorted =false;
                break;
            }
        }
        System.out.println("The given array is sorted: " + sorted);


    }
}
