package day02forloop01;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {

        int i,j,str;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        str = in.nextInt();

        for(i=1;  i<=str;  i++){

            for(j=1; j<=i;  j++)
                System.out.print(j) ;

            System.out.println();
        }
    }
}
