package day14arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {

        String[] brr = {"Ayse", "Valican", "Ali", "Hayrettin", "Kemal"};

        // Dogru sonuc almak icin String Arrayi elemanlarin length; ine gore sort etmmemiz gerekli
        // Sort edildikten sonra ilk eleman en kisa olacaktir.
        // Bunu System.out.println(brr[0]); olarak yazirabilririz;

        Arrays.sort(brr, Comparator.comparingInt(String::length));

         System.out.println(brr[0]);  // Ali

        // Ancak Math.min method'u kullanmak isterseniz
        int minUzunluk = brr[0].length();

        for( int i = 0; i<= brr.length-1; i++){
            minUzunluk = Math.min(minUzunluk, brr[i].length());

            if(minUzunluk == brr[i].length()){
                System.out.println(brr[i]);  // Ali
            }

        }





    }
}
