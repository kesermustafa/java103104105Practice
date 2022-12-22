package devtimStore;

import java.util.*;

public class Store {

    public static List<PhonePojo> phoneList = new ArrayList<>();
    public static List<PhonePojo> noteBookList = new ArrayList<>();
    public static List<Markalar> markalar = new ArrayList<>();



    public static <T> void main(String[] args) {

        markalar.add(new Markalar(1001, "Samsung"));
        markalar.add(new Markalar(1002, "Lenovo"));
        markalar.add(new Markalar(1003, "Apple"));
        markalar.add(new Markalar(1004, "Huawei"));
        markalar.add(new Markalar(1005, "Casper"));
        markalar.add(new Markalar(1006, "Asus"));
        markalar.add(new Markalar(1007, "HP"));
        markalar.add(new Markalar(1008, "Xiaomi"));
        markalar.add(new Markalar(1009, "Monster"));

        Methods.markaAd_sirlariListele(markalar);

        System.out.println();

        Methods.id_siraliListele(markalar);

        Markalar obj1 = new Markalar(1001, "Samsung");
        PhonePojo phone = new PhonePojo(101, "GalaxyS22", obj1.getMarkaAd(), 14500, "256 MB", 6.2, 5000, 4, "Beyaz", PhonePojo.getStokMiktari());
        PhonePojo.stokMiktari++;
        PhonePojo phone1 = new PhonePojo(101, "GalaxyS22", obj1.getMarkaAd(), 14500, "256 MB", 6.2, 5000, 4, "Beyaz", PhonePojo.getStokMiktari());
        PhonePojo.stokMiktari++;


        phoneList.add(phone);
        phoneList.add(phone1);

        System.out.println(phoneList);




    }

}
