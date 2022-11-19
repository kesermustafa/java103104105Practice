package devtim;

public class SirketRunner {
    public static void main(String[] args) {

        FabrikaCikolata cikolata = new FabrikaCikolata();
        cikolata.uretim(5000);
        cikolata.uretim(7200);
        cikolata.uretim(8300);
        cikolata.uretim(9400);
        cikolata.uretim(9000);

        FabrikaCikolata satis = new FabrikaCikolata();
        satis.satis(1000);





        FabrikaBiskivi biskuvi = new FabrikaBiskivi();
        biskuvi.uretim(7000);
        biskuvi.uretim(7800);
        biskuvi.uretim(7930);
        biskuvi.uretim(9300);


        biskuvi.satis(2000);



        System.out.println( "Biskuvi Stok =  " + DepoStok.biskuviStokAdet);
        System.out.println("Cikolata Stok =  " + DepoStok.cikolataStokAdet);

        System.out.println("Biskuvi Gelir = " + FabrikaBiskivi.biskivuGelir);
        System.out.println("Cikolata gelir = " + FabrikaCikolata.cikolataGelir);

        System.out.println("Sirket kasa  =  " + (FabrikaCikolata.cikolataGelir + FabrikaBiskivi.biskivuGelir));





    }
}
