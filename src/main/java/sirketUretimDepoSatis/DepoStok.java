package sirketUretimDepoSatis;

import java.util.Scanner;

public class DepoStok {

    private int biskuviStokAdet;
    private int cikolataStokAdet;

    double bisFiyat = 5.9;
    double cikFiyat = 15.5;


    private double biskuviGelir;
    private double cikolataGelir;
    private double toplamGelir = biskuviGelir + cikolataGelir;

    Scanner input = new Scanner(System.in);
    public int getBiskuviStokAdet() {
        return biskuviStokAdet;
    }

    public int setBiskuviStokAdet(int biskuviStokAdet) {
        this.biskuviStokAdet = biskuviStokAdet;
        return biskuviStokAdet;
    }

    public int getCikolataStokAdet() {
        return cikolataStokAdet;
    }

    public void setCikolataStokAdet(int cikolataStokAdet) {
        this.cikolataStokAdet = cikolataStokAdet;
    }

    public double getBiskuviGelir() {
        return biskuviGelir;
    }

    public void setBiskuviGelir(double biskuviGelir) {
        this.biskuviGelir = biskuviGelir;
    }

    public double getCikolataGelir() {
        return cikolataGelir;
    }

    public void setCikolataGelir(double cikolataGelir) {
        this.cikolataGelir = cikolataGelir;
    }

    public double getToplamGelir() {
        return toplamGelir;
    }

    public void setToplamGelir(double toplamGelir) {
        this.toplamGelir = toplamGelir;
    }

    public int biskuviUretim (int uretim){
        biskuviStokAdet = biskuviStokAdet + uretim;
        return biskuviStokAdet;
    }

    public int biskuviSatis (int satis){
        biskuviStokAdet = biskuviStokAdet - satis;
        return biskuviStokAdet;
    }

    public int cikolataUretim (int uretim){
        cikolataStokAdet = cikolataStokAdet + uretim;
        return cikolataStokAdet;
    }

    private int cikolataSatis (int satis){
        cikolataStokAdet = cikolataStokAdet - satis;
        return cikolataStokAdet;
    }


    private double biskuviGelir(int satis){
        biskuviGelir = biskuviGelir + (bisFiyat*satis);
        return biskuviGelir;
    }

    private double cikolataGelir(int satis){
        cikolataGelir = cikolataGelir + (cikFiyat*satis);
        return cikolataGelir;
    }


    public void biskuviUretim() {
        System.out.println("Uretilen biskuvi miktarini giriniz..");
        int uretilen = input.nextInt();
        if (uretilen > 0) {
            biskuviUretim(uretilen);
        } else {
            System.out.println("gecerli uretim iktari giriniz...");
        }
    }

    public void biskuviSatis() {
        System.out.println("Satilan biskuvi miktarini giriniz..");
        int satilanBiskuvi = input.nextInt();
        if (satilanBiskuvi > 0) {
            biskuviSatis(satilanBiskuvi);
            biskuviGelir(satilanBiskuvi);
        } else {
            System.out.println("gecerli uretim iktari giriniz...");
        }
    }


        public void cikolataUretim(){
            System.out.println("Uretilen cikolata miktarini giriniz..");
            int uretilenCikolata = input.nextInt();
            if(uretilenCikolata>0){
               cikolataUretim(uretilenCikolata);

            }else{
                System.out.println("gecerli uretim iktari giriniz...");
            }

    }

        public void cikolataSatis(){
            System.out.println("Satilan cikolata miktarini giriniz..");
            int satilanCikolata = input.nextInt();
            if(satilanCikolata>0){
                cikolataSatis(satilanCikolata);
                cikolataGelir(satilanCikolata);
            }
        }






}
