package SaatAkrepYelkovanAciHesaplama;

public class AkrepYelkovanAci {

    public static void main(String[] args) {

        System.out.println(" Aci  " + saatAciHesapla(12, 30));

    }

    public static double saatAciHesapla(int saat, int dakika){

        double ek = (double) dakika/12;   // Yelkovan 12 birim tur attiginda akrep 1 birim hareket eder
        double akrepAci = ((saat%12)*30)+(ek*6);  // akrep acisi (her biri, arasi 30 derece oldugu icin saat*30 dedik)
        double yeniYelkovan = (double) dakika / 5;      //(ek*6) her birim arasinda 5 esit 6 derece deger farki var bu farki yelkovan hareketine ekledik
        double dakikaAci = yeniYelkovan * 30;   // yelkovan acisi

        double aci = Math.abs(akrepAci - dakikaAci);

        if (aci>180) return (360-aci);
        else return aci;
    }


}
