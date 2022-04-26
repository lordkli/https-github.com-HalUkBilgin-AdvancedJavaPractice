package _10_List;

import java.util.ArrayList;

public class TD_ArrayList {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listeler = new ArrayList<>(); //2D arrylist
        ArrayList<String> calisanlar = new ArrayList<>();
        calisanlar.add("Ahmet");
        calisanlar.add("Ali");
        calisanlar.add("Emrah");
        calisanlar.add("Elif");
        calisanlar.add("tecnical support");
        ArrayList<String> isverenler = new ArrayList<>();
        isverenler.add("Haluk");
        isverenler.add("Eylul");
        isverenler.add("Yusuf");
        isverenler.add("Can");
        isverenler.add("İbrahim");
        isverenler.add("Mehmet");
        ArrayList<String> sirketler = new ArrayList<>();
        sirketler.add("Amazon");
        sirketler.add("Google");
        sirketler.add("Testinium");
        sirketler.add("IBM");
        listeler.add(calisanlar);
        listeler.add(isverenler);
        listeler.add(sirketler);
        System.out.println(listeler);
        //[[Ahmet, Ali, Emrah, Elif, tecnical support], [Haluk, Eylul, Yusuf, Can, İbrahim, Mehmet], [Amazon, Google, Testinium, IBM]]
    }
}
