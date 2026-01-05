package ThucHanh2;

public class chan extends Thread{
    private String name;
    public chan(String name){
        this.name=name;
    }
    public void run(){
        try{
            for (int i=1;i<=10;i++)
                if (i%2==0) System.out.println("Thread "+name+" "+i);
            Thread.sleep(150);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
