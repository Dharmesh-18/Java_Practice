interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class MySmapleClass implements ChildSampleInterface{

    public void meth1(){
        System.out.println("Meth 1");
    }

    public void meth2(){
        System.out.println("Meth 2");
    }

    public void meth3(){
        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }

}

public class J28_Inheritance_In_Intrefaces {

    public static void main(String[] args) {

        MySmapleClass obj1 = new MySmapleClass();
        obj1.meth1();
        obj1.meth2();
        obj1.meth3();
        obj1.meth4();

    }
}
