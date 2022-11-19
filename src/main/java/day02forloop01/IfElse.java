package day02forloop01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        String sy = input.nextLine();

        //String str = String.valueOf(sy);
        String i = sy.replaceAll("[^0-9]", "");
        int ii = Integer.parseInt(i);


        if(ii < 0 ){
            System.out.println(ii+" Negetif");
        }else if(ii > 0){
            System.out.println(ii+" Pozitif");
        }

        System.out.println(ii + 9);









    }
}
