package Market;

public class UrunTanimlamaGiris {


    String brimi;
    String iD;
    String urunAdi;
    String urunUretici;
    int urunMiktari;
    int raf;

    public UrunTanimlamaGiris(String urunAdi, String urunUretici, int urunMiktari, String brimi, int raf) {

        this.urunAdi = urunAdi;
        this.urunUretici = urunUretici;
        this.urunMiktari = urunMiktari;
        this.brimi = brimi;
        this.raf = raf;
        iD = iD = urunUretici.substring(0,3)+(int)(Math.random()*100);


    }




}
