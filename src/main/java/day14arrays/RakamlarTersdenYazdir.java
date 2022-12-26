package day14arrays;

public class RakamlarTersdenYazdir {

    public static void main(String[] args) {

        int number = 196753420;
        System.out.println(number);

        while (number>0){
            System.out.print(number%10);
            number=number/10;
        }


    }
}
