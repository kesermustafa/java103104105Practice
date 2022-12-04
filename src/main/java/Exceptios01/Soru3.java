package Exceptios01;

public class Soru3 {
    public static void main(String[] args) {
        try {
            int a[]= {7, 8, 9};
            for (int i = 1; i <= 2; i++){
                System.out.println(a[i]);
            }
        } catch(Exception e) {
            System.out.println ("Exception");
        }finally {
            System.out.println("Done!");
        }


    }
}
