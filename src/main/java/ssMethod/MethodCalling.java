package ssMethod;

import static ssMethod.MethodCreation.cikartma;

public class MethodCalling {



    public static void main(String[] args) {

        MethodCalling obj1 = new MethodCalling();
        obj1.add(2, 6);

        MethodCreation obj2 = new MethodCreation();
        System.out.println(obj2.topla(9, 3));

        System.out.println(cikartma (9,1)) ;

        not();

        System.out.println(obj1.carp(2,6)+cikartma(8,1));

    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public int carp (int a, int b){
        return a*b;
    }

    public static void not(){
        System.out.println("Bu konuyu da hallettik");
    }
}
