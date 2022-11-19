package okul;

import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {

            kayitOl();

            System.out.println(Okul.student);
    }


    public static void kayitOl(){

        Scanner input = new Scanner(System.in);

        Okul obj1 = new Okul();

        while (Okul.student.size()<=obj1.maxOgrenciSayisi){
            System.out.println("Ogrenci ismini giriniz.");
            String studentAd = input.next();
            System.out.println("Ogrenci Soyadini giriniz.");
            String studentSoyad = input.next();
            System.out.println("Ogrenci Id giriniz.");
            String studentId = input.next();
            System.out.println("Ogrenci Age giriniz.");
            Integer studentAge = input.nextInt();

            if(!(studentAge>15)){
              Okul.student.add(String.valueOf(new Student(studentAd, studentSoyad, studentId, studentAge)));

            }else{
                System.out.println("15 yasindan buyuk ogrenci olamaz...");
                kayitOl();
            }
            if(Okul.student.size()==obj1.maxOgrenciSayisi){
                System.out.println("Okul kapasitesi dolmustur...");
                break;
            }
        }

    }





}
