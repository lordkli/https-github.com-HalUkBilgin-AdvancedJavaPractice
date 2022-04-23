package JavaProjects.P04_okulYönetimi.notHesap;

public class Student {

    Course mat;
    Course tur;
    Course bio;
    Course fiz;
    double cAvarage;

    String name;
    String stuNo;
    String classes;
    boolean isPass;
    String gectiKaldi;


    public Student() {

    }


    public Student(String name, String stuNo, String classes, Course crs1, Course crs2, Course crs3, Course crs4) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = crs1;
        this.tur = crs2;
        this.bio = crs3;
        this.fiz = crs4;

    }

    // main method dan gonderilen kurs ismi, o kurs icin yazili ve sozlu notlari aliyoruz
    // yazili notu, Course class daki noteYazili ya, ve noteSozlu ye atiyoruz,
    // her ogrencinin, ilgili kursdaki noteSozly ve noteYazili kendisine ait obje ye ait
    public void addBulkExamNote(Course course, int yazili, int sozlu) {
        course.noteYazili = yazili;
        course.noteSozlu = sozlu;
    }
    // burada ogrenciden not alinmis ise aldigi yazili ve sozlu notlara gore ortalamalarini hesaplatalim

    public double calcAvarage(Course mat, Course tur, Course bio, Course fiz) {
        return cAvarage = (
                mat.noteSozlu * mat.sozluNotEtki + mat.noteYazili * (1 - mat.sozluNotEtki) +
                        tur.noteSozlu * tur.sozluNotEtki + tur.noteYazili * (1 - tur.sozluNotEtki) +
                        bio.noteSozlu * bio.sozluNotEtki + bio.noteYazili * (1 - bio.sozluNotEtki) +
                        fiz.noteSozlu * fiz.sozluNotEtki + fiz.noteYazili * (1 - fiz.sozluNotEtki)
        ) / 4;

    }

    public boolean isPass(double ortalama) {

        if (ortalama < 50) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Ogrenci Isim\t:" + name +
                "\nOgrenci No\t\t:" + stuNo +
                "\nSinifi\t\t\t:" + classes +
                "\nGenel Ortalama\t:" + cAvarage +
                "\nDonem Sonu Durumu-> " + gectiKaldi + " <-" +
                "\n---------------------------------------"

                ;
    }
}
