package devtim;

public class Muhasebe {

    public static double toplamGelir;


    public void maasOde(double maas){
        toplamGelir -= maas;
    }

    public void krediAl(double kredi){
        toplamGelir+=kredi;
    }

    public void borcOde(double borc){
        toplamGelir -=borc;
    }




}
