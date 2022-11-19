package kahveotomat;

import java.util.ArrayList;
import java.util.List;

public class giris {
    public static void main(String[] args) {



        //URUNLERIN HAZIRLANMASI
        List<String> urunler = new ArrayList<>();
        urunler.add("Su");
        urunler.add("Sicak su");
        urunler.add("Sutlu Filtre Kahve");
        urunler.add("Filtre Kahve");
        urunler.add("Americano");
        urunler.add("Espresso");
        urunler.add("Turk Kahvesi");
        urunler.add("Menengic");

        //FIYATLARIN HAZIRLANMASI
        List<Double> fiyatlar = new ArrayList<>();
        fiyatlar.add(1.00);
        fiyatlar.add(1.50);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(4.00);
        fiyatlar.add(3.50);

        urunler.set(2,"Cappuccino");
        fiyatlar.set(6,15.00);


        //URUN VE FIYATLARIN EKRANDA LISTELENMESI
        System.out.println("No\t\tFiyatlar\tUrunler");
        System.out.println("-------------------------------");

        for (int i = 1; i <= urunler.size(); i++) {
            System.out.print(i + "\t\t" + fiyatlar.get(i-1) + "€" + "\t\t" + urunler.get(i-1));
            System.out.println();
        }
        System.out.println("-------------------------------");


    }
}
