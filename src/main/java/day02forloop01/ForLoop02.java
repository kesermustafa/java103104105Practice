package day02forloop01;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {
        int i,j,n,s,x;
        System.out.print ("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();


//        for(i=1; i<=n; i++)
//        {
//            for(x=n-1; x>=i; x--){
//                System.out.print(" ");
//            }
//
//            for(j=1; j<i; j++){
//                System.out.print("* ");
//             }
//            System.out.println();
//        }

        s=n;
        for(i=1;i<=n;i++){
            for(x=s;x!=0;x--){
                System.out.print(" ");
            }

            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            s--;
        }

    }
}
