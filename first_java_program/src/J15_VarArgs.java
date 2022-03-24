public class J15_VarArgs {


// arr would become an array
    public static int sum(int a , int ...arr){
        int result = a;
        for(int element : arr){
            result += element;
        }
        return result;
    }

    public static void names(String ...arr){

        for(String name: arr){
            System.out.println(name + "\t");
        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to VarArgs tutorial.");
//        System.out.println("Sum of 1 is : "+ sum(1));
//        System.out.println("The sum of 2 and 3 is: "+ sum(2,3));
//        System.out.println("The sum of 2, 4 and 3 is: "+ sum(2,4,3));
//        System.out.println("The sum of 2, 5, 7 and 3 is: "+ sum(2,5,7,3));


    }
}
