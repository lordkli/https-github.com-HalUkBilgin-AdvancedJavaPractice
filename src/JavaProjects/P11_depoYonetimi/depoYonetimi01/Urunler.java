package JavaProjects.P11_depoYonetimi.depoYonetimi01;

public class Urunler {
    public int id;
    public String urunIsmi;
    public String uretici;
    public int miktar;
    public String birim;
    public String raf;

    public Urunler() {
    }

    public Urunler(int id, String urunIsmi, String uretici, String birim) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
    }

    @Override
    public String toString() {
        return "Urunler{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
