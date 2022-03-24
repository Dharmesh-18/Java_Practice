abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    @Override
    public void write(){
        System.out.println("Writing..");
    }
    @Override
    public void refill(){
        System.out.println("Refilling ..");
    }
    public void changeNib(){
        System.out.println("Changing nib..");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping..");
    }
    void bite(){
        System.out.println("It hurts..");
    }
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating..");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping..");
    }
    public void speak(){
        System.out.println("Hello there !!");
    }
}

abstract class Telelphone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telelphone{

    public void search(){
        System.out.println("Searching number on the internet..");
    }

    @Override
    void ring() {
        System.out.println("ringing..");
    }

    @Override
    void lift() {
        System.out.println("lifting..");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting..");
    }
}


interface TVRemote{
    void powerOn();
    void powerOff();
    void changeChannel();
}

interface SmartTVRemote extends TVRemote{
    void voiceSearch();
}

class TV implements TVRemote{
    public void powerOn(){
        System.out.println("ON");
    }
    public void powerOff(){
        System.out.println("OFF");
    }
    public void changeChannel(){
        System.out.println("Changing channel..");
    }
}

public class practice_14_Abstract_Classes_Interfaces {

    public static void main(String[] args) {

//        Q:1+2:
        FountainPen fPen = new FountainPen();
//        fPen.changeNib();

//      Q:3:
        Human h1 = new Human();
//        h1.bite();

//        Q:5:
        Monkey m1 = new Human();
//        m1..speak();  // will not work (polymorphism), can access monkey methods only..
//        m1.jump();

//        Q:4:
        Telelphone t1 = new SmartTelephone();
//        t1.search(); // will not work as telephone can't access the methods of smartTelephone (polymorphism)..
//        t1.ring();

//        Q:6+7:
        TV tv = new TV();
        tv.changeChannel();

    }
}
