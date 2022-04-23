package _15_Exceptions.Q03;

public class Task03_b {
    //    randomSayi isminde static void bir method create ediniz.
    //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
    //    Bu iki random sayının toplamını yazdırın.
    //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
    //     ("Sayı 12'den küçük ise hata verir") print edin.
    public static void main(String[] args) {
        try {
            randomSayi();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void randomSayi() throws Exception {

        int ran1 = (int) (Math.random() * 10 + 1);
        int ran2 = (int) (Math.random() * 10 + 1);
        System.out.println(ran1 + ran2);

        if (ran1 + ran2 < 12) {
            throw new Exception("Sayi 12 den küçük ise hata verir.");
        }

    }

}
