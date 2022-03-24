class A{
    int i;
    public int meth1(){
        return 10;
    }
    public void meth2(){
        System.out.println("I am method 2 in class A.");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 in class B.");
    }
    public void meth3(){
        System.out.println("I am method 3 in class B.");
    }
}

public class J23_Method_Overriding {

    public static void main(String[] args) {

        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }
}
