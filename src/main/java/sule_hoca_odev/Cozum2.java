package sule_hoca_odev;

import java.util.Scanner;

public class Cozum2 {

    public static final String B = "\u001B[31m";
    public static final String G = "\u001B[38m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        String str = input.nextLine();

        System.out.println(G+"Girdiginiz cumlede en yuksek puanli kelime = \"" +  B+ kelimeyeBolHesapla(str) + G+"\" kelimesidir.");

    }

    public static String kelimeyeBolHesapla(String str) {
        String[] kelime = str.replaceAll("\\p{Punct}", "").replaceAll("\\d", "").replaceAll("\\s+", " ").trim().split(" ");
        // Noktalama isartleri, rakamlar aralarda olabilecek fazla spaceler ile basda ve sonda olabilecek spacler temizlendi.
        // String space lerden bolunerek array'a atandi.

        String yuksekPuanliKelime = "";  // En yuksek puanli kelimenin atanacagi konteyner olusturuldu.

        int kelimePuan = 0;

        for (String w : kelime) {

            int sum = 0;

            for (int i = 0; i < w.length(); i++) {
                char ch = w.toLowerCase().charAt(i);  // Buyuk harf korumak ucun toLowerCase() methodu burada kullanildi.
                if (ch >= 'a' && ch <= 'z') {
                    sum += ch - 'a' + 1;
                }
            }

                if (sum > kelimePuan) {
                    yuksekPuanliKelime = w;
                    kelimePuan = sum;
                }
        }
        return yuksekPuanliKelime;
    }
}
