package day14arrays;

import java.util.Arrays;

public class RakamlariTersCevir {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        int brr[] = new int [arr.length];


        int idx = 0;
        for ( int i =1 ; i<= arr.length; i++ ) {

            brr[idx] = arr[arr.length-i];
            idx++;
        }

        System.out.println(Arrays.toString(brr));


        for(int w = 1; w<=arr.length; w++){
            System.out.print(arr[arr.length-w]);
        }

        System.out.println();

        int sayi = 512345;

        String str = "";
        for(int w = 0; w<sayi; w++){
            str = str+sayi%10;
          sayi= sayi/10;
        }
        System.out.println(str);

        int a = Integer.parseInt(str);
        System.out.println("a ; " + a);


        System.out.println();

        int num = 385;
        num = Math.abs(num);
        int sonuc = 0;

        for(int i = num ; i>0 ; i=i/10 ){
            sonuc = sonuc + i%10;
        }
        System.out.println(sonuc);



    }
}
