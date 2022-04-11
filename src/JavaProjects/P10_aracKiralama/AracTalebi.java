package JavaProjects.P10_aracKiralama;

public class AracTalebi {
    public AracTalebi(){

    }

    private String alinacakSehir;
    private String alinacakGun;
    private double alisSaati;
    private String teslimGunu;
    private double teslimSaati;

    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private double gunlukUcret;


    public AracTalebi(String alinacakSehir, String alinacakGun, double alisSaati, String teslimGunu, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    public AracTalebi(String marka, String model, String yakitTipi, String vites, double gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;

    }

    @Override
    public String toString() {
        return "AracTalebi{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }

    public String getMarka() {

        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {

        this.yakitTipi = yakitTipi;
    }

    public String getVites() {

        return vites;
    }


    public void setVites(String vites) {

        this.vites = vites;
    }

    public double getGunlukUcret() {

        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {

        this.gunlukUcret = gunlukUcret;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(String alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public double getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(double alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }


}
