package day02forloop01;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Satir syisi giriniz..");
        int str = input.nextInt();

        for(int i=0 ; i<str ; i++ ){

            for(int k=0 ; k<i ; k++){
                System.out.print(" ");
            }
            for(int n=1 ; n<=str-i ; n++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
