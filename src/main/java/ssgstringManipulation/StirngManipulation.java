package ssgstringManipulation;

public class StirngManipulation {
    public static void main(String[] args) {

        String str = "Java kolay";
        System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));


        StringBuilder strB = new StringBuilder();
        strB.append(str);
        System.out.println(strB.reverse());







    }
}
