package JavaProjects.P09_kitapYonetimi.kitapYonetimi02;

public class Kitap {
    int kitapNo = 1000;
    String kitapAdi = "";
    String yazarAdi = "";
    int kitapFiyat;
    public Kitap() {
    }
    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
    }
    @Override
    public String toString() {
        return "Kitap{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                '}';
    }
}
