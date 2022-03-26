package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimler = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
//asList()--> String olarak verilen ifadelerin hepsini ArrayList!'in içine atar.
// Yani list oluşturur. tek tek add demek zorunda kalmayiz
        ArrayList<String> aOlmayanIsimler = new ArrayList<String>();//a olmayan ismlerin atanacagı bos list create edildi

        for (String w : isimler) {
            if (!w.toLowerCase().contains("a")) {//a bulundurmayan ismsler sartı
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan ismler : " + aOlmayanIsimler);
        isimler.clear();
        isimler.addAll(aOlmayanIsimler);
        System.out.println(isimler);
    }

/*
hatalı cozum...
    List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Omer");
        System.out.println(list1);

        List<String> yeniList = new ArrayList<>();


        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).toLowerCase().contains("a")){
                yeniList.add(list1.get(i));
                list1.remove(i);
            }
        }
        System.out.println("içinde a olan kelimeler : "+yeniList);
        System.out.println("listenin silinmiş kelimelerle son hali : "+list1);
    }
 */

}
