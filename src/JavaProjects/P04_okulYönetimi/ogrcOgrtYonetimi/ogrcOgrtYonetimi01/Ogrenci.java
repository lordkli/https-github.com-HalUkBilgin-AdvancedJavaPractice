package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01;

public class Ogrenci extends Kisi {

    private String ogrcNo;
    private String sınıf;

    public Ogrenci() {

    }

    public Ogrenci(String ogrcNo, String sınıf) {
        this.ogrcNo = ogrcNo;
        this.sınıf = sınıf;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNo, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.ogrcNo = ogrcNo;
        this.sınıf = sınıf;
    }

    public String getOgrcNo() {
        return ogrcNo;
    }

    public void setOgrcNo(String ogrcNo) {
        this.ogrcNo = ogrcNo;
    }

    public String getSınıf() {
        return sınıf;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrcNo='" + ogrcNo + '\'' +
                ", sınıf='" + sınıf + '\'' +
                "} " + super.toString();
    }

// @Override
   // public String toString() {
   //     return "Ogrenci{" +
   //             "ogrcNo='" + ogrcNo + '\'' +
   //             ", sınıf='" + sınıf + '\'' +
   //             '}';
   // }
}
