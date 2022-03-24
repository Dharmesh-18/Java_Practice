class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }

    @Override
    public void run(){
        int i = 0;
        while(i<1000) {
            System.out.println("Goal");
            i++;
        }
    }
}

class MyRunThr implements Runnable{

    @Override
    public void run(){
        int i = 0;
        while (i<40) {
            System.out.println("Thread 2");
            System.out.println();
            i++;
        }
    }
}

public class J33_Constructors_Of_Thread_Class {

    public static void main(String[] args) {

//        MyThr t1 = new MyThr("Thread1");
//        t1.start();
//        System.out.println(t1.getId());
//        System.out.println(t1.getName());
//        MyThr t2 = new MyThr("Thread2");
//        t2.start();
//        System.out.println(t2.getId());
//        System.out.println(t2.getName());

        MyRunThr rt1 = new MyRunThr();
        Thread t1 = new Thread(rt1, "Golden");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());



    }
}
