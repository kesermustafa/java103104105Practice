package BinarySayiToplama;

public class BinarySayiToplama {

    public static void main(String[] args) {

        /*
        Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.
        birinci binary number: 100010
        ikinci  binary number: 110010

        Beklenen Çıktı:   1010100
         */

        int a = 100010;
        int b = 110010;

       int toplam = 0 ;

        while (a>0){

            toplam = toplam + (a%10 + b%10);

            if(toplam==1 || toplam==0){
                System.out.println(toplam);
                toplam = 0;
            }else if(toplam==2){
                System.out.println(0);
                toplam = 1;
            }
            a=a/10;
            b=b/10;


        }













    }


}
