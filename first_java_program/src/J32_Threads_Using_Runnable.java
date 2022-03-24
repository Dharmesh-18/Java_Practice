class MyRunnableThread1 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<40000) {
            System.out.println("Thread 1");
            System.out.println();
            i++;
        }
    }
}

class MyRunnableThread2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<40000) {
            System.out.println("Thread 2");
            System.out.println();
            i++;
        }
    }
}

public class J32_Threads_Using_Runnable {

    public static void main(String[] args) {

//        treat RunnableThreads as bullets to be fired using Threads isliye fill them inside a Thread to call the start method..


        MyRunnableThread1 rt1 = new MyRunnableThread1();
        Thread t1 = new Thread(rt1);
        MyRunnableThread2 rt2 = new MyRunnableThread2();
        Thread t2 = new Thread(rt2);

        t1.start();
        t2.start();


    }
}
