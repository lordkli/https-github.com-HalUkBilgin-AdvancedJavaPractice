package JavaProjects.P11_depoYonetimi.depoYonetimi05;

public class Urun {

    private int id = -1 ;
    private String urunIsmi = "Deger girilmedi";
    private String uretici = "Deger girilmedi";
    private int miktar = 0;
    private String birim = "cuval";
    private String raf= "Deger girilmedi";

    public Urun(int urunID, String urunIsmi, String ureticiFirma) {
        this.id = urunID;
        this.urunIsmi = urunIsmi;
        this.uretici = ureticiFirma;
    }

    public Urun(Integer each, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = each;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim=" + birim +
                ", raf='" + raf + '\'' +
                '}';
    }

    public Urun() {
    }

    public int getId() {
        return id;
    }

    public void setId() {
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public int setMiktar(int miktar) {
        return this.miktar += miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}
