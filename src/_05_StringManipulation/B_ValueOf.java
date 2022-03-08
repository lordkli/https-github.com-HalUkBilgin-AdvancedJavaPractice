package _05_StringManipulation;

public class B_ValueOf {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        String paraErkek = "1900";
        String paraKadin = "2000";

        //Bu ailenin toplam gelirini bulunuz.


        int maasErkek = 1900;
        int maasKadin = 2000;

        //maasErkek ve maasKadin sayilarini String'e donusturn ve concatenation yapin



        String girilenKelime = "65";
        int girilenSayi=65;

        // kelimenin -> sayiya cevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // donusecek tipe uygun donusum
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);


        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.




        //toString() methodu;
        short sayi=345;



        //Soru:  String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.

        String bagis1="500";
        String bagis2="1500";




        // Soru :String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";


    }
}
