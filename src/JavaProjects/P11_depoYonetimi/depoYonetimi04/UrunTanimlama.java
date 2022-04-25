package JavaProjects.P11_depoYonetimi.depoYonetimi04;

import java.util.ArrayList;

public interface UrunTanimlama {
    int idYerBelirleme = 1001;

    public abstract void urunTanimlama(String isim, String uretici, String birim);

    ArrayList<Urun> urunListesi();

    public abstract void urunRaf(int id, int raf);
}
