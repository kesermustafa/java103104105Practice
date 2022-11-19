package day01_Variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Ad ve Soyadinizi giriniz..");
        String adSoyad = input.nextLine();
        System.out.println("Adresinizi  giriniz..");
        String adres = input.nextLine();


        System.out.println("Yasinizi giriniz..");
        int yas = input.nextInt();
        System.out.println("Boyunuzu giriniz..");
        int boy = input.nextInt();


        System.out.println("AdSoyad = " + adSoyad);
        System.out.println("Adres = " + adres);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);



    }
}
