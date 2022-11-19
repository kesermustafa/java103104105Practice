package yolcu_rezervasyon;

public class RezervasyonRunner {
    public static void main(String[] args) {


        Otobus1.seferSecimi();

        System.out.println( Ankara.ankaraKasa);
        System.out.println( Istanbul.istanbulKasa);

        System.out.println("Istanbul seferi "+ Istanbul.istanbul);
        System.out.println("Ankara seferi "+ Ankara.ankara);

    }
}
