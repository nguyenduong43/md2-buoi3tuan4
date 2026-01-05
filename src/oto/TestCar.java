package oto;

public class TestCar {
    public static void main(String[] args) {
        Car Vin=new Car("vin");
        Car Mec=new Car("Mec");
        Car Toyota=new Car("Toyota");
        Thread t1=new Thread(Vin);
        Thread t2=new Thread(Mec);
        Thread t3=new Thread(Toyota);
        t1.start();
        t2.start();
        t3.start();
    }
}
