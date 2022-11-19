package Market;

import java.util.Scanner;

public class Giris {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Giris yapacaginiz urun addini secin");
        String ad = input.nextLine().toUpperCase();

        UrunTanimlamaGiris urun = new UrunTanimlamaGiris("un", "koy", 5, "Cuval", 10);

        Depo.un.add(String.valueOf(urun));


        System.out.println(Depo.un);






    }



}
