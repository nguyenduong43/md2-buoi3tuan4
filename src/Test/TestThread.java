package Test;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        table t=new table();
        MyThread1 t1=new MyThread1(t);
        MyThread2 t2=new MyThread2(t);
        Thread t3=new Thread(){
            public void run(){
                t.printable(10);
            }
        };
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
