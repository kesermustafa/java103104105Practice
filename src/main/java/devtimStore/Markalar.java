package devtimStore;
public class Markalar  {

     int markaId;
     String markaAd;

    public Markalar(int markaId, String markaAd) {
        this.markaId = markaId;
        this.markaAd = markaAd;
    }

    public Markalar() {

    }

    public int getMarkaId() {
        return markaId;
    }

    public void setMarkaId(int markaId) {
        this.markaId = markaId;
    }

    public String getMarkaAd() {
        return markaAd;
    }

    public void setMarkaAd(String markaAd) {
        this.markaAd = markaAd;
    }


    @Override
    public String toString() {
        return "Markalar{" +
                "markaId=" + markaId +
                ", markaAd='" + markaAd + '\'' +
                '}';
    }


}
