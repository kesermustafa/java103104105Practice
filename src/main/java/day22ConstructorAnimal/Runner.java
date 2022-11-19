package day22ConstructorAnimal;

public class Runner {


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1.a);

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);

        Animal cat3 = new Cat();
        System.out.println(cat3.a);


        Bird obj1 = new Bird("bird");

        Bird obj2 = new Bird("ali", "veli");


    }
}
