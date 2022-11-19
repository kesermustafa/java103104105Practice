package ssgstringManipulation;

import java.util.Scanner;

public class S05 {

    public static void main(String[] args) {

        // Soru 4) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("gmail adresinizi giriniz..");
        String str = scan.nextLine().toUpperCase();


        if(str.contains("@gmail.com")){

            if(str.endsWith("@gmail.com")){
                System.out.println("Email adresiniz kaydedildi");
            }else{
                System.out.println("lutfen yazimi kontol edin");
            }

        }else{
            System.out.println("lutfen gmail adresi giriniz");
        }






    }
}
