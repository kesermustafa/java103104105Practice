package ReplitCozumler;

import java.util.Scanner;

public class VucutKitleEndeki {
    public static void main(String[] args) {

        /*
        sk kullanıcısının kilosuna ve boyuna göre bir program yazın ve kitle indeksini hesaplayan bir program yazın

                * İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy karesi (m)

                Ardından kullanıcıya aşağıdaki gibi bir mesaj verin:

                BMI 18,5'in altındaysa zayıfsınız
                BMI 18,5 ile 25 arasında ise kilonuz idealdir
                BMI 25-30 arasındaysa şişmansınız
                BMI 30'dan büyük veya eşitse, obez
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen boyunzu giriniz.");
        double boy = input.nextDouble();
        System.out.println("Lutfen kilonuz giriniz.");
        double kilo = input.nextDouble();

        double bMI = kilo/(boy*boy);
        System.out.println("Your BMI is  : " + bMI);

        if(bMI<18.5){
            System.out.println("Your weight is ideal");
        } else if (bMI>=18.5 && bMI<=25) {
            System.out.println("your weight is ideal");
        }else if (bMI>=25 && bMI<30) {
            System.out.println("you re fat");
        }else if (bMI>=30) {
            System.out.println("obese");
        }



    }
}
