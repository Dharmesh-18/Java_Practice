class Circle1{

    public int radius;

    public Circle1(int radius) {
        System.out.println("I am parameterized constructor of circle..");
        this.radius = radius;
    }

    public float area(){
        return this.radius * this.radius * 3.14f;
    }
}

class Cylinder1 extends Circle1{
    public int height;

    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am parameterized constructor of cylinder..");
        this.height = h;


    }

    public float volume(){
        return this.area() * this.height;
    }
}

class Rectangle1{
    int length, breadth;

    public Rectangle1(int length, int breadth) {
        System.out.println("I am parameterized constructor of Rectangle1");
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return this.length * this.breadth;
    }
}

class Cuboid extends Rectangle1{
    int height;

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        System.out.println("I am parameterized constructor of Cuboid..");
        this.height = height;
    }
}

public class practice_13_Inheritance {

    public static void main(String[] args) {

//        Q:1:
//        Circle1 cirlcle1 = new Circle1(5);
//        Cylinder1 cylinder1 = new Cylinder1(5, 10);

//        Q:2:
//        Rectangle1 r1 = new Rectangle1(2,4);
//        Cuboid c1 = new Cuboid(2, 4, 6);




    }
}
