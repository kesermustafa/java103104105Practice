package day22ConstructorAnimal;

public class Bird extends Animal {


    public void eet(){
        System.out.println("!!!!!!!!!");
    }

    public Bird(String k){
        System.out.println("Merhabalarrr");
    }


    public Bird(String a, String b){

        beat();
        System.out.println("******");
    }

    public void beat(){
        System.out.println("Hey java");
    }

}
