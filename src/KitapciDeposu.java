import java.util.Scanner;

public class KitapciDeposu {

    //POJO CLASS

    private String kitapAdi;
    private int kitapNo;
    private String yazarAdi;
    private int kitapFiyat;

    static Scanner scan = new Scanner(System.in);


    public KitapciDeposu() {
    }

    public KitapciDeposu(String kitapAdi, int kitapNo, String yazarAdi, int kitapFiyat) {

        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
        this.kitapNo = kitapNo;

    }

    public String getKitapAdi() {
        return this.kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;

    }

    public int getKitapNo() {
        return this.kitapNo;
    }

    public void setKitapNo(int kitapNo) {//parametresiz hale getir

        this.kitapNo = this.kitapNo;


    }

    public String getYazarAdi() {
        return this.yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi=yazarAdi;
    }


    public int getKitapFiyat() {
        return this.kitapFiyat;
    }

    public int setKitapFiyat() {

        while (true) {
            int kitapF = 0;
            try {
                System.out.print("Kitap Fiyati : ");
                kitapF = scan.nextInt();
                if (kitapF > 0) {
                    return kitapF;
                } else {
                    System.out.println("Fiyat eksi degerde olmaz.");
                }
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("Yalniz numerik degerler giriniz.");
            }
        }
    }

    @Override
    public String toString() {
        return "KitapciDeposu{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapNo=" + kitapNo +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                '}';
    }
}
