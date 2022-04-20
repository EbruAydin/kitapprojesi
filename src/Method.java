import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {

    static List<KitapciDeposu> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapSayac;


    public static void anaMenu() throws InterruptedException {
        System.out.println("====================================\n\t "
                + "Q10 kITAP CENTER'A HOSGELDINIZ " +
                "\n===================================" +
                "\n============= İŞLEMLER ============\r\n     " +
                "1-KITAP EKLEME \r\n    " +
                " 2-NUMARA ILE KITAP ARAMA\r\n     " +
                "3-BILGI ILE KITAP ARAMA \r\n     " +
                "4-NUMARA ILE SİLME\r\n     " +
                "5-KITAP LISTELEME\r\n " +
                "    6-CIKIS");
        System.out.println("Lutfen menuden bir islem seciniz");
        int tercih = 0;

<<<<<<< HEAD
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
=======
        while (true) {
            try {//try catch ile olasi int disinda girilecek variable onlenmeye calisildi
                tercih = scan.nextInt();
                if (tercih < 0 || tercih > 6) {
                    System.out.println("0 ile 6 arasinda bir rakam seciniz.");
                } else break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz. Lutfen bekleyiniz menuye yonlendirileceksiniz.");
                Thread.sleep(4000);//bekleme islemi yapilip, menu 4 saniye sonra gosterilecektir.
                anaMenu();
>>>>>>> Ebru
            }
        }


        switch (tercih) {//anaMenu() methodunu eklemeye gerek yok burada, zaten method icerisinde anamenu call edildi.
            case 1:
                kitapEkle();
                //anaMenu()
                break;
            case 2:
                numaraIleKitap();
                break;
            case 3:
                bilgiIleKitap();
                break;
            case 4:
                numaraIleSil();
                break;
            case 5:
                kitapListele();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("hatali giris");

        }

    }


    private static void cikis() {

        System.out.println("Bizi tercih ettiginiz tesekkur ederiz.");
    }

    private static void kitapListele() throws InterruptedException {//Ebru

        System.out.println("Sectiginiz kitaplarin bilgileri listelenecektir. Lutfen bekleyiniz.");
        Thread.sleep(4000);

        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println("*************");
            System.out.print("Kitap Adi: " + kitapListesi.get(i).getKitapAdi() + " " +
                    "\nKitap Yazari: " + kitapListesi.get(i).getYazarAdi() + " " +
                    "\nKitap No: " + kitapListesi.get(i).getKitapNo() + " " +
                    "\nKitap Fiyati: " + kitapListesi.get(i).getKitapFiyat() + " TL");
            System.out.println("\n*************");

        }
        System.out.println("Isleminiz basariyla gerceklesmistir. Menuye yonlendiriliyorsunuz, lutfen bekleyiniz.");
        Thread.sleep(4000);
    }

    private static void numaraIleSil() throws InterruptedException {//Mukiye H.

        boolean islem = true;
        System.out.println("silinecek kitap no giriniz:");
        int silinecekkitapNo = scan.nextInt();

        for (int i = 0; i < kitapListesi.size(); i++) {
            if (silinecekkitapNo == kitapListesi.get(i).getKitapNo()) {
                kitapListesi.remove(kitapListesi.get(i));
                System.out.println("Silme İşlemi Başarılı.");
                islem = false;
            }
        }//outer

        if (islem == true) {
            System.out.println("silmek için geçerli bir veri girin");
        }

        System.out.print("aramaya devam icin 1'e basiniz , Ana menu icin 0'a basiniz..: ");
        int tercih = 0;
        tercih = scan.nextInt();
        if (tercih == 1) {
            numaraIleSil();
        } else if (tercih == 0) {
            anaMenu();
        } else {
            System.out.println("hatali giris yaptiniz.");
        }

    }


    private static void bilgiIleKitap() throws InterruptedException {//Ebru-methdo adina yeniden BAK!

        System.out.println("Kitap adi ile aramak icin 1'e\t\nYazar adi ile aramak icin 2'ye" + "\t\nFiyat ile aramak icin 3'e basiniz");
        int secim = 0;

        while (true) {
            try {
                secim = scan.nextInt();
                if (secim < 1 || secim > 3) {
                    System.out.println("0 ile 4 arasinda bir rakam seciniz.");
                } else break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz.");
            }
        }


        switch (secim) {
            case 1: {
                System.out.println("Kitap adi giriniz :");
                scan.nextLine();//dummy
                String kitapAdi = scan.nextLine();
                System.out.println("Kitap Adi : " + kitapAdi);//yeni
                int kontrol = 0;//kitap yoksa 0, varsa 1 yeni

                for (KitapciDeposu each : kitapListesi) {
                    if (each.getKitapAdi().equalsIgnoreCase(kitapAdi)) {
                        System.out.println("*************");
                        System.out.println("Kitap Adi\t\t\t: " + each.getKitapAdi());
                        System.out.println("Kitap Yazari\t\t: " + each.getYazarAdi());
                        System.out.println("Kitap No\t\t\t: " + each.getKitapNo());
                        System.out.println("Kitap Fiyati\t\t: " + each.getKitapFiyat() + " TL");
                        System.out.println("*************"); // her kitap bilgisi arasina eklemek icin
                        kontrol++;
                    }
                }

                if (kontrol == 0) {
                    System.out.println("Aradiginiz kitap bulunamamistir");
                }


                System.out.println(" Isleminize devam etmek istiyorsaniz 1'e\nCikis yapmak icin 0'a basiniz");
                int tercih = 0;
                while (true) {
                    try {
                        tercih = scan.nextInt();
                        if (tercih < 0 || tercih > 1) {
                            System.out.println("0 ile 1 arasinda bir rakam seciniz.");
                        } else break;
                    } catch (Exception e) {
                        String str = scan.next();
                        System.out.println("Hatali giris yaptiniz.");
                    }
                }

                if (tercih == 1) {
                    bilgiIleKitap();
                } else if (tercih == 0) {
                    anaMenu();
                } else {
                    System.out.println("Hatali giris yaptiniz.");
                }
                break;
            }


            case 2: {
                scan.nextLine();//dummy
                System.out.println("Yazar adi giriniz :");
                String yazarAdi = scan.nextLine();
                System.out.println("Yazar Adi : " + yazarAdi);
                int kontrol = 0; // kitap yoksa 0, varsa 1


                for (KitapciDeposu each : kitapListesi) {
                    if (each.getYazarAdi().equalsIgnoreCase(yazarAdi)) {
                        System.out.println("*************");
                        System.out.println("Kitap Adi\t\t\t: " + each.getKitapAdi());
                        System.out.println("Kitap Yazari\t\t: " + each.getYazarAdi());
                        System.out.println("Kitap No\t\t\t: " + each.getKitapNo());
                        System.out.println("Kitap Fiyati\t\t: " + each.getKitapFiyat() + " TL");
                        System.out.println("*************"); // her kitap bilgisi arasina eklemek icin
                        kontrol++;
                    }
                }
                if (kontrol == 0) {
                    System.out.println("Aradiginiz yazar bulunamamistir");
                }

                System.out.println(" Isleminize devam etmek istiyorsaniz 1'e\nCikis yapmak icin 0'a basiniz");
                int tercih = 0;

                while (true) {
                    try {
                        tercih = scan.nextInt();
                        if (tercih < 0 || tercih > 1) {
                            System.out.println("0 ile 1 arasinda bir rakam seciniz.");
                        } else break;
                    } catch (Exception e) {
                        String str = scan.next();
                        System.out.println("Hatali giris yaptiniz.");
                    }
                }

                if (tercih == 1) {
                    bilgiIleKitap();
                } else if (tercih == 0) {
                    anaMenu();
                } else {
                    System.out.println("hatali giris yaptiniz.");
                }

                break;
            }


            case 3: {
                System.out.println("Kitap fiyati giriniz :");
                scan.nextLine();//dummy
                int kitapFiyati = scan.nextInt();

                int kontrol = 0; // kitap yoksa 0, varsa 1

                for (KitapciDeposu each : kitapListesi) {
                    if (each.getKitapFiyat() == kitapFiyati) {
                        System.out.println("*************");
                        System.out.println("Kitap Adi\t\t\t: " + each.getKitapAdi());
                        System.out.println("Kitap Yazari\t\t: " + each.getYazarAdi());
                        System.out.println("Kitap No\t\t\t: " + each.getKitapNo());
                        System.out.println("Kitap Fiyati\t\t: " + each.getKitapFiyat() + " TL");
                        System.out.println("*************"); // her kitap bilgisi arasina eklemek icin
                        kontrol++;
                    }
                }
                if (kontrol == 0) {
                    System.out.println("Aradiginiz fiyatta bir kitap bulunamamistir.");
                }


                System.out.println(" Isleminize devam etmek istiyorsaniz 1'e\nCikis yapmak icin 0'a basiniz");

                int tercih = 0;
                while (true) {
                    try {
                        tercih = scan.nextInt();
                        if (tercih < 0 || tercih > 1) {
                            System.out.println("0 ile 1 arasinda bir rakam seciniz.");
                        } else break;
                    } catch (Exception e) {
                        String str = scan.next();
                        System.out.println("Hatali giris yaptiniz.");
                    }
                }

                if (tercih == 1) {
                    bilgiIleKitap();
                } else if (tercih == 0) {
                    anaMenu();
                } else {
                    System.out.println("hatali giris yaptiniz.");
                }

                break;
            }
        }
    }


    private static void kitapEkle() throws InterruptedException {//Serkan B.

        System.out.print("kitap adi :");
        scan.nextLine();// dummy art arda olan scanlarde ilk sout altina
        String kitapAdi = scan.nextLine();
        System.out.print("yazar adi :");
        String yazarAdi = scan.nextLine();
        System.out.print("fiyat :");
        int kitapFiyat = scan.nextInt();
        int kitapNo = 1000 + kitapSayac;
        kitapSayac++;
        KitapciDeposu yeniKitap = new KitapciDeposu(kitapAdi, kitapNo, yazarAdi, kitapFiyat);
        kitapListesi.add(yeniKitap);

        System.out.print("Eklemeye devam etmek icin 1'e basiniz, Anamenu icin 0'a basiniz : ");
        int tercih = 0;
        tercih = scan.nextInt();
        if (tercih == 1) {
            kitapEkle();
        } else if (tercih == 0) {
            anaMenu();
        } else {
            System.out.println("hatali giris..");
        }

    }

    private static void numaraIleKitap() throws InterruptedException {//Nail B.

        System.out.println("kitabın nosunu gir..");
        int tercih1 = scan.nextInt();

        boolean varmi = true;

        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapListesi.get(i).getKitapNo() == tercih1) {
                System.out.println("Kitap adı: " + kitapListesi.get(i).getKitapAdi());
                System.out.println("Kitap Yazarı: " + kitapListesi.get(i).getYazarAdi());
                System.out.println("Kitap fiyatı: " + kitapListesi.get(i).getKitapFiyat());
                varmi = false;
            }
        }//outer

        if (varmi == true) {
            System.out.println("Aradiginiz numarada kitap bulunamadi.");
        }


        System.out.print("aramaya devam icin 1'e basiniz , Ana menu icin 0'a basiniz..: ");
        int tercih = 0;
        tercih = scan.nextInt();
        if (tercih == 1) {
            numaraIleKitap();
        } else if (tercih == 0) {
            anaMenu();
        } else {
            System.out.println("hatali giris yaptiniz.");
        }
    }
}

