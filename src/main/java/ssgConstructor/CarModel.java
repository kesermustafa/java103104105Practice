package ssgConstructor;

public class CarModel extends Car{

        public static void main(String[] args) {
            Car car3 = new Car();
            System.out.println(car3.brand);//public

            CarModel carModel1 = new CarModel();
            System.out.println(carModel1.model);

            car3.Start();
            carModel1.stop();
        }


}
