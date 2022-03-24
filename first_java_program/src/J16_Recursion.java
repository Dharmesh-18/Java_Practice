public class J16_Recursion {

    static int fact_iter(int n){
        int product = 1;
        if(n==0 || n==1){
            return 1;
        }
        else{

            for(int i=1; i<=n; i++){
                product *= i;
            }
        }
        return product;
    }

    static int fact_recur(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n* fact_iter(n-1);
        }
    }

    static int nat_sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + nat_sum(n-1);
        }
    }

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {

        System.out.println("Factorial of 5 using iterative method is : "+ fact_iter(5));
        System.out.println("Factorial of 5 using recursive method is : "+ fact_recur(5));

        System.out.println("Sum of natural numbers up to 5 is : "+ nat_sum(10));

        System.out.println("10th term of fibonacci series is : "+ fibo(10));

    }
}
