package yolcu_rezervasyon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ankara {

    static List<String> ankara = new ArrayList<>(Arrays.asList("1", "2", "DOLU", "4", "5", "DOLU", "REZERVE", "8", "9", "10", "11", "REZERVE", "13", "14", "DOLU"));

    static double ankaraUcret = 450;
    static double ankaraKasa = 0;
    static Scanner input = new Scanner(System.in);

    public static void ankara(){
        System.out.println(ankara);
        System.out.println("Lutfen koltuk numaranizi seciniz");
        String koltukNo = input.nextLine();

        for(String w : ankara){

            if (w.equals(koltukNo)) {
                System.out.println("Koltuk uceti : " + ankaraUcret + "odemeyi onayliyorsaniz==>E,  onaylamiyorsaniz==> H girin?");
                String onay = input.nextLine().toUpperCase().substring(0, 1);
                if (onay.equals("E")) {
                    ankaraKasa += 450;
                    ankara.set(ankara.indexOf(koltukNo), "DOLU");
                    System.out.println("Hayirli yolculuklar dilseriz..");
                    System.out.println(ankara);
                    break;
                } else if (onay.equals("H")) {
                    System.out.println("Yine bekleriz...");
                    break;
                } else {
                    System.out.println("Gecerli karakter giriniz..");
                    break;
                }
            }
        }
    }
}
