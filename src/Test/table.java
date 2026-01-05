package Test;

import java.io.IOException;

public class table {
    synchronized void printable(int n )
    {
            for (int i = 0; i <= 5; i++)
                System.out.println(n * i);
        try{
            Thread.sleep(400);
        }
        catch(Exception e)
            {
            e.printStackTrace();
            }
    }
}
