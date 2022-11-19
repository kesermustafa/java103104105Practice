package WhileLoop;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {

        //kullanicidan baslangic ve bitis degerleri alin ve baslangis ve bitis degerleri dahil aralarindaki
        // tum cift sayilari while loop kullanarak ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Islem icin baslangis degerini giriniz..");
        int baslangic = input.nextInt();
        System.out.println("Islem icin bitis degerini giriniz..");
        int bitis = input.nextInt();


        while (baslangic<=bitis){

            if(baslangic%2==0){
                System.out.print(baslangic + " ");
            }

            baslangic++;
        }







    }
}
