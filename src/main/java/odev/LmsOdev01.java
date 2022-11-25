package odev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LmsOdev01 {


    /*  - Kullanıcıdan int öğelerini girmesini ve listeye öğe eklemesini istemek için kod yazın
        - Kullanıcıdan kaldırılacak öğeleri girmesini isteyin, ardından bu öğeyi listeden kaldırın.
        - Kullanıcıdan güncellemek için öğeyi girmesini isteyin, ardından güncelleyin.
  */

    public static void main(String[] args) {

        giris();

    }

    static Scanner input = new Scanner(System.in);
    static List<Integer> arr = new ArrayList<>();
    static List<Integer> silinecek = new ArrayList<>();

    public static void giris(){
        System.out.println("Lutfen yapmak istediginiz islemi seciniz..\n1= Elemen ekleme\n2= Kaldirilacak/silinecek elemanlar\n3= Eleman guncelleme\n0= Exit/Cikis");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        switch (secim){

            case 1 :
                elemenEkle();
                break;
            case 2 :
                elemanSil();
                break;
            case 3 :
                guncelle();
                break;
            case 0 :
                System.out.println("Tesekkur ederiz...");
                break;
            default:
                System.out.println("Gecersiz secim yaptiniz..");

        }
    }

    public static void elemenEkle(){

        do {
            System.out.println("Eklemek istediginiz elemanlari giriniz...\nIselemi sonlandirmak icin 0 giriniz ");
            int eleman = input.nextInt();
            if (eleman!=0){
                arr.add(eleman);
            }else{
                break;
            }
        }while (true);

        System.out.println(arr);
        giris();

    }


    public static void elemanSil(){

        System.out.println("Mevcut listeniz : " + arr);

        do {
            System.out.println("Silmek istediginiz elemanlari giriniz...\nIselemi sonlandirmak icin 0 giriniz ");
            int elemanSil = input.nextInt();

            if(elemanSil!=0){
                silinecek.add(elemanSil);
            }else{
                arr.removeAll(silinecek);
                System.out.println(silinecek + " elemanlar silsinmistir.");
                break;
            }

        }while (true);

        System.out.println("Guncel listeniz : " + arr);
        giris();
    }


    public static void guncelle(){

        System.out.println("Guncel listeniz : " + arr);
        System.out.println("Guncellemek istediginiz elemani giriniz...");
        int eleman1 = input.nextInt();
        System.out.println("Yeni deger giriniz...");
        int eleman2 = input.nextInt();
        for (Integer w : arr) {
            if(arr.contains(eleman1)){
                arr.set(arr.indexOf(eleman1), eleman2);
            }else {
                System.out.println("Girdiginiz eleman bulunmamaktadir.");
            }
        }
        System.out.println("Guncel listeniz : " + arr);
        giris();
    }

}
