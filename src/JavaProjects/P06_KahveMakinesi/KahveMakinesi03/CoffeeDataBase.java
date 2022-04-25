package JavaProjects.P06_KahveMakinesi.KahveMakinesi03;

import java.util.Arrays;

public class CoffeeDataBase {
    String[] kahveTurleri = {"No:1 turkisch Coffee", "No:2 filter Coffee", "No:3 espresso"};
    double [] kahveFiyatlari = {2, 1, 3};
     String[] sekerMiktari = {"No:1 sekersiz", "No:2 az sekerli", "No:3 normal sekerli", "No:4 cok sekerli"};
     double[] sekerFiyatlari = {0, 0.2, 0.5, 0.8};
     String[] sutMiktari = {"No:1 sutsuz", "No:2 az sutlu", "No:3 normal sutlu", "No:4 cok sutlu"};
     double[] sutFiyatlari = {0, 0.2, 0.5, 0.8};
     String[] kahveBoyutu = {"No:1 kucuk boy", "No:2 normal boy", "No:3 buyuk boy"};
     double[] boyutFiyatlari = {-0.5, 0, 1};

    public CoffeeDataBase() {
    }

    public CoffeeDataBase(String[] kahveTurleri,String[] sekerMiktari, String[] sutMiktari,String[] kahveBoyutu) {
        this.kahveTurleri = kahveTurleri;
        this.sekerMiktari = sekerMiktari;
        this.sutMiktari = sutMiktari;
        this.kahveBoyutu = kahveBoyutu;
    }
    public CoffeeDataBase(int[] kahveFiyatlar,double[] sekerFiyatlari, double[] sutFiyatlari,double[] boyutFiyatlari) {
        this.kahveFiyatlari = kahveFiyatlari;
        this.sekerFiyatlari = sekerFiyatlari;
        this.sutFiyatlari = sutFiyatlari;
        this.boyutFiyatlari = boyutFiyatlari;
    }
    @Override
    public String toString() {
        return "CoffeeDataBase{" +
                "kahveTurleri=" + Arrays.toString(kahveTurleri) +
                ", kahveFiyatlari=" + Arrays.toString(kahveFiyatlari) +
                ", sekerMiktari=" + Arrays.toString(sekerMiktari) +
                ", sekerFiyatlari=" + Arrays.toString(sekerFiyatlari) +
                ", sutMiktari=" + Arrays.toString(sutMiktari) +
                ", sutFiyatlari=" + Arrays.toString(sutFiyatlari) +
                ", kahveBoyutu=" + Arrays.toString(kahveBoyutu) +
                ", boyutFiyatlari=" + Arrays.toString(boyutFiyatlari) +
                '}';
    }

    public String[] getKahveTurleri() {
        return kahveTurleri;
    }

    public void setKahveTurleri(String[] kahveTurleri) {
        this.kahveTurleri = kahveTurleri;
    }

    public double[] getKahveFiyatlari() {
        return kahveFiyatlari;
    }

    public void setKahveFiyatlari(double[] kahveFiyatlari) {
        this.kahveFiyatlari = kahveFiyatlari;
    }

    public String[] getSekerMiktari() {
        return sekerMiktari;
    }

    public void setSekerMiktari(String[] sekerMiktari) {
        this.sekerMiktari = sekerMiktari;
    }

    public double[] getSekerFiyatlari() {
        return sekerFiyatlari;
    }

    public void setSekerFiyatlari(double[] sekerFiyatlari) {
        this.sekerFiyatlari = sekerFiyatlari;
    }

    public String[] getSutMiktari() {
        return sutMiktari;
    }

    public void setSutMiktari(String[] sutMiktari) {
        this.sutMiktari = sutMiktari;
    }

    public double[] getSutFiyatlari() {
        return sutFiyatlari;
    }

    public void setSutFiyatlari(double[] sutFiyatlari) {
        this.sutFiyatlari = sutFiyatlari;
    }

    public String[] getKahveBoyutu() {
        return kahveBoyutu;
    }

    public void setKahveBoyutu(String[] kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public double[] getBoyutFiyatlari() {
        return boyutFiyatlari;
    }

    public void setBoyutFiyatlari(double[] boyutFiyatlari) {
        this.boyutFiyatlari = boyutFiyatlari;
    }
}

