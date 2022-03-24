class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Cellphone{

    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling a friend...");
    }

}

class Square{
    int side;

    public void setSide(int side){
        this.side = side;
    }
    public int perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
}

class Rectangle{
    int length;
    int breadth;

    public int perimeter(){
        return 2*(length+breadth);
    }

    public int area() {
        return length*breadth;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}

class Circle{
    float radius;

    public float circumference(){
        return 2*3.14f*radius;
    }
    public float area(){
        return 3.14f*radius*radius;
    }
}


public class practice_9_OOPS {

    public static void main(String[] args) {

//        Q:1:
//        Employee goal = new Employee();
//        goal.setName("Goal");
//        goal.salary = 100;
//        System.out.println(goal.getName());
//        System.out.println(goal.getSalary());

//        Q:2:
//        Cellphone nokia = new Cellphone();
//        nokia.ring();
//        nokia.vibrate();
//        nokia.callFriend();

//        Q:3:
//        Square sq1 = new Square();
//        sq1.setSide(5);
//        System.out.println(sq1.perimeter());

//        Q:4:
//        Rectangle r1 = new Rectangle();
//        r1.length = 5;
//        r1.breadth = 4;
//        System.out.println(r1.perimeter());
//        System.out.println(r1.area());

//        Q:5:
//        Tommy t1 = new Tommy();
//        t1.run();
//        t1.hit();
//        t1.fire();

//        Q:6:
//        Circle c1= new Circle();
//        c1.radius = 4;
//        System.out.println(c1.circumference());
//        System.out.println(c1.area());

    }
}
