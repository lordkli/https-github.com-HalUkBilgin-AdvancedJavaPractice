package JavaProjects.P11_depoYonetimi.depoYonetimi05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.scan;
import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.urunlerMap;

public class satinAlma implements Interface_Alıs {
    public void urunGirisi() {
        System.out.print("Ürün ID giriniz : ");
        int urunID = scan.nextInt();
        Set<Integer> keySets = urunlerMap.keySet(); // keyler
        Collection<List> valueSet = urunlerMap.values(); // value'lar List olarak
        boolean flag = false;
        for (Integer each : keySets) {
            if (each == urunID) {
                flag = true;
                System.out.print("Ürün girisi miktar : ");
                int miktar = scan.nextInt();
                List<Urun> valuesList = new ArrayList<>();
                valuesList = urunlerMap.get(each);
                valuesList.get(0).setMiktar(miktar);
                Urun UrunMiktarEklendi = new Urun(each, valuesList.get(0).getUrunIsmi(), valuesList.get(0).getUretici(), valuesList.get(0).getMiktar(),
                        valuesList.get(0).getBirim(), valuesList.get(0).getRaf());
                List<Urun> urunTanimlaList = new ArrayList<>();
                urunTanimlaList.add(UrunMiktarEklendi);
                urunlerMap.put(each, urunTanimlaList);
            }
        }
        if (!flag) {
            System.out.println("Ürün ID bulunamadı...");
            urunGirisi();
        }
        urunListele.urunListele();
    }

    @Override
    public void urunuRafaKoy() {
        System.out.print("Ürün ID giriniz : ");
        int urunID = scan.nextInt();

        Set<Integer> keySets = urunlerMap.keySet(); // keyler
        Collection<List> valueSet = urunlerMap.values(); // value'lar List olarak
        boolean flag = false;
        for (Integer each : keySets) {
            if (each == urunID) {
                flag = true;
                System.out.print("Raf : ");
                String raf = scan.next();
                List<Urun> valuesList = new ArrayList<>();
                valuesList = urunlerMap.get(each);
                valuesList.get(0).setRaf(raf);
                Urun UrunRafaEklendi = new Urun(each, valuesList.get(0).getUrunIsmi(), valuesList.get(0).getUretici(), valuesList.get(0).getMiktar(),
                        valuesList.get(0).getBirim(), valuesList.get(0).getRaf());
                List<Urun> urunTanimlaList = new ArrayList<>();
                urunTanimlaList.add(UrunRafaEklendi);
                urunlerMap.put(each, urunTanimlaList);
            }
        }
        if (!flag) {
            System.out.println("Hatali Ürün ID Girisi...");
            urunuRafaKoy();
        }
        urunListele.urunListele();
    }
}
