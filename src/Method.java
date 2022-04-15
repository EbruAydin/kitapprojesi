import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {

        static List<KitapciDeposu> kitapListesi = new ArrayList();
        static Scanner scan=new Scanner(System.in);


        public static void main(String[] args) {

            anaMenu();
        }

        public static void anaMenu() {
            System.out.println("====================================\n\t " +
                    "Q10 kITAP CENTER'A HOSGELDINIZ " +
                    "\n\t====================================" +
                    "\n============= İŞLEMLER =============\r\n     " +
                    "1-KITAP EKLEME \r\n    " +
                    " 2-NUMARA ILE KITAP ARAMA\r\n     " +
                    "3-BILGI ILE KITAP ARAMA \r\n     " +
                    "4-NUMARA ILE SİLME\r\n     " +
                    "5-KITAP LISTELEME\r\n     " +
                    "6-CIKIS");
            System.out.println("Bir islem seciniz");
            int tercih = scan.nextInt();
            switch(tercih) {
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
            }

        }

        private static void cikis() {
            System.out.println("Bizi tercih ettiginiz tesekkur ederiz.");
        }

        private static void kitapListele() {//Ebru
        }

        private static void numaraIleSil() {//Mukiye H.
        }

        private static void bilgiIleKitap() {//Ebru
        }

        private static void numaraIleKitap() {//Nail B.
        }

        private static void kitapEkle() {//Serkan B.
        }

    }


