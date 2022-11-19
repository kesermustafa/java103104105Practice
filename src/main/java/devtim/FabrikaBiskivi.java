package devtim;

public class FabrikaBiskivi {

    public static double bikuvi = 3.75;

    public static double biskivuGelir;


    public void uretim( int uretilen){
        DepoStok.biskuviStokAdet+=uretilen;
    }


    public void satis(int satis){
        DepoStok.biskuviStokAdet-=satis;
        biskivuGelir = biskivuGelir + (bikuvi*satis);

    }




}
