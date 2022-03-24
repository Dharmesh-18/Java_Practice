class Phone{
    public void showTime(){
        System.out.println("Time is 8 am..");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
    public void extra(){
        System.out.println("I am extra method in Phone!");
    }
}

class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music!");
    }

    @Override
    public void on(){
        System.out.println("Turning on Smartphone");
    }
}

public class J24_Dynamic_Method_Dispatch {

    public static void main(String[] args) {

//        Phone p1 = new Phone();
//        Smartphone s1 = new Smartphone();
//        s1.name();

        Phone samsung = new Smartphone();  // allowed
        samsung.showTime();
        samsung.on();
        samsung.extra();
//        samsung.music();  // not allowed

//        Smartphone nokia = new Phone();  // not allowed


    }
}
