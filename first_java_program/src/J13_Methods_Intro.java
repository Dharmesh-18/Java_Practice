public class J13_Methods_Intro {


// method logic returning int type and uses conditions to take copy of variables to perform calculations on them.
    static int logic(int x, int y){
        if(x>y){
            return x+y;
        }
        else{
            return x-y;
        }
    }

    public static void main(String[] args) {


        int a = 10;
        int b = 23;

//        calling method through object creation in case we have not declared the method as static..
//        J13_Methods_Intro obj = new J13_Methods_Intro();
//        int c = obj.logic(a,b);

        int c = logic(a,b);
        System.out.println(c);

        int a1 = 23;
        int b1 = 10;
        int c1 = logic(a1, b1);
        System.out.println(c1);

    }
}
