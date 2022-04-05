package projects.P06_KahveMakinesi.Kahve_mqkinesi01;

public class Kahve {
    private String kahveNo;
    private String kahveAdi;
    private String kahveBoy;
    private String sut;
    private String seker;

    public Kahve() {
    }

    public Kahve(String kahveNo, String kahveAdi) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
    }

    public Kahve(String kahveNo, String kahveAdi, String kahveBoy, String sut, String seker) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
        this.kahveBoy = kahveBoy;
        this.sut = sut;
        this.seker = seker;
    }

    @Override
    public String toString() {
        return "Kahve{" +
                "kahveNo='" + kahveNo + '\'' +
                ", kahveAdi='" + kahveAdi + '\'' +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                '}';
    }

    public String getKahveNo() {
        return kahveNo;
    }

    public void setKahveNo(String kahveNo) {
        this.kahveNo = kahveNo;
    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public String getSeker() {
        return seker;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }

    public String getKahveBoy() {
        return kahveBoy;
    }

    public void setKahveBoy(String kahveBoy) {
        this.kahveBoy = kahveBoy;
    }
}
