package clismalar;

import java.util.Scanner;

public class CanHocaSoru {

    public static void main(String[] args) {

/*
Java'nın System.out.printf işlevi biçimlendirilmiş çıktıyı yazdırmak için kullanılabilir. Bu alıştırmanın amacı,
çıktıyı printf kullanarak biçimlendirme konusundaki anlayışınızı test etmektir.

Başlamanız için, çözümün bir kısmı sizin için editörde sağlanmıştır; çözümü tamamlamak için girişi biçimlendirmeli
ve yazdırmalısınız.

Giriş Formatı

Her giriş satırı, bir tamsayı tarafından takip edilen bir String içerecektir.
Her Dize maksimum 10 alfabetik karaktere sahip olacak ve her bir tamsayı, 0 ile 999 arasındaki kapsama aralığında olacaktır.

Çıkış formatı

Her çıktı satırında iki sütun olmalıdır:
İlk sütun String'i içerir ve tam olarak 15 karakter kullanılarak sola dayalıdır.
İkinci sütun, tam olarak 3 basamakla ifade edilen tamsayıyı içerir; orijinal giriş üç basamaktan azsa,
 çıktınızın baştaki basamaklarını sıfırlarla doldurmanız gerekir.
*/


        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0; i<3; i++){

            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d%n",s1, x);

        }
        System.out.println("================================");



    }




}
