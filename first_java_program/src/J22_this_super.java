class EkClass {
    int a;

    public int getA() {
        return a;
    }

    public EkClass(int a) {
        System.out.println("I am constructor in EkClass..");
        this.a = a;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor in DoClass..");
    }

}

public class J22_this_super {

    public static void main(String[] args) {

        EkClass ek = new EkClass(5);
        DoClass two = new DoClass(10);


    }
}
