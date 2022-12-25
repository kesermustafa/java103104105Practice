package harf_Kelime_Say;

import java.util.Arrays;

public class Core_Java_Cozum {
    public static void main(String[] args) {

        String s = "Berna bugun aradi gece uzun uzun konustuk";

        //split()
        String ch[] = s.split("");
        System.out.println(Arrays.toString(ch));

        //sort()
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        //counter
        int counter = 0;

        for(int i=1; i<ch.length; i++) {
            if(ch[i-1].equals(ch[i])) {
                counter++;
            }else {
                System.out.println(ch[i-1] + "'in sayisi:" + (counter + 1));
                counter = 0;
            }
            if(i==ch.length-1) {
                System.out.println(ch[i] + "'in sayisi:" + (counter + 1));
            }
        }

        System.out.println("*-----------------------* ");
    }
}
