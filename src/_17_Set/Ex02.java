package _17_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
Colections.sort(arr1)
     */


    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        arrList1 = arrListHazırla(10, 0, 20);
        arrList2 = arrListHazırla(5, 0, 20);
        System.out.println("10 elemanlı list : " + arrList1);
        System.out.println("5 elemanlı list " + arrList2);

        //  arrList1.retainAll(arrList2);
        //  System.out.println("ortak elemanlı list  : "+arrList1);
        // arrList1.removeAll(arrList2);//list1 den list2 çıkarılarak list1 de olup list2 de olmayan yani farklı
        //                             // elemanlaın oldg list create edildi
        // System.out.println(arrList1);
        // arrList2.removeAll(arrList1);//list2 den list1 çıkarılarak list2 de olup list1 de olmayan yani farklı
        //                              // elemanlaın oldg list create edildi
        // System.out.println(arrList2);


        ArrayList<Integer> arayListFark1 = new ArrayList<>(arrList1);//list1 de olup list2 de olmayanlat ->list1-list2
        ArrayList<Integer> arayListFark2 = new ArrayList<>(arrList2);//list2 de olup list1 de olmayanlat ->list2-list1

        arayListFark1.removeAll(arrList2);
        System.out.println("farklı list1 :" + arayListFark1);
        arayListFark2.removeAll(arrList1);
        System.out.println("farklı list2 :" + arayListFark2);

        arayListFark2.addAll(arayListFark1);//fark list'leri ekledi
        Collections.sort(arayListFark2);//k->b
        Collections.reverse(arayListFark2);// b->k

    }

    public static int getRandomInt(int min, int max) {//bu method max ile min arası sayi return eder

        return (int) (Math.random() * (max - min + 1));
    }

    private static ArrayList<Integer> arrListHazırla(int size, int min, int max) {//bu method create edilecek arrlist size kadar min ile max arsında int sayı cerate eder
        ArrayList<Integer> bosList = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            bosList.add(getRandomInt(min, max));
        }
        return bosList;
    }
}
