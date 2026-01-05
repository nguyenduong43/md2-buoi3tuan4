package runnable;

public class testRunnable {
    public static void main(String[] args) {
        Runnabledemo r=new Runnabledemo("aaaaaa");
        r.start();
        Runnabledemo r2=new Runnabledemo("bbbbbb");
        r2.start();
    }
}
