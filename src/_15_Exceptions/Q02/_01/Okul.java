package _15_Exceptions.Q02._01;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAd;
    private int maxOgrSayisi;
    private List<Ogrenci> ogrenciler;
    public static List<Okul> okulList = new ArrayList<>();

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrSayisi=" + maxOgrSayisi +
                ", \n ogrenciler=" + ogrenciler.toString() +
                '}';
    }

    public Okul(String okulAd, int maxOgrSayisi, List<Ogrenci> ogrenciler) {
        this.okulAd = okulAd;
        this.maxOgrSayisi = maxOgrSayisi;
        this.ogrenciler = ogrenciler;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public Okul() {
    }


    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrSayisi() {
        return maxOgrSayisi;
    }

    public void setMaxOgrSayisi(int maxOgrSayisi) {
        this.maxOgrSayisi = maxOgrSayisi;
    }
}
