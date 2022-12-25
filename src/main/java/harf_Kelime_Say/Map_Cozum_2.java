package harf_Kelime_Say;

import java.util.*;

public class Map_Cozum_2 {
    public static void main(String[] args) {


            String str1 = "   Ali,   okula   ....,,,   geldi    ve Ayse    de okula    geldi.    ";

//        kelimeleriSay(str1);
//        System.out.println("*-----------------*");
//
//        mapYazdir(map(str1));
//        System.out.println("*-----------------*");

//        Map<String, Integer> myMap = map(str1);  // key degerine sort yapmak icin
//        mapYazdir(myMap);
//        System.out.println("*-----------------*");
//
//        sortedMapValue(map(str1));  // Value derine gore sort yapar



    }

    // METHOD OLUSTURDUK
    public static void kelimeleriSay(String str){

        String yeniString = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim();
        System.out.println(yeniString);
        String[] arr = yeniString.split("");
        Map<String, Integer> map = new HashMap<>();

        for(String w : arr){
            if(!map.containsKey(w)){
                map.put(w, 1);
            }else {
                map.put(w, map.get(w)+1);
            }
        }
        System.out.println(map);


    }


    public static  Map<String, Integer> map (String str){
        String yeniString = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim();

        String[] arr = yeniString.split("");
        Map<String, Integer> map = new HashMap<>();

        for(String w : arr){
            if(!map.containsKey(w)){
                map.put(w, 1);
            }else {
                map.put(w, map.get(w)+1);
            }
        }
        return map;
    }

    //MAP yazdirma methodu
    public static void mapYazdir(Map<String, Integer> map){
        for(Map.Entry<String, Integer> w : map.entrySet()) {
            System.out.println(w.getKey() + "'in sayisi --> " + w.getValue());
        }

    }

    // Map value gore sort

    public static void sortedMapValue(Map<String, Integer> map){

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap);
    }



}
