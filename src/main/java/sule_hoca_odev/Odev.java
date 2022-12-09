package sule_hoca_odev;

import java.util.Scanner;

public class Odev {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        String str = input.nextLine();

        System.out.println("Girdiginiz cumlede en yuksek puanli kelime = " + kelimeyeBol(str));

    }

    public static String kelimeyeBol(String text) {
        String[] kelime = text.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim().split(" ");

        String yuksekPuanliKelime = "";

        int kelimePuan = 0;

        for (String w : kelime) {

            int sum = harfSay(w);

            if (sum > kelimePuan) {
                yuksekPuanliKelime = w;
                kelimePuan = sum;
            }
        }
        return yuksekPuanliKelime;
    }


    public static int harfSay(String kelime) {
        kelime = kelime.toLowerCase();

        int say = 0;

        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                say += ch - 'a' + 1;
            }
        }

        return say;
    }


}
