package harf_Kelime_Say;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HarfKelimeSay {

    public static void main(String[] args) {

        // size verilen bir kelimedeki kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz...
        // abbcaa == a=3, b=2, c=1

        String kelime = "abbcaa";
        HashMap<String, Integer> gorunum = new HashMap<>();
        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));

        for (String w : harfler){
            Integer gorunumSayisi = gorunum.get(w);
            if(gorunumSayisi==null){
                gorunum.put(w, 1);
            }else{
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);









    }


        // METHOD OLUSTURDUK
    public static void kelimeleriSay(String str){

        String yeniString = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim();
        System.out.println(yeniString);
        String[] arr = yeniString.split(" ");
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





}
