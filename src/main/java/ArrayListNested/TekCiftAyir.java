package ArrayListNested;

import java.util.ArrayList;
import java.util.List;

public class TekCiftAyir {


    public static void main(String[] args) {


        List<List<String>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add("1");
        list.get(0).add("3");
        list.get(0).add("5");
        list.get(1).add("2");
        list.get(1).add("4");
        list.get(1).add("6");
        list.get(2).add("7");
        list.get(2).add("9");
        list.get(2).add("11");
        list.get(3).add("8");
        list.get(3).add("10");
        list.get(3).add("12");

        System.out.println(list);

        List<String> cift = new ArrayList<>();
        List<String> tek = new ArrayList<>();



        for(List<String> w : list){

            for (String e : w){

                int d = Integer.parseInt(e);

                if(d%2==0){

                    cift.add(e);

                }else{
                    tek.add(e);
                }
            }

        }

        System.out.println(cift);
        System.out.println(tek);




    }
}
