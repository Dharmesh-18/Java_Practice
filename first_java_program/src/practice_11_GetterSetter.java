class Cylinder{

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float surfaceArea(){
        return (float) ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
    }

    public float volume(){
        return (float) (Math.PI*radius*radius*height);
    }
}

class MyRectangle{

    int length;
    int breadth;

    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public MyRectangle() {
        this.length = 10;
        this.breadth = 8;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Sphere{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    public float volume(){
        return 4*3.14f*radius*radius*radius/3;
    }

    public float surfaceArea(){
        return 4*3.14f*radius*radius;
    }
}

public class practice_11_GetterSetter {

    public static void main(String[] args) {


//        Q:1:
//        Cylinder c1 = new Cylinder(5, 10);
//        System.out.println("Height :  "+ c1.getHeight() + " Radius : "+ c1.getRadius());

//        Q:2:
//        System.out.println("Volume of the cylinder is : "+ c1.volume());
//        System.out.println("Total surface area of the cylinder is : "+ c1.surfaceArea());

//        Q:4:
//        MyRectangle r1 = new MyRectangle(50, 20);
//        System.out.println(r1.getLength());
//        System.out.println(r1.getBreadth());

//        Q:5:
//        Sphere s1 = new Sphere(5);
//        System.out.println(s1.getRadius());
//        System.out.println(s1.surfaceArea());
//        System.out.println(s1.volume());


    }
}
