package Test;

public class MyThread1 extends Thread{
    table t;
    public MyThread1(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printable(5);
    }

}
