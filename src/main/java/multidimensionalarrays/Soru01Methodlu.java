package multidimensionalarrays;

import java.text.DecimalFormat;

public class Soru01Methodlu {

    public static void main(String[] args) {

        String[][] brr =  {{"$12" , "$22" , "11$"},   {"£9" , "£41" , "$11" },  {"£12", "$2","$0"}};

        arr(brr);

    }


    public static void arr(String[][] arr){

        double dolarSonuc = 0;
        double paundSonuc = 0;

        for(String[] w: arr){
            for (String k : w){
                if(k.contains("$")){
                    double dolar = Double.parseDouble(k.replace("$", ""));
                    dolarSonuc += dolar*3.2;
                }else {
                    double paund = Double.parseDouble(k.replace("£", ""));
                    paundSonuc += paund*4.2;
                }
            }
        }

        System.out.println("dolarSonuc = " + new DecimalFormat(".00").format(dolarSonuc));
        System.out.println("paundSonuc = " + new DecimalFormat(".00").format(paundSonuc));
        System.out.println("Genel Toplam = "+new DecimalFormat(".00").format(dolarSonuc+paundSonuc));

    }
}
