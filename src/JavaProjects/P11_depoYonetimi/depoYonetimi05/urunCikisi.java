package JavaProjects.P11_depoYonetimi.depoYonetimi05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.scan;
import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.scan;
import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.urunlerMap;

public class urunCikisi implements Interface_Satis {

    public void urunCikisi() {
        System.out.print("Ürün ID giriniz : ");
        int urunID = scan.nextInt();
        int miktar;
        Set<Integer> keySets = urunlerMap.keySet(); // keyler
        Collection<List> valueSet = urunlerMap.values(); // value'lar List olarak
        for (Integer each : keySets) {
            if (each == urunID) {
                List<Urun> valuesList = new ArrayList<>();
                valuesList = urunlerMap.get(each);

                while (true) {
                    System.out.print("Ürün cikisi miktar : ");
                    miktar = scan.nextInt();
                    if (miktar > valuesList.get(0).getMiktar()) {
                        System.out.println("Depoda sadece " + valuesList.get(0).getMiktar() + " " + valuesList.get(0).getBirim() + " " +
                                valuesList.get(0).getUrunIsmi() + " bulunmaktadır.");
                    } else {
                        valuesList.get(0).setMiktar(miktar * (-1));
                        break;
                    }
                }

                Urun urunMiktarEksildi = new Urun(each, valuesList.get(0).getUrunIsmi(), valuesList.get(0).getUretici(), valuesList.get(0).getMiktar(),
                        valuesList.get(0).getBirim(), valuesList.get(0).getRaf());
                List<Urun> urunTanimlaList = new ArrayList<>();
                urunTanimlaList.add(urunMiktarEksildi);
                urunlerMap.put(each, urunTanimlaList);
            }
        }
        urunListele.urunListele();
    }
}
