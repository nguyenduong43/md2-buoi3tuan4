package ThucHanh2;

public class le extends Thread{
    private String name;
    public le(String name){
        this.name=name;
    }
    public void run(){
        try{
            for (int i=1;i<=10;i++)
                if (i%2==1) System.out.println("Thread "+name+" "+i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
