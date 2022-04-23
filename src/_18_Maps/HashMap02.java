package _18_Maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(101, "Levent");
        m1.put(102, "Said");
        m1.put(103, "Hasan");
        m1.put(104, "Canan");
        m1.put(105, "Ayse");
        System.out.println(m1);//{101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.remove(101);//belirtilen key'deki Entry : key+value silinir
        System.out.println(m1);//{102=Said, 103=Hasan, 104=Canan, 105=Ayse}

        m1.remove(102,"said");//key value eslesmsi olursa entry silinir eslesme olmazsa (said!=Said) herhangi bir islem yapilmaz.
        System.out.println(m1);//{102=Said, 103=Hasan, 104=Canan, 105=Ayse}
        m1.remove(102,"Said");
        System.out.println(m1);//{103=Hasan, 104=Canan, 105=Ayse}

        m1.remove(111,"salih");//olmayan key'deki entry'i silme islemi yapilmaz
        System.out.println(m1.remove(111, "salih"));//false
        System.out.println(m1);//{103=Hasan, 104=Canan, 105=Ayse}

        System.out.println(m1.size());//3

        HashMap<Integer, String> m2 = new HashMap<>();
        m2.put(1,"guzel");
        m2.put(2,"insan");
        m2.put(3,"javacan");

        System.out.println(m2);

        m1.putAll(m2);//m1 map'e m2 put edildi. dolayisyle m1 update oldu ancak m2 ayni degerde.
        //Trick  of day : putAll() methodu calismasi icin her iki map'in Data type'lari eslesmeli
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=Hasan, 104=Canan, 105=Ayse}

        m1.compute(103,(key,value) -> "haluk");//103 key'de value varsa update eder yoksa Entry' put eder
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse}--> 103 key'deki hasan haluk olarak update edildi.

        m1.compute(109,(key,value) -> "merve hanım");//109 key'de olnadigi icin  Entry' put eder
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse,109=merve hanım}--> 109 key'deki 109=merve hanım creat edildi

        m1.computeIfAbsent(111,value-> "said ipek");//map'de 111 key varligini kontrol eder 111 key yoksa girilen value(said ipek) atanir. 111 key varsa islem yapilmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse,109=merve hanım, 111=said ipek}--> 111 key'deki 111=said ipek creat edildi

        m1.computeIfAbsent(109,value-> "ipek");//map'de 109 key varligini kontrol eder. 109 key oldg icin islem yapilmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse,109=merve hanım, 111=said ipek}-->

        m1.computeIfPresent(109,(key,value)-> "rabia");//map'de 109 key varligini kontrol eder. 109 key oldg icin rabi value ile update edildi
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=rabia, 111=said ipek}

        m1.computeIfPresent(115,(key,value)-> "rabia");//map'de 115 key varligini kontrol eder. 115 key oldmadig icin herhnagi bir islem yapilmaz
        System.out.println(m1);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=rabia, 111=said ipek}


    }
}
