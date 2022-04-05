package JavaProjects.P03_UcusProjesi.Ucus_projesi01;

public class Yolcu {

    private String city;
    private String flytype;
    private int age;
    private String name;

    public Yolcu(){

    }

    public Yolcu(String city, String flytype, int age, String name) {
        this.city = city;
        this.flytype = flytype;
        this.age = age;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFlytype() {
        return flytype;
    }

    public void setFlytype(String flytype) {
        this.flytype = flytype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
