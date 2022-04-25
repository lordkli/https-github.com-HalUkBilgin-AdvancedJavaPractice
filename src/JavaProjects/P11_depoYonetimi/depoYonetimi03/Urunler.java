package JavaProjects.P11_depoYonetimi.depoYonetimi03;

import java.util.Collection;
import java.util.Set;

public class Urunler {
    //pojo model class
    private String urunIsmiJ;
    private String ureticiJ;
    private int miktarJ;
    private String birimJ;
    private String rafJ;

    public String getUrunIsmi() {
        return urunIsmiJ;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmiJ = urunIsmi;
    }

    public String getUretici() {
        return ureticiJ;
    }

    public void setUretici(String uretici) {
        this.ureticiJ = uretici;
    }

    public int getMiktar() {
        return miktarJ;
    }

    public void setMiktar(int miktar) {
        this.miktarJ = miktar;
    }

    public String getBirim() {
        return birimJ;
    }

    public void setBirim(String birim) {
        this.birimJ = birim;
    }

    public String getRaf() {
        return rafJ;
    }

    public void setRaf(String raf) {
        this.rafJ = raf;
    }

    public Urunler(){
    }

    public Urunler( String urunIsmi, String uretici, int miktar, String birim, String raf) {

        this.urunIsmiJ = urunIsmi;
        this.ureticiJ = uretici;
        this.miktarJ = miktar;
        this.birimJ = birim;
        this.rafJ = raf;
    }

    public String toString() {

        return  ", urunIsmi='" + urunIsmiJ + '\'' +
                ", uretici='"   + ureticiJ + '\'' +
                ", miktar="     + miktarJ +
                ", birim='"      + birimJ + '\'' +
                ", raf='"       + rafJ + '\'' +"\n"
                ;




    }

}
