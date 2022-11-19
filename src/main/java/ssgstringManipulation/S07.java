package ssgstringManipulation;

public class S07 {
    public static void main(String[] args) {


        // String da boşluktan farklı kaç karakter kullanılıyor code yaziniz .
        String str = "Ali!  13 yasinda  , 15 yasında olduğunu dusunuyorum.";

        System.out.println(str.replaceAll(" ", "").length());
    }
}
