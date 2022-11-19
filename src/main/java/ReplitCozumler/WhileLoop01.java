package ReplitCozumler;

import java.util.Scanner;

public class WhileLoop01 {

  /*
  Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
  ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;

    String name =“John came late"

    Expected Output: Number of a = 2
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");
        String isim = input.nextLine();
        System.out.println("Kontrol edeceginiz karakteri giriniz.");

        char ch = input.next().charAt(0);

        int i = 0;
        int counter = 0;
        while (i < isim.length()) {

            if(ch == isim.charAt(i)){
                counter++;
            }
                i++;
        }
        System.out.println(counter);





    }
}
