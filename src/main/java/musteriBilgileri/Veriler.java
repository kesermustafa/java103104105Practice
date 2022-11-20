package musteriBilgileri;

 /*
                     1) Kullanicidan kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu, alin
                     2) Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin

                     saveInfo() method olusturun:
                     3)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
                     4)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
                     5)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

                	 getInfo() method olusturun:
          		     1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
                     2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

                     removeInfo() method olusturun:
                     1)Kimlik numarasini girerek data silin.
                     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
                     3)Collection bos ise kullaniciya hata mesaji verin.

                     selectOption() method olusturun:
                     1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
           */


public class Veriler {

    private Integer kimlikNo;
    private String adSoyad;
    private String adres;
    private String telefonNo;

    public Veriler(String adSoyad, String adres, String telefonNo) {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.telefonNo = telefonNo;
    }

    public Integer getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(Integer kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    @Override
    public String toString() {
        return "{"+
                "adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                ", telefonNo=" + telefonNo +
                '}';
    }
}
