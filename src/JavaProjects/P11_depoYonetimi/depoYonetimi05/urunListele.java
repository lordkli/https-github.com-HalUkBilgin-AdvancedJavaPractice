package JavaProjects.P11_depoYonetimi.depoYonetimi05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static JavaProjects.P11_depoYonetimi.depoYonetimi05.Variables.urunlerMap;

public class urunListele {
    public static void urunListele() {
        System.out.printf("%-9s %-10s %-10s %-10s %-10s %-10s\n", "ID", " Ürün", " Üretici", "Miktar", "Cuval", "Raf");
        System.out.println("====================================================================================");
        Set<Integer> keySets = urunlerMap.keySet();
        Collection<List> valueSet = urunlerMap.values();
        for (Integer each : keySets) {
            List<Urun> valuesList = new ArrayList<>();
            valuesList = urunlerMap.get(each);
            int index = 0;
            while (index < valuesList.size()) {
                System.out.printf("%-9s %-10s %-10s %-10d %-10s %-10s\n", each, valuesList.get(index).getUrunIsmi(), valuesList.get(index).getUretici(),
                        valuesList.get(index).getMiktar(), valuesList.get(index).getBirim(), valuesList.get(index).getRaf());
                index++;
            }
        }
    }
}
