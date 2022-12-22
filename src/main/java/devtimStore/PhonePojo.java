package devtimStore;

public class PhonePojo {
    /*Cep Telefonu ürünlerinin özellikleri :
    Ürünün sistemde kayıtlı benzersiz numarası
    Birim fiyatı
    İndirim oranı
    Stok miktarı
    Ürün adı
    Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)
    Telefonun hafıza bilgisi (128 GB, 64 GB)
    Ekran Boyutu (6.1 Inc)
    Pil Gücü (4000)
    RAM (6 MB)
    Renk (Siyah,Kırmızı,Mavi)*/

    /*Notebook ürünlerinin özellikleri :
    Ürünün sistemde kayıtlı benzersiz numarası
    Birim fiyatı
    İndirim oranı
    Stok miktarı
    Ürün adı
    Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)
    Ram (8 GB)
    Depolama (512 SSD)
    Ekran Boyutu (14 inç)*/

    private int urunId;
    private String urunAdi;
    private String urunMarkasi;
    private int urunFiyati;
    private String hafizaBilgi;
    private double ekranBoyutu;
    private int pilGucu;
    private int ramBilgi;
    private String renk;

    public static int stokMiktari;

    // Cep telefonu construtor
    public PhonePojo(int urunId, String urunAdi, String urunMarkasi, int urunFiyati, String hafizaBilgi, double ekranBoyutu, int pilGucu, int ramBilgi, String renk, int stokMiktari) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.urunMarkasi = urunMarkasi;
        this.urunFiyati = urunFiyati;
        this.hafizaBilgi = hafizaBilgi;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ramBilgi = ramBilgi;
        this.renk = renk;
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

    public static int getStokMiktari() {
        return stokMiktari;
    }

    public static void setStokMiktari(int stokMiktari) {
        PhonePojo.stokMiktari = stokMiktari;
    }

    public String getHafizaBilgi() {
        return hafizaBilgi;
    }

    public void setHafizaBilgi(String hafizaBilgi) {
        this.hafizaBilgi = hafizaBilgi;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public int getRamBilgi() {
        return ramBilgi;
    }

    public void setRamBilgi(int ramBilgi) {
        this.ramBilgi = ramBilgi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return

        System.out.printf("%-5s %-15S %-12s %-10d %-10s %-10.2f %-10d %-8d %-12s %-6d %n", urunId, urunAdi, urunMarkasi,urunFiyati, hafizaBilgi, ekranBoyutu, pilGucu, ramBilgi, renk, stokMiktari).toString();


    }



}

