package ssgstringManipulation;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {

        //  1.Ornek : Bir String da  herhangi bir karakter olup olmadığını kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String str = scan.nextLine();


        String ch = "a";

        boolean varMi = str.contains(ch);
        System.out.println(varMi);

        if(varMi){
            System.out.println(ch + " : Karakteri var");
        }else{
            System.out.println(ch + " : Karakteri yok");
        }








    }
}
