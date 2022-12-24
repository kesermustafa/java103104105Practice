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

        System.out.println("*-----------------------* ");
        // 2 -----

        // Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz...
        // "I like to move it move it"

        String str = "I like to move it, move it.";

        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        // Kelimeleri almak icin split() kullanalim.

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        Map<String, Integer> gorun = new HashMap<>();

        for(String w : kelimeler){

            Integer gorunumSayisi = gorun.get(w);

            if(gorunumSayisi==null){

                gorun.put(w, 1);

            }else{
                gorun.put(w, gorunumSayisi+1);
            }
        }

        System.out.println(gorun);  // {move=2, like=1, I=1, to=1, it=2}

        System.out.println("*-----------------------* ");
        // 3 -----

        String str1 = "   Ali,   okula   ....,,,   geldi    ve Ayse    de okula    geldi.    ";
        kelimeleriSay(str1);





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
