package JavaProjects.P03_UcusProjesi;

public class Yolcu {



    String city;
    String flytype;

    public Yolcu(String city) {
        this.city = city;
    }

    int age;

    public Yolcu(String city, String flytype, int age) {
        this.city = city;
        this.flytype = flytype;
        this.age = age;
    }
}
