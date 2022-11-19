package day01_Variables;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int kisaKenar,uzunKenar,alan,cevre;
        System.out.print("Kısa Kenar: ");
        kisaKenar = reader.nextInt();
        System.out.print("Uzun Kenar: ");
        uzunKenar = reader.nextInt();

        cevre=cevre(kisaKenar,uzunKenar);
        System.out.println("Çevre = " + cevre);

        alan=alan(kisaKenar,uzunKenar);
        System.out.println("Çevre = " + alan);
    }
    public static int cevre(int kk, int uk) {
        int cevre;
        cevre=(kk+uk)*2;

        return cevre;
    }
    public static int alan(int kk, int uk) {
        int alan;
        alan=kk*uk;

        return alan;

    }
}
