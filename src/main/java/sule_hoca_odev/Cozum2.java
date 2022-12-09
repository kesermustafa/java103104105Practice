package sule_hoca_odev;

import java.util.Scanner;

public class Cozum2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        String str = input.nextLine().toLowerCase();

        System.out.println("Girdiginiz cumlede en yuksek puanli kelime = " + kelimeyeBol(str));

    }

    public static String kelimeyeBol(String str) {
        String[] kelime = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim().split(" ");

        String yuksekPuanliKelime = "";

        int kelimePuan = 0;

        for (String w : kelime) {

            int say = 0;

            for (int i = 0; i < w.length(); i++) {
                char ch = w.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    say += ch - 'a' + 1;
                }
            }

                if (say > kelimePuan) {
                    yuksekPuanliKelime = w;
                    kelimePuan = say;
                }
        }
        return yuksekPuanliKelime;
    }
}
