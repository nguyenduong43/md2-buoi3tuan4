package oto;

import java.io.IOException;
import java.util.Random;

public class Car implements Runnable {
    private String name;
    public static int DISTANCE=100;
    public static int STEP=5;
    public Car(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        long star=System.currentTimeMillis();
        int quangduong=0;
        while(quangduong<DISTANCE)
        {
            try {
               int vantoc=(new Random()).nextInt(20);
               quangduong+=vantoc;
               int phantram=(quangduong*100)/DISTANCE;
               String log="|";
               for (int i=0;i<DISTANCE;i=i+STEP)
                   if (phantram>=i+STEP) log+="=";
               else if (phantram<i+STEP && phantram>=i) log+="o";
               else log+="-";
               log+="|";
                System.out.println("Car "+name+" "+log+" "+Math.min(DISTANCE,quangduong)+"KM");
                Thread.sleep(1000);
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("Car "+name+" thoi gian chay "+(end-star)/1000+" giay");
    }

}
