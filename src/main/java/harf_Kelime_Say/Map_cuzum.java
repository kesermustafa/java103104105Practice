package harf_Kelime_Say;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_cuzum {
    public static void main(String[] args) {

        // size verilen bir kelimedeki kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz...
        // abbcaa == a=3, b=2, c=1

        String kelime = "Stringde kullanilan harflerin kacar kere kullanildigini goster";
        HashMap<String, Integer> gorunum = new HashMap<>();
        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));

        for (String w : harfler) {
            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null) {
                gorunum.put(w, 1);
            } else {
                gorunum.put(w, gorunumSayisi + 1);
            }
        }
        System.out.println(gorunum);

        System.out.println("*-----------------------* ");

        // alt alta yazdir
        for(Map.Entry<String, Integer> w : gorunum.entrySet()) {
            System.out.println(w);
        }

        // aralari bosluklu yazdir
        for(Map.Entry<String, Integer> w : gorunum.entrySet()) {
            System.out.println(w.getKey() + "'in sayisi --> " + w.getValue());
        }


    }
}
