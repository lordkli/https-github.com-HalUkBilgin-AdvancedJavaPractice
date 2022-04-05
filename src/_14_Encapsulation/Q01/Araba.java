package _14_Encapsulation.Q01;

public class Araba {// POJO : planing old java object->modal class
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {// p'siz cons.
    }

    public Araba(String model, String renk, int motor, int yil) {// p'li cons.
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

    public Araba(int motor, int yil) {//p'li cons
        this.motor = motor;
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
   @Override
   public String toString() {//bu meyhod bu class'dan cerate edilen obj field'larını stringe çeviririr
       return "Araba{" +
               "model='" + model + '\'' +
               ", renk='" + renk + '\'' +
               ", motor=" + motor +
               ", yil=" + yil +
               '}';
   }

}
