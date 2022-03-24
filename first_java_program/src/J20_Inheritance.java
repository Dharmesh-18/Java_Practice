class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now!! ");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor!! ");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class Animal{
    public void speak(){
        System.out.println("I am an animal!");
    }
}

class Dog extends Animal{
    public void speak(){
        System.out.println("I am a dog! ");
    }
}

public class J20_Inheritance {

    public static void main(String[] args) {

//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());
//
//        Derived d = new Derived();
//        d.setX(43);
//        System.out.println(d.getX());

        Animal mouse = new Animal();
        mouse.speak();

        Dog tommy = new Dog();
        tommy.speak();


    }
}
