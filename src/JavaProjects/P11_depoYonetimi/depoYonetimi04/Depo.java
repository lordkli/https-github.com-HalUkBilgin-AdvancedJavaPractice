package JavaProjects.P11_depoYonetimi.depoYonetimi04;

import java.util.ArrayList;

import static JavaProjects.P11_depoYonetimi.depoYonetimi04.Islemler.scan;

public class Depo implements Satis, SatinAlma, UrunTanimlama {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    ArrayList<Urun> urunListesi = new ArrayList<>();


    @Override
    public void urunGiris(int id, int miktar) {
        int urunSayisi = urunListesi.get(id - idYerBelirleme).getMiktar();

        urunSayisi += miktar;
        urunListesi.get(id - idYerBelirleme).setMiktar(urunSayisi);
    }

    @Override
    public void urunCikis(int id, int miktar) {
        int urunSayisi = urunListesi.get(id - idYerBelirleme).getMiktar();

        if (miktar > urunSayisi) {
            System.out.println("Girdiginiz miktar var olan miktardan fazladir. Tekrar giris yapiniz");
            miktar = scan.nextInt();
            urunCikis(id, miktar);

        } else {
            System.out.println(miktar);
            urunSayisi -= miktar;
            urunListesi.get(id - idYerBelirleme).setMiktar(urunSayisi);
        }
    }

    @Override
    public void urunTanimlama(String isim, String uretici, String birim) {
        int id = urunListesi.size() + idYerBelirleme;
        Urun urun = new Urun(id, isim, uretici, birim);
        urunListesi.add(urun);

    }

    @Override
    public ArrayList<Urun> urunListesi() {
        return urunListesi;
    }

    @Override
    public void urunRaf(int id, int raf) {
        //   int rafSayisi = urunListesi.get(id-idYerBelirleme).getRaf();

        urunListesi.get(id - idYerBelirleme).setRaf(raf);

    }
}

