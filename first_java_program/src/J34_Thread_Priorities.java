class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while (i < 1000){
            System.out.println(this.getName());
            i++;
        }
    }
}


public class J34_Thread_Priorities {

    public static void main(String[] args) {



        MyThread t1 = new MyThread("goal");
        MyThread t2 = new MyThread("moal");
        MyThread t3 = new MyThread("soal");

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }
}
