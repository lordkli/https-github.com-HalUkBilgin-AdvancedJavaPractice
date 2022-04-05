package JavaProjects.P03_UcusProjesi.Ucus_projesi01;

import java.util.Scanner;

public class JavaAirlines {
    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Yolcu yolcu1 = new Yolcu("B","GD",33,"Ayhan Hoca");
        Yolcu yolcu2 = new Yolcu("B","T",10,"Hasan Hoca");

        //  Methods.ucus(yolcu1.getName(),yolcu1.getCity(),yolcu1.getFlytype(),yolcu1.getAge());

        UcusMethods.ucus(yolcu2.getName(),yolcu2.getCity(),yolcu2.getFlytype(),yolcu2.getAge());

    }//main method
}
