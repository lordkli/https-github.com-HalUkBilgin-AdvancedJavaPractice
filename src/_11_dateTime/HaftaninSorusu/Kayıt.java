package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayıt {

    List<Kullanıcı> kisiler = new ArrayList<>();//bos list  create edildi. kayıtAl() method bu liste element atayacak


    public List<Kullanıcı> kayıtAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("adınız giriniz : ");
        String isim = scan.nextLine();
        Kullanıcı k1 = new Kullanıcı(isim, LocalDateTime.now());//Kullanıcı class'dan p'li cons. ile obj create edildi
        kisiler.add(k1);//Kullanıcı class'dan p'li cons. ile  create edilen obj kisler listine eklanedi


        return kisiler;

    }

    public void sanslıKullanıcı(List<Kullanıcı> kll) {

        for (Kullanıcı k : kll) {//kayıtAl() methodunda create edilen her bir kullanıcı döngüye sokuldu
            if (k.kayıtZamanı.getSecond() < 10) {//her bir kullanıcının kayıtZamanındaki sanıye if şartına sokuldu
                System.out.println("sansli kisisiniz " + k.name + " agam 5 kilo bal kazandın  :)");
            } else System.out.println("maalesef " + k.name + " ballar balının buldunuz kovanınız yagmalandı :)");
        }
    }
 public  void listele(List<Kullanıcı> kullanıcılar){
     for (Kullanıcı k:kullanıcılar ) {//kayıtAl() methodyndan gelen kişler listini döngüye sokuyor
         System.out.println("adı : "+k.name+" kayıt zamanı : "+k.kayıtZamanı);//kisile listteki her bir kullanıcının  ad ve kayıt zamanınn  yazdırıdı
     }

 }
}
























