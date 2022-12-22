package ForLoops;

public class Soru01 {
    public static void main(String[] args) {

        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).
        OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */

      int sayi =20;
      int i = 0;
       do {
           if (sayi%2==0) {
               System.out.print(sayi + " ");
               sayi -= 2;
           }
       }while (i<=sayi);

        System.out.println("\n-----------");

       yaz(20);
        System.out.println("\n-----------");


    }

    public static void yaz(int a){
        if ( a> -1){
            if(ciftBul(a)){
                System.out.print(a + " ");
            }
            yaz(a-1);
        }
    }

    public static boolean ciftBul(int i){
        return i%2==0;
    }



}
