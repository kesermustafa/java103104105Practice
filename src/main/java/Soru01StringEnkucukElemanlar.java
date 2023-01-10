import java.util.Arrays;
import java.util.Comparator;

public class Soru01StringEnkucukElemanlar {

    public static void main(String[] args) {

        String[] b = new String[]{"Kemal","Bem","Jonathan","Aga", "Mark", "Angie", "Veli"};



        Arrays.sort(b, Comparator.comparingInt(String::length));
//        for(String w : b){
//            uzunluk = Math.min(uzunluk, w.length());
//        }
//
//        for(String w : b){
//
//            if(uzunluk==w.length() || (uzunluk+1)==w.length() ){
//
//                System.out.print(w + ", ");
//            }
//
//        }

        int uzunluk = b[0].length();

        for(int i =0 ; i<b.length; i++){
            uzunluk = Math.min(uzunluk, b[i].length());
        }

        for (int i=0; i<b.length; i++){
            if(b[i].length() == uzunluk || b[i].length() == uzunluk+1){
                System.out.print(b[i] + ", ");
            }
        }

        System.out.println();

        System.out.println(Arrays.toString(b));
        for (int i=1; i<b.length; i++){

            if(b[i-1].length() == b[i].length()){
                System.out.println(b[i-1]);
            }else if(b[i-1].length() != b[i].length()){
                System.out.println(b[i-1]);
            }

            if(b[i-1].length() != b[i].length()){
                break;
            }


        }

        
        


    }





}
