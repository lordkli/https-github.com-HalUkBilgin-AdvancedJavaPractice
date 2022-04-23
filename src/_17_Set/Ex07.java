package _17_Set;

import java.util.HashSet;

public class Ex07 {

    /*  TASK :
     * main method altinda bir double hashSet olusturunuz.
     *
     * ve bu seti, adi setOlustur ve return tipi hashSet double olan
     *
     * ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini
     * kullanarak doldurun.
     *
     * adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul
     * edecek ayri bir method olusturarak
     *
     * hashSetin degerlerinin toplamini alacaksiniz.
     */

    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        setOlustur(set);            //mutable olduğu için tekrardan atama yapmaya gerek yok
        System.out.println(set);
        toplaminiAl(set);
    }

    private static void toplaminiAl(HashSet<Double> set) {
        Double topla = 0.0;
        for (Double w : set) {
            topla += w;
        }
        System.out.println(topla);
    }

    private static HashSet setOlustur(HashSet<Double> set) {
        set.add(3.23);
        set.add(3.10);
        set.add(5.12);
        set.add(10.12);
        set.add(23.12);
        return set;     //mutable olduğu için tekrardan atama yapmaya gerek yok
    }

}

