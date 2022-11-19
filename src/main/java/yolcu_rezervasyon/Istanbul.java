package yolcu_rezervasyon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Istanbul {

    static List<String> istanbul = new ArrayList<>(Arrays.asList("1", "REZERVE", "3", "DOLU", "5", "6", "7", "8", "9", "REZERVE", "11", "12", "DOLU", "14", "15"));


    static double istanbulUcret = 750;

    static double istanbulKasa = 0;


    static Scanner input = new Scanner(System.in);
    public static void istanbul() {
        System.out.println(istanbul);

        System.out.println("Lutfen koltuk numaranizi seciniz");
        String koltukNo = input.nextLine();

        for (String w : istanbul) {
            if (w.equals(koltukNo)) {
                System.out.println("Koltuk uceti : " + istanbulUcret + "odemeyi onayliyorsaniz==>E,  onaylamiyorsaniz==> H girin?");
                String onay = input.nextLine().toUpperCase().substring(0, 1);
                if (onay.equals("E")) {
                    istanbulKasa += 750;
                    istanbul.set(Integer.parseInt(koltukNo)-1, "DOLU");
                    System.out.println("Hayirli yolculuklar dilseriz..");
                    System.out.println(istanbul);
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
