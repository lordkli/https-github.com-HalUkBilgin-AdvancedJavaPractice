package _05_StringManipulation;

import java.util.Locale;

public class A_StringMethods {
    public static void main(String[] args) {


        /** indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         */ // contains den farkı indexini verir, contains ise true false
        // 012345678
        String text = "Good";
        System.out.println("G harfinin indexi = " + text.indexOf("G")); // indexler 0 dan başlar
        System.out.println("d harfinin indexi = " + text.indexOf('d')); //3
        System.out.println("H harfinin indexi = " + text.indexOf("H")); // -1  : bulunamadı, yok
        System.out.println("od nin indexi = " + text.indexOf("od")); // 2 : var ise ilk harfin indexini verir
        int index = text.indexOf("o"); // int değişkene atanabilir. küçük o harfi
        System.out.println("index = " + index); // 1 :  aynı karakterden birden fazla var ise ilkini verir.

        String cicek = "Gunebakan";

        int index1 = cicek.indexOf('e');
        System.out.println("e harfi metinde kacinci indexte >>>>> " + index1); //3
        System.out.println("----------");

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         */

        System.out.println("sondaki n harfinin index >>>> " + cicek.lastIndexOf('n'));  //8
        System.out.println("----------");
        String textt = "halukbilgin";
        System.out.println("En sondaki i nun indexi = " + textt.lastIndexOf("i")); //9
        System.out.println("ilk baştan i nun indexi = " + textt.indexOf("i")); //6
        System.out.println("----------");
        /**
         * charAt()
         * İstenen noktadaki karakteri verir,
         * karakterlerin sırası 0 dan başlar, buna index denir.
         * Metin icerisinde, istenilen indexteki karaktere ulasimi saglar. Sonuc char dir.
         *  0123456789012
         */

        String sehir = "istanbul";
        System.out.println("metinde 5 indexteki harf >>>> " + sehir.charAt(5));  //b

        String kelime = "Merhaba Dünya";

        char harf = kelime.charAt(3);
        System.out.println("3.harf = " + harf); // 3 -> h

        harf = kelime.charAt(0);
        System.out.println("0.harf = " + harf); // 0 -> M
        System.out.println("----------");

        /** substring()
         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
         */

        String ss= "Her ders Java gibi olsa";


        System.out.println(ss.substring(10)); //ava gibi olsa: 10.index dahil(inclusive) sonuna kadar tum String
        System.out.println(ss.substring(ss.length()-10)); // gibi olsa: son 10 harfi yazdirin

        // ilk 10 karakteri alma
        System.out.println(ss.substring(0, 10));//Her ders J: substring(0, 10) yazildiginda
        // 0 inclusive, 10 exclusive
        // 11.ci karakterden sonuna kadar olan Stringi yazdiralim
        System.out.println(ss.substring(10));//ava gibi olsa

        System.out.println(ss.substring(10, 10)); //"" :hiclik baslangic indexi olsun der, ama bitis indexi olmasin der, Java son soyleneni yapar

        //System.out.println(str.substring(8, 7)); // RTE

        System.out.println(ss.substring(22)); //a: length()-1 -> son karakter
        System.out.println(ss.substring(23)); //bosluk ...length() -> bos
        //System.out.println(str.substring(24)); // length()'den buyuk sayi yazarsak RTE


        // ss'in ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin

        System.out.println(ss.replaceAll("\\w", "*")+ss.substring(10)); //**********ava gibi olsa
        System.out.println("----------");

        /**trim()
         *Metnin basinda ve sonunda bulunan bosluklardan kurtulmayi saglar, aralardaki bosluklara dokunmaz. Sonuc String dir.
         */

        String city = "     istanbul    ";

        System.out.println("trim kullanilmadan once >>>>>> " + city + "<<<<<"); //      istanbul
        System.out.println("trim kullanildiktan sonra -->>" + city.trim()); //istanbul
        System.out.println("----------");

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini saglar. Sonuc String'dir..
         *
         */

        String ozellik = "hayalperest";
        System.out.println("a harfini @ isarti ile degistir >>> " + ozellik.replace('a', '@')); //h@y@lperest

        String kuruyemis = "yer fistigi";

        System.out.println("bir dizi kumesini degistirme>>>> " + kuruyemis.replace("yer", "cam")); //cam fistigi
        System.out.println("----------");

        /** ReplaceFirst
        * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        String txt = "Merhaba Dunya";

        System.out.println("orjinal hali = " + txt); //orjinal hali = Merhaba Dunya
        System.out.println("butun a ların nın degistigi hali = " + txt.replace("a", "e"));
        // butun a ların nın degistigi hali = Merhebe Dunye
        System.out.println("ilk bulunan a nın degistigi hali = " + txt.replaceFirst("a", "e"));
        // ilk bulunan a nın degistigi hali = Merheba Dunya
        System.out.println("----------");
        /** replaceAll()
         *
         */

        String numara = "$1800 Milyon";

        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[a-zA-Z]", "")); //$1800
        System.out.println("REPLACEaLL METODU>>>> " + numara.replaceAll("[0-9]", "")); //$ Milyon
        System.out.println("----------");

        /**
         * contains()
         * Metin icerisinde arama yapmamizi saglar.
         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
         * Sonuc boolean dir.
         *
         * equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        String str = "Merhaba";
        String st = "Merhaba";
        boolean birebirEsitMi = str.equals("Merhaba");

        System.out.println("birebirEsitMi = " + birebirEsitMi); //true

        System.out.println("birebirEsitMi = " + str.equals(st));  //true

        System.out.println("birebirEsitMi = " + str.equals("merhaba")); //false

        System.out.println("Eşit mi = " + str.equalsIgnoreCase("mERHaba")); // true
        System.out.println("Eşit mi = " + str.equalsIgnoreCase("mERHa")); // false

        String ad = "Bahadir";
        System.out.println("birebir ayni yazildiginda >>>" + ad.equals("Bahadir"));  //true
        System.out.println("harfin kucuk olmasi durumunda >>>" + ad.equalsIgnoreCase("bahadir"));  //true

        String sahipMi = "Baha";

        System.out.println("ad degiskeni icinde Baha yi barindiriyor mu? >>>> " + ad.contains(sahipMi)); //true
        System.out.println("----------");


        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        System.out.println("metin Ba ile basliyor mu? >>>> " + ad.startsWith("Ba")); //true
        System.out.println("metin -dir ile bitiyor mu? >>>> " + ad.endsWith("dir")); //true
        System.out.println("----------");
    /**
    * StringConcat
    * bir stringe diğerini ekler
     * Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
     * her ikisi String ise Java toplama degil BIRLESTIRME yapar
     * */
     	    System.out.println( 15 + 20 + "Merhaba"); //35Merhaba
     		System.out.println("Merhaba" + 15 + 20);  // Merhaba1520
     		System.out.println("Merhaba" + ( 15 + 20 )); // Merhaba35
      		System.out.println("Merhaba" + 15 * 20 ); // Merhaba300

        String s = "Hi";
        System.out.println(s+" " +"there!");// Hi there!
        System.out.println(s + " there!"); // Hi there!
        System.out.println(s.concat("there!")); // Hithere!
        System.out.println(s.concat(" there!")); // Hi there!
        System.out.println(s.concat(" " +"there!")); // Hi there!

        String s2 = " everybody";
        System.out.println(s.concat(s2)); // Hi everybody
        System.out.println("s = " + s); // s = Hi

        s = s.concat(s2);// yani degiskenin kendisine atama yapılırsa degeri kalici degisir.
        // s= s+s2; aynı islemi yapar.
        System.out.println("s = " + s); // s = Hi everybody
        System.out.println("----------");
        /**
         * StringIsEmpty
         *  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false
         */
        String str1 = "Hi";
        System.out.println("str1 içi boş mu = " + str1.isEmpty()); //false

        String str2 = "";
        System.out.println("str2 içi boş mu = " + str2.isEmpty()); //true

        String str3 = " ";
        System.out.println("str3 içi boş mu = " + str3.isEmpty());  //false
        boolean bosMu = str3.isEmpty(); // boolean değişkenine atanabilir.

        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */


        String str4 = "Techproeducation";

        // buyuk harfle yazdirmak istersek
        System.out.println(str4.toUpperCase()); //TECHPROEDUCATİON

        // str4'i buyuk harfe cevirmek istersek

        str4=str4.toUpperCase(); // bu satirdan sonra kalici olarak str BUYUK harlerden olusan bir String oldu

        System.out.println(str4);  //TECHPROEDUCATİON
        System.out.println(str4.toLowerCase()); //techproeducation

        System.out.println(str4.toLowerCase(Locale.forLanguageTag("tr"))); //techproeducation
        System.out.println("----------");

        /**Equals() methodu ve Cift Esittir (==) Farki
         */
        String sA = "Haluk Bilgin";
        String sB = sA + "" ; // Haluk Bilgin

        System.out.println(sA==sB);// false
        // == Stringlerin hem degerlerine hem de adreslerine bakar
        // bu ornekte sA+"" yazdigimizda concatenation yapildigi icin Java yeni bir obje
        // olusturur ve islemin sonucunu yeni obje'nin icine koyar.
        // sA ve sB 'yi == ile karsilastirirsak degerleri ayni fakat adresleri farkli oldugu icin
        // false doner


        System.out.println(sA.equals(sB)); // true

        // equals() methodu sadece String'lerin degerlerini karsilastirir
        // bu ornekte sA ile sB nin degerleri AYNI oldugu icin true dondurur

        String sC= sA;
        System.out.println(sC==sA); //true
        System.out.println(sA.equals(sC)); //true
        System.out.println("----------");
        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        String cumle = "Bu gün hava yagmurlu";
        System.out.println("uzunluk = " + cumle.length()); //uzunluk = 20

        String st1="";
        System.out.println(st1.length()); // 0

        String s3=null; // null hic demek
        // normalde String'ler "" icine yazilir ama null icin buna gerek yoktur
        // null case sensitive'dir , dolayisiyla NULL veya Null yazilmaz
        // null bir deger degildir, sadece hicligi gosteren bir pointer'dir

        System.out.println(s3); //null

        // null deger atanan String ile String manipulation method'lari kullanilamaz !!!RTE verir

        System.out.println(s3.length()); // RTE verir
        System.out.println(s3.equals(st1)); //RTE
        System.out.println(cumle.charAt(1)); // indexi 1 olan(bastan ikinci) harfi verir
        System.out.println(s3.charAt(1)); // RTE

    }


}
