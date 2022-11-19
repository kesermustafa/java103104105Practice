package dayArrays;

import java.util.Arrays;

public class Soru02 {
        //Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        //Array: [12,15,43,23,56,76,78,90,77,43]
        //Aranan değer:56
        //Beklenen Çıktı:
        //56 sayısı arrayin 4. elemanı

    public static void main(String[] args) {

        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int wantedNumber = 56;
        int idx = Arrays.binarySearch(arr, wantedNumber);
        System.out.println(wantedNumber + " sayisi arrayin " + idx + ". elemanı");


        int counter=0;
        int arananEleman=56;
        for(Integer w : arr){
            if(w!=arananEleman){
                counter++;
            }else{
                System.out.println(arananEleman + " sayidi arrayin " + counter + ". elemani");
            }
        }










    }

}
