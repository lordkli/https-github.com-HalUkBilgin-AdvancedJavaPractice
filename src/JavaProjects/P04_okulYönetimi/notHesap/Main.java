package JavaProjects.P04_okulYönetimi.notHesap;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** WELCOME TO JAVACANLAR SCHOOL ****");
        List<Double> notOrtalama = new ArrayList<>();

        // Teacher objeleri olusturup, ogretmen bilgilerini Teachers daki constructor a gore giriyoruz
        Teacher tcr1 = new Teacher("Ahmet Duman","Matematik", 101);
        Teacher tcr2 = new Teacher("Mehmet Yilmaz","Turkce", 102);
        Teacher tcr3 = new Teacher("Canan Demir","Biyoloji", 103);
        Teacher tcr4 = new Teacher("Sefa Durmaz","Fizik", 104);

        // Course(kurs) objelerini olusturup, kurs bilgilerini Course daki constructor a gore giriyoruz
        // sozluNot un ortalamaya etkisini girdiriyoruz, yaziliNotu un ortalamaya etkisi de
        // (1-sozluNotunEtkisi) seklinde ilerde hesaplanabilir
        Course crs1 = new Course("Matematik","MT",101,0.3);
        Course crs2 = new Course("Turkce", "TR",102,0.5);
        Course crs3 = new Course("Biyoloji","BI",103,0.45);
        Course crs4 = new Course("Fizik","FZ",104,0.2);

        // kurs lara ogretmen atamasi icin Course icindeki addTeacher method uzerinden yapiyoruz
        // Course icinde tanimli Teacher objesine istinaden, hangi kurs icin hangi ogretmen
        // oldugunu ilgili ogretmeni Course icindeki addTeacher methoduna gonderiyoruz.
        crs1.addTeacher(tcr1);
        crs2.addTeacher(tcr2);
        crs3.addTeacher(tcr3);
        crs4.addTeacher(tcr4);

        // burada ogrencileri Student class daki constructor a gore olusturuyoruz.
        // sadece en onemli konu, ogrencinin hangi kurslari aldigini da en sagda sirasina gore
        /// eklememiz gerekiyor. Her ogrencinin her dersi aldigini varsayiyoruz
        Student std1 = new Student("Ali Can","10001","6-A",crs1,crs2,crs3,crs4);
        Student std2 = new Student("Veli Demir","10002","6-A",crs1,crs2,crs3,crs4);
        Student std3 = new Student("Akif Levent","10003","6-A",crs1,crs2,crs3,crs4);
        Student std4 = new Student("Ayse Fatma","10004","6-A",crs1,crs2,crs3,crs4);
        Student std5 = new Student("Canan Can","10005","6-A",crs1,crs2,crs3,crs4);
        Student std6 = new Student("Turan Sanli","10006","6-A",crs1,crs2,crs3,crs4);

        // Ogrencilerin her kurs icin yazili ve sozlu notlarini alip atayalim
        // bunun icin Student class inda addBulkExamNote() methodu olusturuyoruz
        // o method a hem kurs ismini , hem de o kurs daki yazili ve sozlu notlari gonderiyoruz
        // birinci ogrenci icin
        std1.addBulkExamNote(crs1, 60, 70);
        std1.addBulkExamNote(crs2, 60, 70);
        std1.addBulkExamNote(crs3, 60, 70);
        std1.addBulkExamNote(crs4, 60, 70);
        std1.calcAvarage(crs1,crs2,crs3,crs4);
        if(std1.isPass(std1.cAvarage)==true) {
            std1.gectiKaldi="Gecmistir";
        } else {
            std1.gectiKaldi="Kalmistir";
        }

        // ikinci ogrenci icin
        std2.addBulkExamNote(crs1, 70, 75);
        std2.addBulkExamNote(crs2, 70, 75);
        std2.addBulkExamNote(crs3, 70, 75);
        std2.addBulkExamNote(crs4, 70, 75);
        std2.calcAvarage(crs1,crs2,crs3,crs4);
        if(std1.isPass(std2.cAvarage)==true) {
            std2.gectiKaldi="Gecmistir";
        } else {
            std2.gectiKaldi="Kalmistir";
        }

        // ucuncu ogrenci icin
        std3.addBulkExamNote(crs1, 80, 80);
        std3.addBulkExamNote(crs2, 80, 80);
        std3.addBulkExamNote(crs3, 80, 80);
        std3.addBulkExamNote(crs4, 80, 80);
        std3.calcAvarage(crs1,crs2,crs3,crs4);
        if(std3.isPass(std3.cAvarage)==true) {
            std3.gectiKaldi="Gecmistir";
        } else {
            std3.gectiKaldi="Kalmistir";
        }

        // dorduncu ogrenci icin
        std4.addBulkExamNote(crs1, 90, 85);
        std4.addBulkExamNote(crs2, 90, 85);
        std4.addBulkExamNote(crs3, 90, 85);
        std4.addBulkExamNote(crs4, 90, 85);
        std4.calcAvarage(crs1,crs2,crs3,crs4);
        if(std4.isPass(std4.cAvarage)==true) {
            std4.gectiKaldi="Gecmistir";
        } else {
            std4.gectiKaldi="Kalmistir";
        }

        // besinci ogrenci icin
        std5.addBulkExamNote(crs1, 95, 70);
        std5.addBulkExamNote(crs2, 95, 70);
        std5.addBulkExamNote(crs3, 95, 70);
        std5.addBulkExamNote(crs4, 95, 70);
        std5.calcAvarage(crs1,crs2,crs3,crs4);
        if(std5.isPass(std5.cAvarage)==true) {
            std5.gectiKaldi="Gecmistir";
        } else {
            std5.gectiKaldi="Kalmistir";
        }

        // altinci ogrenci icin
        std6.addBulkExamNote(crs1, 93, 87);
        std6.addBulkExamNote(crs2, 93, 87);
        std6.addBulkExamNote(crs3, 93, 87);
        std6.addBulkExamNote(crs4, 93, 87);
        std6.calcAvarage(crs1,crs2,crs3,crs4);
        if(std6.isPass(std6.cAvarage)==true) {
            std6.gectiKaldi="Gecmistir";
        } else {
            std6.gectiKaldi="Kalmistir";
        }
// YAZDIRMALARA GECIYORUZ:
        // okulumuzdaki dersler ve ogretmenlerini yazdiralim
        System.out.println("Ders  \t\t: " + crs1.name + " - " + crs1.code + " - " + crs1.prefix);
        crs1.printTeacher();
        System.out.println("Not   \t\t: Bu derste sozlu notun etkisi % " + crs1.sozluNotEtki*100 + " dir.");
        System.out.println("------------  ------------------------");
        System.out.println("Ders  \t\t: " + crs2.name + " - " + crs2.code + " - " + crs2.prefix);
        crs2.printTeacher();
        System.out.println("Not   \t\t: Bu derste sozlu notun etkisi % " + crs2.sozluNotEtki*100 + " dir.");
        System.out.println("------------  ------------------------");
        System.out.println("Ders  \t\t: " + crs3.name + " - " + crs3.code + " - " + crs3.prefix);
        crs3.printTeacher();
        System.out.println("Not   \t\t: Bu derste sozlu notun etkisi % " + crs3.sozluNotEtki*100 + " dir.");
        System.out.println("------------  ------------------------");
        System.out.println("Ders  \t\t: " + crs4.name + " - " + crs4.code + " - " + crs4.prefix);
        crs4.printTeacher();
        System.out.println("Not   \t\t: Bu derste sozlu notun etkisi % " + crs4.sozluNotEtki*100 + " dir.");

        System.out.println("________________________________________________");

        System.out.println("******** OGRENCI KARNELERI ********");
        // burada ogrenci bilgilerini Student da olusturdugumuz toString e gore yazdiralim
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
        System.out.println(std4);

    }


}
