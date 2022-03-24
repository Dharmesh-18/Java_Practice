abstract class Parent2{
    public Parent2(){
        System.out.println("I am constructor of parent2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child2 extends Parent2{

    public Child2(){
        System.out.println("I am constructor of child2");
    }

    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
}

// extend kiya to ya to abstract kr do ya phir abstract method bhi implement kro hi..

public class J25_Abstract_Class_Methods {

    public static void main(String[] args) {

        Child2 c2 = new Child2();



    }
}
