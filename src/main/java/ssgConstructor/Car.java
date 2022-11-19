package ssgConstructor;

public class Car {

    public String brand="Ford";

    protected String model="Camry";

    String color="White";

    private String carNumberPlate="TR 34FC 6302";

    public void Start(){
        System.out.println("Car start");
    }

    public void stop(){
        System.out.println("car stop");
    }
    void  speed(){
        System.out.println("car speed");
    }

    public static void main(String[] args) {

        Car car1=new Car();
        System.out.println(car1.color);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.carNumberPlate);
        car1.Start();
        car1.speed();
        car1.stop();

    }


}
