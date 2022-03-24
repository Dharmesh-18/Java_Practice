public class J11_Array_Intro {

    public static void main(String[] args) {


        // There are three ways to create arrays in Java

        // 1: Declaration and memory allocation separately..
//        int [] marks;
//        marks = new int [5];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 50;
//        System.out.println(marks[4]);

        // 2: Declaration and memory allocation together..
//        int [] marks = new int [5];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 50;
//        System.out.println(marks[4]);

        //3: Declaration, memory allocation and initialization all together..
        int [] marks = {10, 20, 30, 40, 50};

        //Printing using naive method
        System.out.println("Printing in a naive way..");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Printing using for loop..");
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Printing using for_each loop..");
        for(int mark: marks){
            System.out.println(mark);
        }

    }
}
