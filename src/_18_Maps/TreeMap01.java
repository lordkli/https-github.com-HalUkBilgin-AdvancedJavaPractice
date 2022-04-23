package _18_Maps;

import java.util.TreeMap;

public class TreeMap01 {
    /*
                    1) TreeMap elemanlari natural order'a gore siralar

			 		2) TreeMap, Map'lerin en yavasidir.

			 		3) TreeMap'lerde key'ler icin "null" kullanilmaz.

			 		4) TreeMap'lerde value'lar icin "null" istenildigi kadar kullanilabilir.

			 		5) TreeMap'ler syncronized ve thread-safe degildirler.
     */
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(101, "alaattin");
        tm.put(102, "salih");
        tm.put(103, "berk");
        tm.put(104, "suleyman");
        tm.put(105, "ebıkgabık");
        System.out.println(tm);//{101=alaattin, 102=salih, 103=berk, 104=suleyman, 105=ebıkgabık}
        // tm.put(null,"topla");//NullPointerException firlatir

        System.out.println(tm);
        tm.put(106, "ali");
        System.out.println(tm);//{101=alaattin, 102=salih, 103=berk, 104=suleyman, 105=ebıkgabık, 106=null}
        System.out.println(tm .ceilingKey(101));//ceilingKey() method'u istenen key degerini(101)  varsa return eder.

        System.out.println(tm .ceilingKey(111));//ceilingKey() method'u istenen key degeri(111) map'de olamdigindane kendisinden
                                                // buyuk en kucuk(bir ustu) key olmadigi icin  null return eder.

        System.out.println(tm.ceilingEntry(100));//101=alaattin -->ceilingKeyEntry() method'u istenen key degeri(100) map'de olamdigindane kendisinden
                                                     // buyuk en kucuk(bir ustu) key  return  101=alaattin eder.

        System.out.println(tm.floorEntry(108));//106=ali -->ceilingKeyEntry() method'u istenen key degeri(108) map'de olamdigindan kendisinden
                                                    // kucuk en buyuk(bir alti) key  return  106=ali eder.

        System.out.println(tm .floorKey(111));//floorKey() method'u istenen key degerini(111)map'de olamdigindan kendisinden
                                                // kucuk en buyuk(bir altı) key  106 return eder.

        System.out.println(tm.descendingKeySet());//[106, 105, 104, 103, 102, 101]--> key'leri azalan siralama ile return eder

        System.out.println(tm.keySet());//[101, 102, 103, 104, 105, 106]--> key'leri artan siralama ile return eder

        System.out.println(tm.headMap(108));//{101=alaattin, 102=salih, 103=berk, 104=suleyman, 105=ebıkgabık, 106=ali} --> oncekileri


        System.out.println(tm.headMap(104));//{101=alaattin, 102=salih, 103=berk} --> girilen key haric onceki entry'leri return eder
        System.out.println(tm.headMap(104,true));//{101=alaattin, 102=salih, 103=berk, 104=suleyman}-->girilen key dahil onceki entry'leri return eder


        System.out.println(tm.tailMap(102));//{102=salih, 103=berk, 104=suleyman, 105=ebıkgabık, 106=ali}-->girilen key dahil sonraki entry'leri return eder


        System.out.println(tm.tailMap(102,false));//{103=berk, 104=suleyman, 105=ebıkgabık, 106=ali} -->girilen key haric sonraki entry'leri return eder


    }
}
