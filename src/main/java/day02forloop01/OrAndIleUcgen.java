package day02forloop01;

public class OrAndIleUcgen {

    public static void main(String[] args) {

        /*

             *
            * *
           *   *
          *     *
         *********

         */

        // Sekilde gorulen ucgeni yazdiriniz

            for (int i = 1; i <=5 ; i++) {//satir kontrolu

                for (int j = 1; j <= 9; j++) {//sutun kontrolu

                    if ((i == 1 && j == 5) ||
                        (i == 2 && (j == 4 || j == 6)) ||
                        (i == 3 && (j == 3 || j == 7)) ||
                        (i == 4 && (j == 2 || j == 8)) ||
                         i == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }


    }
}
