package yolcu_rezervasyon;

import java.util.*;

public class Otobus1 {


   static Scanner input = new Scanner(System.in);
   static String str;

   public static void seferSecimi(){

       System.out.println("Sefer seci yapiniz\nAnkara icin\t\t==> A\nIstanbul icin\t==> I\nCikmak icin\t\t==> Q girin");
       String secim = input.nextLine().toUpperCase().substring(0,1);
       str=secim;
       while (true){

           if(secim.equals("A")){
                Ankara.ankara();
                break;
           }
           if(secim.equals("I")){
               Istanbul.istanbul();
               break;
           }
           if (secim.equals("Q")){
               break;
           }
       }

   }







}
