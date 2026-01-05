//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread {
    public static void main(String[] args) {
          Thread t=Thread.currentThread();
        System.out.println("main thread start "+t.getName());
        t.setName("codegym");
        System.out.println("main thread "+t.getName());
        System.out.println(t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println(t.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
        ChildThread child = new ChildThread();
        child.setPriority(MIN_PRIORITY);
        System.out.println(child.getPriority());
        child.start();
        }

    }