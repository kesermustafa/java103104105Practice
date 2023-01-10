package sirketUretimDepoSatis;

import java.util.Scanner;

public class Methods extends DepoStok {

    Scanner input = new Scanner(System.in);


    public void login() {
        boolean flag = true;
        do{
        System.out.println("Yapmak istediginiz islemi seciniz");
        System.out.println("1 : Uretim");
        System.out.println("2 : Satis");
        System.out.println("3 : Stok goruntule");
        System.out.println("4 : Muhasebe");
        System.out.println("5 : Cikis");


        int option = input.nextInt();
        switch (option) {

            case 1:
                uretim();
                break;
            case 2:
                satis();
                break;
            case 3:
                stokGor();
                break;
            case 4:
                muhasebe();
                break;
            case 5:
                flag=false;
                break;

            default:
                System.out.println("yanlis secim yaptiniz...");
        }

            if(option==5){
                flag=false;
            }

        }while (flag);
    }

    public void uretim (){

            System.out.println("Yapmak istediginiz islemi seciniz");
            System.out.println("1 : Biskuvi uretim");
            System.out.println("2 : Cikolata uretim");
            System.out.println("3 : Giris ekrani ");
            System.out.println("4 : Cikis/Exit");

            int option = input.nextInt();
            switch (option) {

                case 1:
                    biskuviUretim();
                    break;
                case 2:
                    cikolataUretim();
                    break;
                case 3:
                    login();
                case 4:
                    break;
                default:
                    System.out.println("yanlis secim yaptiniz...");
            }

    }

    public void satis (){

        System.out.println("Yapmak istediginiz islemi seciniz");

        System.out.println("1 : Biskuvi satis");
        System.out.println("2 : Cikolata satis");
        System.out.println("3 : Giris ekrani");
        System.out.println("4 : Cikis/Exit");

        int option = input.nextInt();
        switch (option){

            case 1:
                biskuviSatis();
                break;
            case 2:
                cikolataSatis();
                break;
            case 3:
                login();
            case 4:
                break;
            default:
                System.out.println("yanlis secim yaptiniz...");
        }
    }

    public void muhasebe(){

        System.out.println("Yapmak istediginiz islemi seciniz");
        System.out.println("1 : Biskuvi gelir");
        System.out.println("2 : Cikolata gelir");
        System.out.println("3 : Toplam gelir");
        System.out.println("4 : Giris ekrani");
        System.out.println("5 : Cikis/Exit");

        int option = input.nextInt();
        switch (option){

            case 1:
                System.out.println("BiskuviGelir = " + getBiskuviGelir());
                break;
            case 2:
                System.out.println("CikolataGelir = " + getCikolataGelir());
                break;
            case 3:
                setToplamGelir(getCikolataGelir() + getBiskuviGelir());
                System.out.println("ToplamGelir = " + getToplamGelir());
                System.out.println("Toplam = " + (getCikolataGelir() + getBiskuviGelir()));
                break;
            case 4:
                login();
            case 5:
                break;
            default:
                System.out.println("yanlis secim yaptiniz...");
        }


    }



    public void stokGor(){

        System.out.println("Yapmak istediginiz islemi seciniz");
        System.out.println("1 : Biskuvi stok");
        System.out.println("2 : Cikolata stok");
        System.out.println("3 : Login");
        System.out.println("4 : Cikis/Exit");

        int option = input.nextInt();
        switch (option){

            case 1:
                System.out.println(getBiskuviStokAdet());
                break;
            case 2:
                System.out.println(getCikolataStokAdet());
                break;
            case 3:
               login();
                break;
            case 4:
                break;
            default:
                System.out.println("yanlis secim yaptiniz...");
        }

    }


}
