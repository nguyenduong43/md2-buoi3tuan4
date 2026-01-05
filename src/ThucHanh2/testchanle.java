package ThucHanh2;

public class testchanle {
    public static void main(String[] args) throws InterruptedException {
        chan c=new chan("chan");
        le l=new le("le");
        l.start();
        l.join();
        c.start();
        c.join();

    }
}
