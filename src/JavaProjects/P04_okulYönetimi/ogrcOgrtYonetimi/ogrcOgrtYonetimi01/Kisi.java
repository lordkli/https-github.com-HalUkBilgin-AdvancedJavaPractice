package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01;

public class Kisi {

    private String adSoyad;
    private String kimlikNo;
    private int yas;

    public Kisi() {

    }

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNo = kimlikNo;
        setYas(yas);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = -yas;
        } else
            this.yas = yas;
    }

    @Override
    public String toString() {
        return "{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}





