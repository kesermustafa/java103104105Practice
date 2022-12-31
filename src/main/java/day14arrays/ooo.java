package day14arrays;

public class ooo {
    /*
        Herhangi bir loop kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program yazınız.

     */

    public static void main(String[] args) {
        yazdir(1);
    }


    public static void yazdir(int sayi){//-100ile -1

        if(sayi<101){
            System.out.print(sayi+", ");
            yazdir(sayi+1);
        }
    }
}
