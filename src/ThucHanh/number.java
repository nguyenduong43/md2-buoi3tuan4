package ThucHanh;

public class number implements Runnable{
    private String name;
    public  number(String name)
    {
        this.name=name;
    }
    public void run()
    {
        try{
            for (int i=1;i<=10;i++)
                System.out.println("Thread "+name+" "+i);
            Thread.sleep(500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
