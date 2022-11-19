package day02forloop01;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        int satir,c=1,blk,i,j;
        System.out.print("Satir sayisi giriniz.. : ");
        Scanner in = new Scanner(System.in);
        satir = in.nextInt();


        for(i=0;i<satir;i++) {

            for (blk = 1; blk <= satir-i ; blk++)
                System.out.print(" ");

            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
