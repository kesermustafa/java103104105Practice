package harf_Kelime_Say;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class PlakaTahmin {
    public static void main(String[] args) {

            ///---> Değişken Tanımlaması <---\\\
          //  String ayrac = new String(new char[15]).replace("\0", "-");

            ///---> Generic LinkedHashMap Tanımlaması <---\\\
            LinkedHashMap<Integer, String> plaka = new LinkedHashMap<>();
            ///---> Bazı Veriler Ekleyelim <---\\\
            plaka.put(01, "Adana");
            plaka.put(06, "Ankara");
            plaka.put(16, "Bursa");
            plaka.put(20, "Denizli");
            plaka.put(29, "Gümüşhane");
            plaka.put(42, "Konya");
            plaka.put(58, "Sivas");
            ///---> Kullanıcıdan veri almak ve diğer gerekli değişken tanımlamaları <---\\\
            int puan = 0;
            int dogru = 0;
            int yanlis = 0;
            int ch = 0;
            int list = 0;
            String tahmin;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n< Java LinkedHashMap Örnekleri >\n");
            while(list <= 58){
                if (plaka.containsKey(list)) {
                    if(ch >= 2){
                        System.out.print("-> ["+list+"] Plakası Hangi İle Aittir: ");
                        tahmin = scanner.nextLine();
                        if(plaka.get(list).equals(tahmin)){
                            puan += 100;
                            dogru += 1;
                        }
                        else{
                            yanlis += 1;
                            puan -= 50;
                        }
                        ch = 0;
                    }
                    else{
                        System.out.print("-> ["+plaka.get(list)+"] İli Hangi Plakaya Sahiptir: ");
                        tahmin = scanner.nextLine();
                        if(list == Integer.parseInt(tahmin)){
                            puan += 100;
                            dogru += 1;
                        }
                        else{
                            yanlis += 1;
                            puan -= 50;
                        }
                    }
                    ch++;
                }
                list++;
            }
            System.out.println("\n-> Doğru Sayısı: "+ dogru + "\n-> Yanlış Sayısı: "+ yanlis+"\n-> Toplanan Puan: "+ puan+"\n");
        }
    }

