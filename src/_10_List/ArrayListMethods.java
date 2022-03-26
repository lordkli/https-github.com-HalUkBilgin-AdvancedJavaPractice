package _10_List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
    /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Map ler java collections sınıfı nesneleridir.

 */
        System.out.println("******** List tanımlama ilk dğer atama(initialize)*********");
        //1. yol :
        List<Integer> listSayilar = new ArrayList<>();
        listSayilar.add(1);
        listSayilar.add(23);
        listSayilar.add(35);
        listSayilar.add(17);

        //2.yol :
        List<String> listIsimler = new ArrayList<>(Arrays.asList("Reha", "hakan", "haluk", "ahsen", "ZEHRA", "CEMAL"));// daha pratik

        //3. yol :
        List<String> listUlkeler = new ArrayList<>(List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya"));

        System.out.println("listIsimler : " + listIsimler);
        System.out.println("listSayilar :" + listSayilar);
        System.out.println("listUlkeler : " + listUlkeler + "\n");

        System.out.println("******** List'e eleman ekleme : add() *********");

        //List e eleman ekleme metodu: name.add(eleman);ekleme yapılan eleman list in sürekli sonuna eklenir. list elemanlarında tekrar olabir.

        listSayilar.add(-123);
        System.out.println(listSayilar);
        //index (yer) belirterek eleman ekleme :name.add(index,eleman);
        listSayilar.add(2, 33);// git şuraya ŞU elemanı koy: 2. index e 33 koy.2. index ten sonrakilerin sırası bir ilerledi.
        System.out.println("2. index'e 33 eklendi " + listSayilar + "\n");

        System.out.println("******** Özel bir metod:Collections nCopies kullanimi... *********");
        // Özel bir metod:Collections nCopies kullanimi...
        // nCopies(int n, Object o);  n elemanli nums arrayi olusturur ve hepsini o ile doldurur
        // Collection.fill(List, o); ise tanimlanmis ve deger atanmis arrayList'in tüm elemanlarini o ile doldurur
        ArrayList<Integer> nums = new ArrayList<>(Collections.nCopies(10, 5));
        System.out.println("nums : 10 tane 5 den oluşan arrayList :" + nums + "\n");//[5,5,5,5,5,5,5,5,5,5] 10 tane 5 den oluşan arrayList

        System.out.println("******** Özel bir metod: addAll(Collection C) *********");/*
            addAll(Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri (daha sonra görülecek)) sona ekler

            addAll(int index, Collection C)
            # ArrayList'e verilen C yi (ArrayList ya da Collections'un diger arrayleri)  belirtilen indexten itibaren ekler
            # arrayin kalan elemanlarini kaydirir
         */

        // ArrayList listRakam tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listRakam = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // ArrayList listIkiBasamakli tanimlanip, initialize ediliyor. Arrays.asList() ile
        ArrayList<Integer> listIkiBasamakli = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        // ArrayList listRakam2 tanimlanip, initializer icinde initialize ediliyor
        ArrayList<Integer> listRakam2 = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        };

        // listRakam yazdirliliyor
        System.out.println("listRakam : " + listRakam);

        // listIkiBasamakli elemanlari listRakam'e ekleniyor
        listRakam.addAll(listIkiBasamakli);

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nin sona eklenmis hali");
        System.out.println("listRakam ListIkiBasamaklı eklenmiş hali : " + listRakam);


        // listIkiBasamakli elemanlari listRakam'e 3. index ten sonra ekleniyor.
        listRakam.addAll(3, listIkiBasamakli);

        // ArrayList ekrana yazdiriliyor
        System.out.println("listIkiBasamakli'nın 3.indexten itibaren listRakam'a eklenmis hali" + listRakam + "\n");

        System.out.println("******** List'in içinden istenen index'teki elemanı alma : get() *********");
        listIsimler.get(2);//listIsimler içinde 2. index teki eleman haluk alındı.
        System.out.println("listIsimler'den 2. index teki eleman haluk alındı : " + listIsimler.get(2) + "\n");

        System.out.println("******** List'in boyutunu bulma : size() *********");
        //List in boyutu: size: name.size();--> listedeki  eleman sayısını verir.
        System.out.println("listSayilar'in eleman sayısı : " + listSayilar.size() + "\n");// 6

        System.out.println("******** List'in istenen elemanını silme : remove() *********");

        //List  ten istenen bir elemanı silme : name.remove();--> şu elemanı sil kaldır.
        listSayilar.remove(3);//3. index teki elemanı sil
        listIsimler.remove("haluk");//isimler list inden haluk sil
        System.out.println("listSayilar 3. index teki elemanı silindi : " + listSayilar);
        System.out.println(listSayilar.remove("-123"));// false:
        System.out.println(listIsimler);
        System.out.println(listIsimler.remove("haluk"));//false


        //tekrarlı eleman varsa ilk index dekini siler...
        listIsimler.add("Reha");
        System.out.println("listIsimler'in sonuna Reha eklanmiş hali : " + listIsimler);//sona Reha eklenmiş hali
        listIsimler.remove("Reha");
        System.out.println("listIsimler'de bulduğu ilk reha'yı silindi : " + listIsimler);//bulduğu ilk Reha yı silmiş hali.

        //olmayan elemanı silmek için eror vermez...kod çalışır....
        listIsimler.remove("haluk");//haluk varsa siler yoksa hata vermeden kod devam eder.
        System.out.println(listIsimler.remove("haluk"));// isimler obj haluk kaldırmaya gider olmayan elemandan dolayı false verir.
        System.out.println(listIsimler + "\n");

        System.out.println("******** List'te herhangi bir elemanın index(yerini) bulma : indexOf() *********");
        System.out.println("indexOf ZEHRA sonrası :" + listIsimler.indexOf("ZEHRA"));//3 -->ZEHRA 3. index te
        System.out.println("indexOf haluk sonrası :" + listIsimler.indexOf("haluk"));//-1 -->haluk isimler list inde olmadığı için.olmayan elemanın index i sorguladığında error vermez run:-1 verir

        Collections.sort(listSayilar);   //list elemanlarını sıraladık
        System.out.println("listSayilar'da 48'in indexOf sonrası :" + listSayilar.indexOf(48) + "\n");//list içinde 48 elemanının index i soruldu 48 elemsnı listte olmadığı için -1 verdi

        System.out.println("******** List'te herhangi bir elemanın son bulma index(yerini) bulma : lastIndexOf() *********");
        // lastIndexOf(Object O):Belirtilen elemanin son bulunma index'ini verir, eleman yoksa -1 döner.
        ArrayList<Integer> tekrarlilist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 7, 8, 9));
        System.out.println("2 elemanının listede son bulunduğu yerin index'i :" + tekrarlilist.lastIndexOf(2) + "\n");//5 : 2 den ikincisinin yani sonuncusunun baştan index'i


        System.out.println("******** list teki istenen hehangi bir  elemanı update etme :set() *********");


        //list teki istenen hehabgi bir  elemanı update (set) etme: name.set(index,eleman);--> şu index deki elemanı şu eleman ile değiştir.
        listIsimler.set(0, "ahmet");
        System.out.println("listIsimler'de 0. inex' ahmet set edildi : " + listIsimler + "\n");
        //  isimler.set(0,"ahmet",1,"ali");-->list te çoklu set metodu çalışmaz.buz gibi İNTERVİEW sorusu....

        System.out.println("******** list teki istenen hehangi bir parçasını alma :subList(int fromIndex, int toIndex) *********");
        /*
            subList(int fromIndex, int toIndex)
            Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

         */
        // ArrayList list tanimlanip, initialize ediliyor. Arrays.toList() ile
        ArrayList<Integer> listParcasi = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 18, 9));

        System.out.println(listParcasi);

        // list.subList(2,5); 2. index dahil, 5. index haric
        System.out.println("2. index dahil, 5. index haric parcası alındı : " + listParcasi.subList(2, 5));//2. 3. 4. elemanı alır. 5 . eleman alınmaz

        // yeni bir yeniList arrayList'i list.subList() ile de tanimlanabilir
        ArrayList<Integer> yeniList = new ArrayList<>(listParcasi.subList(4, 8));

        System.out.println("list.subList(4,8) ile yeniList tanimlandi : " + yeniList + "\n");


        System.out.println("******** list'in boş dolu olduğunu öğreneme : isEmpty() *********");
        //list in boş-dolu sorgusu: isEmpty :name.isempty(); --> name listi boş mu değil mi? true-false verir.
        System.out.println(listIsimler.isEmpty() + "\n");//false


        System.out.println("******** List te istenen eleman var mı yok mu?öğrenme : contains() *********");

        // List'te istenen eleman var mı yok mu?: contains: name.contains(eleman); -->true-false
        System.out.println("listIsimler'de ipek elamanı var mı? : " + listIsimler.contains("ipek") + "\n");//false ipek yok

        System.out.println("******** List'teki elemanları düzenli sıralama : Collections.sort() *********");

        // List  teki elemanları düzenli sıralama :String:alfabetik(Natural Order), int:küçükten büyüğe...Collections.sort(name);

        Collections.sort(listIsimler);//String sırası
        System.out.println("listIsimler'de harf sırası  : " + listIsimler);

        Collections.sort(listSayilar);//int sırası
        System.out.println("listSayilar'da küçükten büyüge elemanların sırası : " + listSayilar + "\n");

        //***Önemli*** System.out.println( Collections.sort(list)); -->şeklinde metod print içinde çalışmaz

        System.out.println("******** List'teki elemanları düzenli tersten sıralama : Collections.reverse() *********");
        Collections.reverse(listSayilar);
        System.out.println("listSayilar'daki elemanları düzenli tersten sıralaması  = " + listSayilar + "\n");

        ArrayList<Integer> ipek = new ArrayList<>(Arrays.asList(45, 23, 67, -100, 1, 0));
        System.out.println("ilk hali: reverse olmadan : "+ipek);
        Collections.reverse(ipek);
        System.out.println("reverse hali : "+ipek);

        //****ÇOOOK ÖNEMLİ....Collections.reverse()--> methodu listteki elemanları index sırasına göre tersten sıralar.

        System.out.println("******** List'teki elemanları max min elemanını bulma : Collections.max/min() *********");
        System.out.println("listSayilar deki en büyük sayı = " + Collections.max(listSayilar));
        System.out.println("listSayilar deki en küçük sayı = " + Collections.min(listSayilar) + "\n");

        System.out.println("******** List'teki belli bir değerdeki elemanlara , başka bir değer atama : Collections.replaceAll() *********");
        // belli bir değerdeki elemanları , başka bir değer atar
        Collections.replaceAll(listSayilar, 33, 9);
        System.out.println("listSayilar'da 33 değerindeki elemanlara 9 değeri atandı  = " + listSayilar + "\n");

        System.out.println("******** List'teki elemanlara aynı değeri atama : Collections.fill() *********");
        Collections.fill(listSayilar, 8);
        System.out.println("listSayilar'a tüm elemanlara 8 atanadı = " + listSayilar + "\n");


        System.out.println("******** iki list'in eşitliğini bulma : equals() *********");
        //Equals :eşit mi değil mi: name1.equals(name2);--> name1 name2 tıpatıp aynı mı? list teki elemanların hem index hem de içeriğini aynı olmalı

        List<String> name1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> name2 = new ArrayList<>(Arrays.asList("b", "a"));
        List<String> name3 = new ArrayList<>(Arrays.asList("A", "b"));
        List<String> name4 = new ArrayList<>(Arrays.asList("A", "b"));
        System.out.println(name1.equals(name2));// name1  name2 ile tıpatıp aynı? -->false
        System.out.println(name1.equals(name3));// name1  name3 ile tıpatıp aynı? -->false
        System.out.println(name3.equals(name4) + "\n");// name3  name4 ile tıpatıp aynı? -->true

        System.out.println("******** list'i Array'a çevirme : toArray() *********");

        //list'i Array'a çevirme : toArray();
        //1. Yontem: toArray() methodu'nun icinde parametre olarak new String[0] kullaniniz
        String arr[] = listIsimler.toArray(new String[0]);//arr adında String tipinde bir array tanımladık.isimlerden(List) toArray ile yeni String tipi obj değerleri atadık
        System.out.println("listIsimler'in array hali: "+Arrays.toString(arr));//[CEMAL, Reha, ZEHRA, ahmet, ahsen]


        //2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secilir
        //Object class, Java'da butun class'larin parent'idir.Yani Object class ortak atadir.
        //Object class, Java'da parent'i olmayan tek class'dir.
        //String, Object class'in child'i oldugundan data type olarak bazi durumlarda
        //String yerine Object kullaniriz.
        Object arr1[] = listSayilar.toArray();
        System.out.println("listSayilar'ın  array hali: "+Arrays.toString(arr1)+"\n");

        System.out.println("******** Array'i list'e çevirme : Arrays.asList(arrName) *********");

        //asList() methodu array'leri list'e cevirmek icin kullanilir.
        //asList() methodu parametre olarak array'in ismini kabul eder.

        String arr2[] = {"Aliye", "Canan"};

        List<String> list1 = Arrays.asList(arr2);
        System.out.println(list1);//[Aliye, Canan]


        //Çook önemli....
        // Array'den list'e cevirme yaptiginizda, elde ettiginiz list uzunluk olarak
        //esnek degildir.Yani array'den olusturdugunuz list'e ekleme ve cikarma yapamazsiniz.
        //list1.add("Emine");//add() yapamazsiniz.Run Time Error verir."UnsupportedOperationException"


        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("******** list'i  boşaltma silme : clear() *********");
        //List i boşaltma silme : name.clear();
        listIsimler.clear();// isimler list ini boşalt. temizle, elemanlarını sil.
        System.out.println(listIsimler);// [] boş list verdi.
    }

}
