package ssgstringManipulation;

public class S06 {
    public static void main(String[] args) {
        //tum bosluk karakterlrei silin

        String str = "Ali!  13 yasinda  , 15 yasında olduğunu dusunuyorum.";
        String str2 = str.replaceAll(" ", "");
        System.out.println(str2);


       // Örnek6: Tüm harfleri ! değiştirin code yaziniz

        System.out.println(str.replaceAll("[a-zA-Z]", "!"));

        System.out.println(str.replaceAll("[0-9]", "*"));

    }
}
