package JavaProjects.P11_depoYonetimi.depoYonetimi04;

public class Urun {
    private int id;
    private int miktar;
    private String isim;
    private String uretici;
    private String birimi;
    private int raf;

    Urun() {

    }

    public Urun(int id, String isim, String uretici, String birimi) {
        this.id = id;
        this.isim = isim;
        this.uretici = uretici;
        this.birimi = birimi;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMiktar() {
        return miktar;
    }
    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBirimi() {
        return birimi;
    }

    public void setBirimi(String birimi) {
        this.birimi = birimi;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

}
