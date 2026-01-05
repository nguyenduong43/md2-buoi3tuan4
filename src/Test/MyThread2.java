package Test;

public class MyThread2 extends Thread{
    table t;
    public MyThread2(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printable(100);
    }

}
