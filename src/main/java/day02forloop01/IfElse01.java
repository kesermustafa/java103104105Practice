package day02forloop01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class IfElse01 {


    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter time1 = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime saat = time;
        int zaman = saat.getHour();

        if(zaman < 10 ){
            System.out.println("gunaydin");
        }else if(zaman < 14){
            System.out.println("tunaydin");
        }else if(zaman < 18) {
            System.out.println("tunaydin");
        }else if(zaman < 22){
            System.out.println("iyi aksamlar");
        }else{
            System.out.println("ii geceler");
        }

    }

}
