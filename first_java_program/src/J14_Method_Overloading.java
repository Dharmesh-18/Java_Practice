public class J14_Method_Overloading {

//    static void  tellJoke(){
//        System.out.println("Hello you buffalo!!");
//    }

//    static void change(int x) {
//        x = 100;
//    }
//
//    static void change2(int[] arr) {
//        arr[0] = 100;
//    }

//    Method overloading k liye return type same hona chahiye
    static void foo(){
        System.out.println("Hello!!");
    }

    static void foo(int a ){
        System.out.println("Hello " + a + " Bro!!");
    }

    static void foo(int a , int b){
        System.out.println("Hello " + (a+b) + " Bro!!");
    }

    static void foo(String a){
        System.out.println("Hello "+ a + "!!");
    }


    // Method overloading is not achieved by changing the return type of the method but parameters only as in the above examples..
//    static int foo(int a ){
//        return a*2;
//    }

    public static void main(String[] args) {

//        tellJoke();

//        int a = 50;
        // Case : 1 : trying to change an int(call by value), but doesn't change..
//        change(a);
//        System.out.println(a);

//        int[] numbers = {20, 30, 40, 50};
//         trying to change the array element(call by reference happens being an object), successfully changes..
//        change2(numbers);
//        System.out.println(numbers[0]);

        foo();
        foo(10);
        foo(20, 40);
        foo("Dharmesh");

    }
}
