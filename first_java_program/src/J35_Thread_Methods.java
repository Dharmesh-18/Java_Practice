class mt1 extends Thread{
    @Override
    public void run() {
        int i= 0;
        while(i<100){
            System.out.println("1");
            System.out.println();
            i++;
        }
    }
}

class mt2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<100) {
            System.out.println("2");
            System.out.println();
            i++;
        }
    }
}

public class J35_Thread_Methods {

    public static void main(String[] args) {

        mt1 t1 = new mt1();
        mt2 t2 = new mt2();

        t1.start();
        try{
            t1.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();


    }
}
