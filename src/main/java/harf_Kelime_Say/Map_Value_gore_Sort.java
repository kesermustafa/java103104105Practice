package harf_Kelime_Say;

import java.util.*;

public class Map_Value_gore_Sort {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);
        map.put("F", 8);
        map.put("G", 4);

        sortedMapValue(map);

    }

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
