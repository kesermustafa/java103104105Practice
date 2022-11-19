package day02forloop01;
import java.util.Scanner;
public class ForLoop05 {
    public static void main(String[] args) {
        // 3 un kati ise sayi yerin Java
        // 5 in kati ise sayi yerine Guzeldir..
        // hem 3 hem 5'in kati ise Java Guzeldir..

        Scanner input = new Scanner(System.in);
        System.out.println("100 den kucuk tam sayi giriniz..");
        int sayi = input.nextInt();

        if(sayi>0 && sayi<101){

            for(int i = 1 ; i<=sayi ; i++){

                if(!(i%3==0) && !(i%5==0)){
                    System.out.print(i + ", ");

                } else if(i%3==0 && i%5==0){
                    System.out.print("Java Guzeldir. ");

                } else if(i%3==0){
                    System.out.print("Java ");

                } else if (i%5==0) {
                    System.out.print("Guzeldir ");
                }
            }
        }else
            System.out.println("Gecerli sayi giriniz...");

    }
}
