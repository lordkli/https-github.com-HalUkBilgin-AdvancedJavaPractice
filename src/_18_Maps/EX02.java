package _18_Maps;

import java.util.*;

public class EX02 {     /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdiran method creat ediniz.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz  : ");
        kacKelime();
        String metin = scan.nextLine();//ali gel gel de sevelim seni
        System.out.println(kelimeSay(metin));


    }

    public static TreeMap<String, Integer> kelimeSay(String metin) {

        TreeMap<String, Integer> kelimeSayısı = new TreeMap<String, Integer>();
        String[] arrMetin = metin.split(" ");//metnin herbir kelimesi arraya atandı
        for (int i = 0; i < arrMetin.length; i++) {//araayın her bir elemanı için döngü açıldı
            if (kelimeSayısı.containsKey(arrMetin[i])) {//map'in kelime olan key'inde array den gelen kelime varsa
                //bu kelime daha önce map'e eklenip eklenmedşği kontrol edilyır
                kelimeSayısı.put(arrMetin[i], kelimeSayısı.get(arrMetin[i]) + 1);//map'e key olarak kelime value olarak int deger eklenyiyor
            } else kelimeSayısı.put(arrMetin[i], 1);

        }


        return kelimeSayısı;
    }

    public static void kacKelime() {
        String Str = "Ali came to school and and came Ayse came to school";
        String arr[] = Str.split(" ");

        System.out.println(Arrays.toString(arr));
        Map<String, Integer> map = new HashMap<>();

        int sayac = 1;
        for (String w : arr) {
            if (map.putIfAbsent(w, sayac) != null) {
                map.put(w, (map.putIfAbsent(w, sayac) + 1));// putIfAbsent methodu, daha önce map içinde mevcut olanın value değerini
                // döndürdüğü için, map.put methodu ile aynı id'li elemanı ezip yeni valuesuyla tekrar ekliyoruz
            } else {
                map.put(w, sayac);
            }
        }

    }


}
