package Map_Sorted;

import java.util.*;

public class GenericMapValueSorted {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);
        map.put("F", 8);
        map.put("G", 4);


        System.out.println("orderArr(map) = " + orderArr(map));


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "D");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(7, "G");
        map1.put(1, "A");
        map1.put(6, "F");
        map1.put(5, "E");


        System.out.println("orderArr(map) = " + orderArr(map1));

    }





    public static <K, V extends Comparable<V>> LinkedHashMap<K, V > orderArr (Map<K, V> array) {

        LinkedHashMap<K, V> sortedMap = new LinkedHashMap<>();

        ArrayList<V> list = new ArrayList<>();

        for (Map.Entry<K, V> entry : array.entrySet()) {
            list.add(entry.getValue());
        }

        Collections.sort(list);

        for (V num : list) {
            for (Map.Entry<K, V> entry : array.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put( entry.getKey(), entry.getValue());
                }
            }
        }

        return sortedMap;
    }


}
