package maps;

import java.util.HashMap;
import java.util.Map;

public class Soru01 {

    public static void main(String[] args) {

        Map<Integer, String> map  = new HashMap<>();

        map.put(0, "Burak");
        map.put(1, "Hamdi");
        map.put(2, "TUFAN");


        map.put(0, "The");
        map.put(1, "Code");
        map.put(2, "Program");

        System.out.println(map);


        map.remove(0);
        System.out.println( map);

        map.put(0, "the");
        map.put(3, "the");
        System.out.println( map);
    }
}
