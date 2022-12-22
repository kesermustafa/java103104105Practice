package devtimStore;

import java.util.*;

public class Methods {


    public static void markaAd_sirlariListele( List<Markalar> entry){
        List<String> list = new ArrayList<>();
        for (Markalar entr : entry) {
            list.add(entr.getMarkaAd());;
        }
        Collections.sort(list);

        for(String w : list){
            System.out.println(w);
        }
    }


    public static void id_siraliListele(List<Markalar> marka){
        TreeMap<Integer, String> sirala = new TreeMap<>() ;
        for(Markalar w : marka){
            sirala.put(w.getMarkaId(),w.getMarkaAd());
        }
        for (Map.Entry<Integer, String> entry : sirala.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }





}
