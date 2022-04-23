package _17_Set;

import java.util.*;

public class Ex03 {
    /* TASK:

        1.  30 elemanli, elemanlari 0-10 arasinda random sayilardan olusan bir arraylist create edin.
        2.  1. adımdaki arraylist print edin.
        3.  bu arrayin tekrar eden elemanlarini arrayden silen methodu create edin.
        4.  sonucu print edin
        5.  Basta hazirlanan arraylist'i Set'e cevirin
        6.  Hazirlanan bu Set'i de Arraylist'e cevirin

     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        elemanEkle(list);
        System.out.println("random list = " + list);       //başka bir method'ta bile list üzerinde değişiklik yapıldığında geçerli oluyor
        seteCevir(list);              //liste değişmeden önce set'e çevirmek için cevap sıralamasını değiştirdim (copyasını oluşturup da yapabilirdim
        tekrarlariSill(list);           //normalde tekrarları silmek için direk set'e çevirirdim ama soruda daha sonra çevir diyor
        System.out.println("tekrarları silinen list = " + list);

    }

    private static void seteCevir(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(list);
        System.out.println("ArrayListin Set hali = " + set);

        setiListeyeCevir(set);      //oluşturduğum seti tekrardan array'a çevireceğim

    }

    private static void setiListeyeCevir(Set<Integer> set) {
        ArrayList<Integer> cevrilenList = new ArrayList<Integer>(set);
        System.out.println("Arraya cevrilen set = " + cevrilenList);
    }

    private static void tekrarlariSill(ArrayList<Integer> list) {

        ArrayList<Integer> tekrarsizList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;                //aynı eleman varsa bir indexteki elemanı silecek, eleman atlamaması için "j--"
                }

            }

        }

    }

    private static void elemanEkle(ArrayList<Integer> list) {

        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(rand.nextInt(10));

        }

    }


}


