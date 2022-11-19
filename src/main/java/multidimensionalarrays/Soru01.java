package multidimensionalarrays;

import java.text.DecimalFormat;

public class Soru01 {

    public static void main(String[] args) {

        /*
            {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}}
             *  Array de $ varsa 3.2 ile carp
             *  Array de £ varsa 4.2 ile carp
             *  elemanlarin toplamini  consola yazdir. sonuc = 374.6
        */

        String[][] arr =  {{"$12" , "$22" , "0$"},   {"£9" , "£40" , "$1" },  {"£12", "$2","$0"}};

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

        System.out.println("dolarSonuc = " + dolarSonuc);
        System.out.println("paundSonuc = " + paundSonuc);
        System.out.println(new DecimalFormat(".00").format(dolarSonuc+paundSonuc));

    }
}
