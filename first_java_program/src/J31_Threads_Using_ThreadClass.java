class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<=40000) {
            System.out.println("Cooking");
            System.out.println();
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<=40000) {
            System.out.println("Chatting");
            System.out.println();
            i++;
        }
    }
}

public class J31_Threads_Using_ThreadClass {

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}
