package devtim;

public class FabrikaCikolata {

    public static double cikolata = 13.99;

    public static double cikolataGelir;

    public void uretim( int uretilen){
        DepoStok.cikolataStokAdet+=uretilen;
    }

    public void satis(int satis){
        DepoStok.cikolataStokAdet-=satis;
        cikolataGelir += (cikolata*satis);

    }

}
