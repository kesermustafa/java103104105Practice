package Map_Sorted;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Key_Sorted {

    public static void main(String[] args) {


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "D");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(7, "G");
        map1.put(1, "A");
        map1.put(6, "F");
        map1.put(5, "E");

        TreeMap<Integer, String> treeMap = new TreeMap<>(map1);

        System.out.println("orderArr(map) = " + treeMap);

        System.out.println("sorted(map1) = " + keySorted(map1));



        Map<String, Integer> map = new HashMap<>();
        map.put("F", 8);
        map.put("B", 7);
        map.put("C", 3);
        map.put("A", 5);
        map.put("G", 4);
        map.put("D", 1);
        map.put("E", 2);

        System.out.println("keySorted(map) = " + keySorted(map));


    }

    // MAP KEY DEGERINE GORE GENERIC SORT METHOD
    public static <K, V> TreeMap<K, V> keySorted(Map<K, V> map ){

        TreeMap<K, V> treeMap = new TreeMap<>(map);

        return treeMap;

    }



}
