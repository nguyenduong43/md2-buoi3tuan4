package ThucHanh;

public class Testnumber {
    public static void main(String[] args) throws InterruptedException {
        number n1=new number("so thu nhat");
        number n2=new number("so thu hai");
        Thread t1=new Thread(n1);
        Thread t2=new Thread(n2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
        t2.join();


    }
}
