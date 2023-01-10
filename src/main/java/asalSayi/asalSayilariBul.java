package asalSayi;

import java.util.Scanner;

public class asalSayilariBul {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int rakam = scan.nextInt();

        int sayac = 0;
        for(int sayi=2; sayi<=rakam; sayi++) {

            boolean flag = true;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    flag=false;
                    break;
                }
            }

            if(flag) {
                System.out.print(sayi+", ");
                sayac++;
            }
        }
        System.out.println();
        System.out.println(rakam + " icerisinde " + sayac + " adet asal sayi vardir..");
    }
}
