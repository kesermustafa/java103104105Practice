package asalSayi;

import java.util.Scanner;

public class asalSayilariBul {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

        int sayac = 0;
        for(int k=2; k<=sayi; k++) {

            boolean flag = true;

            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                   flag=false;
                    break;
                }
            }

            if(flag) {
                System.out.print(k+", ");
                sayac++;
            }
        }
        System.out.println();
        System.out.println(sayi + " icerisinde " + sayac + " adet asal sayi vardir..");
    }
}
