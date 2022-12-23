package dayArrays;

import java.util.Arrays;

public class ElemanKaydirma {

    public static void main(String[] args) {

            // nums     =   [1,2,3,4,5,6,7],
            // k = 3
            // output   =   [5,6,7,1,2,3,4]
            // elemanlari istenen sayi kadar saga kaydiran kodu yaziniz?


        int arr[] = {1,2,3,4,5,6,7};

        int brr[] = new int[arr.length];
        int k = 3;
        int idx = 0;

        for(int i = 0; i<=arr.length-1; i++){

            if(arr.length-k < arr.length){
                brr[i]=arr[arr.length-k];
                k--;
            }else  {
                brr[i] = arr[idx];
                idx++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));





    }
}
