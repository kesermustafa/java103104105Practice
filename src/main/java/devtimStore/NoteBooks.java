package devtimStore;

public class NoteBooks {

    private int urunId;
    private String urunAdi;
    private String urunMarkasi;
    private int urunFiyati;
    private double ekranBoyutu;
    private int ramBilgi;
    private int ssd;
    public static int stokMiktari;


    // NoteBook construtor
    public NoteBooks(int urunId, String urunAdi, String urunMarkasi, int urunFiyati, double ekranBoyutu, int ramBilgi, int ssd) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.urunMarkasi = urunMarkasi;
        this.urunFiyati = urunFiyati;
        this.ekranBoyutu = ekranBoyutu;
        this.ramBilgi = ramBilgi;
        this.ssd = ssd;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunMarkasi() {
        return urunMarkasi;
    }

    public void setUrunMarkasi(String urunMarkasi) {
        this.urunMarkasi = urunMarkasi;
    }

    public int getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(int urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getRamBilgi() {
        return ramBilgi;
    }

    public void setRamBilgi(int ramBilgi) {
        this.ramBilgi = ramBilgi;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public static int getStokMiktari() {
        return stokMiktari;
    }

    public static void setStokMiktari(int stokMiktari) {
        NoteBooks.stokMiktari = stokMiktari;
    }

    @Override
    public String toString() {
        return "NoteBooks{" +
                "urunId=" + urunId +
                ", urunAdi='" + urunAdi + '\'' +
                ", urunMarkasi='" + urunMarkasi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", ekranBoyutu=" + ekranBoyutu +
                ", ramBilgi=" + ramBilgi +
                ", ssd=" + ssd +
                '}';
    }

}
