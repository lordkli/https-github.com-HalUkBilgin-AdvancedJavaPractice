package JavaProjects.P04_okulYönetimi.notHesap;

public class Course {
    Teacher teacher;
    String name;
    String prefix;
    int code;
    int noteYazili;
    int noteSozlu;
    double sozluNotEtki; // her kurs icin sozlu notun etkisini bu degiskenle alalim

    public Course() {

    }

    public Course(String name, String prefix, int code, double sozluNotEtki) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.sozluNotEtki=sozluNotEtki;
    }

    // Main uzerinden cagrilacak bu method ve ilgili Course a ogretmen atamasi yapilacak
    public void addTeacher(Teacher tcr) {
        this.teacher=tcr;
    }

    // Course objesinin printTeacher metoduyla öğretmenini yazdırıyoruz.
    public void printTeacher() {
        System.out.println("Ogretmen \t: " + teacher.mpno + " " + teacher.getName() + " (" + teacher.getBranch() + " Ogretmeni)");
    }

    @Override
    public String toString() {
        return "Course{" +
                "\nteacher=" + teacher +
                ",\n name='" + name + '\'' +
                ",\n prefix='" + prefix + '\'' +
                ",\n code=" + code +
                ",\n noteYazili=" + noteYazili +
                ",\n noteSozlu=" + noteSozlu +
                ",\n sozluNotEtki=" + sozluNotEtki +
                '}';
    }
}
