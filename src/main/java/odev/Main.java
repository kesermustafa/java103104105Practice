package odev;

public class Main {
    /*
    //Encapsulation ===> Java da sınıf icerisnde tanımladıgımız degisken yada methodlarımızın bizim verdiğimiz ,
    ölçüde degistirilebilmesi yada degistirilememesidir.

    Kısaca bir class'taki degiskenlerin ve methodların kullanımının kısıtlanması ve korunmasıdır.

    Tabi ki bu korumanın dereceleri bulunuyor bu dereceleri "Erisim Belirleyiciler" bizim derste ögrendiğimiz adıyla "Access Modifiers"
    'lar ile belirliyoruz  peki nedir bu Erisim belirleyiciler.

    1- Public: Kısaca "Heryerden Ulasilabilir" diyebiliriz. Public sistemdeki tüm sınıflardan erişebilmeyi saglar yalnızca aynı
    proje icinden degil diger projelerden de erisim saglanabilir.

    2- Default  (Package Private): Sadece tanımlandıgı pakette kullanılabilir. Degiskeni yada methodu default yapmak  icin ya default yazarız
   yada acces modifier kısmına birsey yazılmaz ise default olarak işlem görür. Deafult diger pakertlerden erisime izin vermez.

   3- Protected : Korumalı anlamındadır. O gruba üyeler ve gruba üye olanların cocuklari kullanabilir. Child classlar tarafından kullanılabilir.
   Childe classlar baska packageda'da olsa eger "access modifier" olarak "protected" ise kullanılabilir.

   4- Private : Sadece olusturuldugu Class(Sınıf) içersinde ulaşılabilirdir. Ancak getter ve setter methodlarını kullnarak diger Classlardan
   erisimi saglayabiliriz. Bu erisimde bizim getter ve setter methodlarında izin verdigmiz kadar olabilir.
   Örnegin degiskeni sadece görmesine izin vermek istiyorsak sadece getter methodunu kullanırız . Eger degiskende degisiklik yapılmasına da izim
    vereceksek setter methodunu da olusturmamız gerekir.
   bir degisklik yapmasına izin vermemiş oluyoruz.

     */ // Bu durumları örnekler üzerinden görmeye çalışalım...
    
    
    public static void main(String[] args) {

            Book harryPoter=new Book("Harry Potter",200);
            Book lordOfTheRings=new Book("Lord of The Rings",-870); // anlamsız deger atadı sayfa sayısı eksi oldu.

     //     System.out.println("Lord Of The Rings Page Number =" + lordOfTheRings.pageNumber);
        
        /////// ****************** constructor icinde if ile çözüm ******************** ///////////
        
            // Nesne içiersinde Eksi atanmasının önüne gecmek icin constructor içerinde eksi atandıgında degeri "Sıfır" 'a cektik.

       //   lordOfTheRings.pageNumber=-99; // Constructor içinde ki önleme ragmen nesne adı ile degiskeni cagirip eksi atayabildik.

      //     System.out.println("Lord Of The Rings Page Number =" + lordOfTheRings.pageNumber);


        ///////************************** Access Modifier'ı Private yaparak anlamsız deger atamanın önlenmesi ***********/////
        
//        Constructor icerisinde ki if ile aldıgımız önleme ragmen nesne ile cagırıp degiskene eksi atamanın önüne ise
//         öncelikle degiskeni "private" yaptık.Degiskeni görebilmek icin ise getter methodunu kullanıdık ama dışarıdan set edilmesine izin vermedik.

          System.out.println("Lord Of The Rings Page Number = = " + lordOfTheRings.getPageNumber());
  //           lordOfTheRings.pageNumber=100; setter olmadıgı icin degisim yapamadık ...
        
//         Setter ile de başka Class'dan değişimine izin verdik ama Eksi atayabilme problemi burada da ortaya çıktı.
//        Bu durum icinde yine setter metodunun icerisine if blogu yazarak eksi yazılsa bile eksi çıktı alınmasının önüne gecmiş olduk.
//


       lordOfTheRings.setPageNumber(-100);
   //     System.out.println("Lord Of The Rings Page Number = " + lordOfTheRings.getPageNumber());



        


    }

}
