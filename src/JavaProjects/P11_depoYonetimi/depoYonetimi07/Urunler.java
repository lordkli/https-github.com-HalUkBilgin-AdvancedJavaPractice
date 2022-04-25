package JavaProjects.P11_depoYonetimi.depoYonetimi07;

import java.util.HashMap;
import java.util.Map;

public class Urunler {

    public static Map<Integer,String> urunListesi = new HashMap<>();

    private int urunID =0;
    private String urunIsmi = "Default";
    private String urunUretici = "Default";
    private String urunBirimi = "Default";

    private int urunAdeti =0;
    private int urunRafNumarasi =0;

    public Urunler() {
    }

    public Urunler(int urunID, String urunIsmi, String urunUretici, String urunBirimi) {
        this.urunID = urunID;
        this.urunIsmi = urunIsmi;
        this.urunUretici = urunUretici;
        this.urunBirimi = urunBirimi;
        urunListesi.put(urunID,urunIsmi+", "+urunUretici+", "+urunBirimi+", "+"Default"+", "+"Default");

    }

    public Urunler(int urunID, String urunIsmi, String urunUretici, String urunBirimi, int urunAdeti, int urunRafNumarasi) {
        this.urunID = urunID;
        this.urunIsmi = urunIsmi;
        this.urunUretici = urunUretici;
        this.urunBirimi = urunBirimi;
        this.urunAdeti = urunAdeti;
        this.urunRafNumarasi = urunRafNumarasi;
    }

    public int getUrunID() {
        return urunID;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUrunUretici() {
        return urunUretici;
    }

    public void setUrunUretici(String urunUretici) {
        this.urunUretici = urunUretici;
    }

    public String getUrunBirimi() {
        return urunBirimi;
    }

    public void setUrunBirimi(String urunBirimi) {
        this.urunBirimi = urunBirimi;
    }

    public int getUrunAdeti() {
        return urunAdeti;
    }

    public void setUrunAdeti(int urunAdeti) {
        this.urunAdeti = urunAdeti;
    }

    public int getUrunRafNumarasi() {
        return urunRafNumarasi;
    }

    public void setUrunRafNumarasi(int urunRafNumarasi) {
        this.urunRafNumarasi = urunRafNumarasi;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "urunID=" + urunID +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", urunUretici='" + urunUretici + '\'' +
                ", urunBirimi='" + urunBirimi + '\'' +
                ", urunAdeti=" + urunAdeti +
                ", urunRafNumarasi=" + urunRafNumarasi +
                '}';
    }
}
