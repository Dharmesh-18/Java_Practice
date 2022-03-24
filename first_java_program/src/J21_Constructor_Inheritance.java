class Base1{

    Base1(){
        System.out.println("I am a constructor in Base1");
    }

    Base1(int x){
        System.out.println("I am overloaded constructor of Base1 with x = " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
//        super(9);
        System.out.println("I am a constructor in derived1..");
    }
    Derived1(int x){
        super(x);
        System.out.println("I am special constructor in Derived with x = " + x);
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am overloaded constructor of Derived1 with y = " + y);
    }
}

class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a constructor of Child Class..");
    }
    ChildofDerived(int x , int y, int z){
        super(x ,y);
        System.out.println("I am an overloaded constructor of Child with value of z = " + z);
    }
}

public class J21_Constructor_Inheritance {

    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1(5);

//        ChildofDerived child = new ChildofDerived();
        ChildofDerived child = new ChildofDerived(5, 10, 15);


    }
}
