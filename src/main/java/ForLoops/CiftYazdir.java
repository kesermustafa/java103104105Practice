package ForLoops;

public class CiftYazdir {
    public static void main(String[] args) {

        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).
        OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */

      int sayi =21;
      int i = 0;
       do {
           if (sayi%2==0) {
               System.out.print(sayi + " ");
               sayi -= 2;
           }else{
               sayi -=1;
           }
       }while (i<=sayi);

        System.out.println("\n-----------");

       yaz(41);
        System.out.println("\n-----------");

        ciftYaz(41);

    }

    public static void ciftYaz(int a){
        if ( a> -1){
            if(a%2==0){
                System.out.print(a + " ");
            }
            yaz(a-1);
        }
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
