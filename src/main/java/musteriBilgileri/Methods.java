package musteriBilgileri;

import java.util.HashMap;
import java.util.Scanner;

public class Methods {

    static HashMap<Integer, Veriler > musteri = new HashMap<>();
    static Scanner input = new Scanner(System.in);

    public static void saveInfo() {

        System.out.println("Kayit icin Lutfen 4 haneli kimlik no giriniz.");
        Integer kimlikNo = input.nextInt();

        if (kimlikNo > 999 && kimlikNo < 10000) {

            if (musteri.containsKey(kimlikNo)) {
                System.out.println("Girilen kimlik No kayitlidir.");

            } else {
                System.out.print("Lutfen ad ve soyadinizi girin : ");
                input.nextLine();
                String adSoyad =  input.nextLine();

                System.out.print("Lutfen adresinizi girin : ");
                String adres = input.nextLine();

                System.out.print("Lutfen telefon numaranizi 10 haneli olarak girin : ");
                String telefon = input.nextLine();

                Veriler veri = new Veriler(adSoyad, adres, telefon);
                musteri.put(kimlikNo, veri);
            }

        } else {
            System.out.println("Lutfen 4 haneli gecerli bir kimlik numarasi giriniz.");
        }
    }


    public static void getInfo(){
        System.out.println("Bilgi sorgulama icin Lutfen 4 haneli kimlik no giriniz.");
        Integer kimlikNo = input.nextInt();
        if (kimlikNo > 999 && kimlikNo < 10000) {
            if (!musteri.containsKey(kimlikNo)) {
                System.out.println("Girilen kimlik no gecersizdir.");

            } else {
                System.out.println(kimlikNo + " " + musteri.get(kimlikNo));
            }
        } else {
            System.out.println("Lutfen gecerli kimlik no giriniz.");
        }
    }


    public static void removeInfo(){
        System.out.println("Bilgileri silinecek musteriye ait 4 haneli kimlik no giriniz..");
        Integer kimlikNo = input.nextInt();

        if (kimlikNo > 999 && kimlikNo < 10000) {
            if (!musteri.containsKey(kimlikNo)) {
                System.out.println("Girilem kimlik No ile kayitli musteri bulunmamaktadir.");
                removeInfo();
            } else {
                musteri.remove(kimlikNo);
                System.out.println(kimlikNo + " kimlik numarali museri bilgileri sistemden silindi.");
            }
        } else {
            System.out.println("Lutfen gecerli kimlik no giriniz.");
            removeInfo();
        }

    }

    public static void exit(){
        System.out.println("Guvenli sekilde sistemden cikis yaptiniz");
    }

    public static void selectOption(){

        System.out.println("Lutfen yapmak istediginiz islemi seciniz.\n1 = Musteri kayit\n2 = Musteri bilgi sorgulama\n3 = Musteri bilgileri silme\n4 = Cikis/Exit");
        int islem = input.nextInt();

        switch (islem){

            case 1 :
                saveInfo();
                selectOption();
                break;

            case 2 :
                getInfo();
                selectOption();
                break;

            case 3 :
                removeInfo();
                selectOption();
                break;

            case 4 :
                exit();
                break;
            default:
                System.out.println("Gecersiz secim yaptiniz.");
                selectOption();
                break;
        }

    }






}
