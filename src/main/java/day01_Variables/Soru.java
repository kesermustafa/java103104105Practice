package day01_Variables;

public class Soru {
    public static void main(String[] args) {

        String str = "WW3";

        if(str.length()>2){
            System.out.println("Kisaltma iki katakterden fazla olamaz");
        }
        if(str.replaceAll("[^a-z]","").length()>0){
            System.out.println("Kucuk harf icermez");
        }
        if(str.replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("Harf harici karakter icermez");
        }

     


    }
}
