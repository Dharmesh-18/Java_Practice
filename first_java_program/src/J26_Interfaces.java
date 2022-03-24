interface Bicycle{
    int a = 9;
    void applyBrake(int decrement);
    void speedUp(int decrement);
}

interface hornBycycle{
    void horn1();
    void horn2();
}

class AvonCycle implements Bicycle, hornBycycle{
    void blowHorn(){
        System.out.println("Pee Pee");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brakes with power: " + decrement);
    }
    public void speedUp(int increment){
        System.out.println("Speeding up with power: "+ increment);
    }
    public void horn1(){
        System.out.println("Playing horn 1");
    }
    public void horn2(){
        System.out.println("Playing horn 2");
    }

}

public class J26_Interfaces {

    public static void main(String[] args) {

        AvonCycle cycle = new AvonCycle();
        cycle.blowHorn();

        System.out.println(cycle.a);  // interface me properties bna skte and access kr skte hain

//        cycle.a = 10;  // but interface ki properties modify nhi kr skte bcz final hoti hain

        cycle.horn1();
        cycle.horn2();

    }
}
