package JavaProjects.P06_KahveMakinesi.KahveMakinesi01;

import java.util.Scanner;

public class KahveMakinesi {

    public static void main(String[] args) {


        /*

  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso

        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                     todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                     todo ----------------------------------

        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.

       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------



        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.


            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.

  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...

                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)

        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)




                    //todo  SONUÇ BÖLÜMÜ

                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :

        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)


        todo Açıklama :

       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için" böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.

       Bir ödev çözümü günü yapacağız. Bunun haberini ilerleyen günlerde size vereceğim.

       Ancak arkadaşlarınızla beraber Voice Channel larda ödev üzerine tartışabilirsiniz.

       HERKESE KOLAY GELSİN !!
                 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        String islemler = "1.Türk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" +
                "4.Americano\n" + "5.Cappicino\n" + "6.Cıkıs";
        System.out.println(islemler);
        System.out.println("************************");

        while (true) {
            System.out.print("Yapmak istediginiz islemin numarasini giriniz : ");
            String hangiKahve = scanner.nextLine();

            if (hangiKahve.equals("6")) {
                System.out.println("Kahve Makinesi Sisteminden cikiliyor...");
                break;
            } else if (hangiKahve.equals("1")) {
                System.out.println("Türk kahvesi hazırlanıyor...");
            } else if (hangiKahve.equals("2")) {
                System.out.println("Filtre kahve hazırlanıyor...");
            } else if (hangiKahve.equals("3")) {
                System.out.println("Espresso hazırlanıyor...");
            } else if (hangiKahve.equals("4")) {
                System.out.println("Americano hazırlanıyor...");
            } else if (hangiKahve.equals("5")) {
                System.out.println("Cappicino hazırlanıyor...");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nSüt eklememizi ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String sut = scanner.nextLine();

            if (sut.equals("1")) {
                System.out.println("Süt ekleniyor...");
            } else if (sut.equals("2")) {
                System.out.println("Sut eklenmiyor...");
            } else {
                System.out.println("Hatali islem yaptiniz...");
                break;
            }

            System.out.print("\nSeker ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String seker = scanner.nextLine();

            if (seker.equals("1")) {
                System.out.print("Kaç seker olsun: ");
                int kacSeker = scanner.nextInt();
                scanner.nextLine();
                System.out.println(kacSeker + " seker ekleniyor");
            } else if (seker.equals("2")) {
                System.out.println("Şeker eklenmiyor ");
            } else {
                System.out.println("Hatalı giris yaptınız. Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nHangi boyutta olsun?\n" + "1.Buyuk Boy\n" + "2.Orta Boy\n" + "3.Kucuk Boy\n" + "Tuslayiniz: ");
            String boyut = scanner.nextLine();

            if (boyut.equals("1")) {
                System.out.println("Buyuk Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("2")) {
                System.out.println("Orta Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("3")) {
                System.out.println("Kucuk Boy Kahveniz hazirlaniyor...");
            } else {
                System.out.println("Hatali gırıs yaptınız. Tekrar deneyiniz...");
                break;
            }


            System.out.println("\nKahveniz hazir. Afiyet olsun !!!");
            break;

        }

    }
}
