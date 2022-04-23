package _18_Maps;

import java.util.HashMap;

public class HashMap01 {


    public static void main(String[] args) {
/*


1) Map'ler key-value yapisini kullanirlar.
		 		2) Key'ler tekrarli deger kabul etmez. (unique olmalidirlar/Kimlik numaralari gibi)
		 		3) Value'lar tekrarli olabilirler. (Isimler gibi)
		 		4) Uc farkli Map vardir:
		 			a) HashMap		: En cok kullanilani, en hizlilari. Hizli olabilmek icin siralamayi rastgele yapar.
		 									  Hizli olabilmek icin synchronize olmazlar ve thread-safe degildirler.
		 									  Bir tane key null olabilir, birden fazla value null olabilir.

		 			b) HashTable	:
		 			c) TreeMap		:
 */

        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(101, "Levent");
        m1.put(102, "Said");
        m1.put(103, "Hasan");
        m1.put(104, "Canan");
        m1.put(105, "Ayse");
        System.out.println(m1);//{101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.put(101, "harun");//key values!i update edilir eski veri uzerine yeni girilen veri yazilir
        System.out.println(m1);//{101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.put(106, "Canan");//aynı value farkli key'e atanabilir
        System.out.println(m1);//{101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan} value'ler uniqu olamk zorunda degil.

        m1.put(null, "haluk");//key degeri null alabilir
        System.out.println(m1);//{null=haluk, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}

        m1.put(null, "hakan");
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}

        m1.put(107, null);//Value degerleri coklu null olabilir
        m1.put(108, null);//Value degerleri coklu null olabilir
        m1.put(109, null);//Value degerleri coklu null olabilir
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null}

        System.out.println(m1.get(103));//Hasan
        System.out.println(m1.values());//[hakan, harun, Said, Hasan, Canan, Ayse, Canan, null, null, null]--> map'deki tüm elemanlarin value'lerini return eder.

        System.out.println(m1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107, 108, 109]

        System.out.println(m1.getOrDefault(106, "boyle bir eleman yoktur"));//106 Key'deki "canan" value return edildi
        System.out.println(m1.getOrDefault(111, "boyle bir eleman yoktur"));//111 key creat edildigi icin creat ettigimizdefault: "boyle bir eleman yoktur." return edildi

        m1.putIfAbsent(110, "ahmet");//belirtilen key creat edilmemisse creat edip value atamasi yapar-->key 110 yoktu olusturup ahmet atadi
        System.out.println(m1.putIfAbsent(110, "ahmet"));//  belirtilen key yoksa NULL  return eder
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

        m1.putIfAbsent(105, "salih");//--> 105 Key'de Ayse value oldg icin salih put edilmedi
        System.out.println(m1.putIfAbsent(105, "salih"));//105 key'deki value degeri Ayse return edildi
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

        m1.putIfAbsent(null, "ipek");// null Key'de hakan value oldg icin ipek put edilmedi
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

        m1.putIfAbsent(107, "oguz");//107 Key'de  value null oldg icin oguz put edildi
        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=oguz, 108=null, 109=null, 110=ahmet}

    }
}
