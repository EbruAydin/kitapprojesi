import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class method {

    static List<KitapciDeposu> kitapListesi=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {

        anaMenu();//method call
    }


    public static void anaMenu(){

        System.out.println("====================================\n" +
                "\t Q10 kITAP CENTER'A HOSGELDINIZ \n" +
                "\t====================================\n" +
                "============= İŞLEMLER =============\r\n"
                + "     1-KITAP EKLEME \r\n"
                + "     2-NUMARA ILE KITAP ARAMA\r\n"
                + "     3-BILGI ILE KITAP ARAMA \r\n"
                + "     4-NUMARA ILE SİLME\r\n"
                + "     5-KITAP LISTELEME\r\n"
                + "     6-CIKIS");

        System.out.println("bir islem seciniz");
        int tercih=scan.nextInt();


        switch(tercih){

            case 1:
                kitapEkle();
                anaMenu();
                break;
            case 2:
                numaraIleKitap();
                anaMenu();
                break;
            case 3:
                bilgiIleKitap();
                anaMenu();
                break;
            case 4:
                numaraIleSil();
                anaMenu();
                break;
            case 5:
                kitapListele();
                anaMenu();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("hatali giris");
                anaMenu();
                break;

        }



    }

    private static void cikis() {

        System.out.println("Bizi tercih ettiginiz tesekkur ederiz.");
    }

    private static void kitapListele() {//Ebru H.
        //Scan ile secim yaptir
        //o secimi de dongu yap
        // for ile yap
        //if kullanmaya calis-boolean denemey calis
        //yoksa da kitap ekleme listesine yolla
        //for ile cikti sonuc olacak.
    }

    private static void numaraIleSil() {//Mulkiye H.

        //remove kullanilir

    }

    private static void bilgiIleKitap() {//Ebru H.


    }

    private static void numaraIleKitap() {//Nail B.
    }

    private static void kitapEkle() {//Serkan B.

        //add() kullanilir

    }








}
