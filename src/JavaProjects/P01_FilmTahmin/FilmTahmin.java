package JavaProjects.P01_FilmTahmin;

import java.util.*;

public class FilmTahmin {

    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //  Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.print("1-" + (filmler.size()) + " arasinda bir sayi giriniz : ");
        int secilenFilmIndex = scan.nextInt();
        filmGetir(filmler, secilenFilmIndex - 1);


    }

    private static void filmGetir(List<String> film, int index) {
        //   Scanner scan = new Scanner(System.in);
        StringBuilder tahminEdilecekFilm = new StringBuilder(FilmTahmin.filmler.get(index).replaceAll("\\w", "-"));//tum harf karakterleri - ile değiştir
        System.out.println(tahminEdilecekFilm);
        System.out.println(film.get(index).length() + " harfli yabanci film seçtiniz. Filmi tahmin etmek için " + 2 * film.get(index).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {

            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" + 2 * film.get(index).length() + "\ntahmin ettiginiz harfi giriniz : ");//yanlıs girilen tahmin sayisini print edildi
            harf = scan.next().toUpperCase().charAt(0);//film için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
          if (!tahminEdilecekFilm.toString().contains(str)) {//tahminEdilecekFilm'de kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
              tahminSayısı++;
          } //else {//tahminEdilecekFilm'de kullanıcıdan alınan harf varsa tekrar uyarısı verildi
          //     System.out.println(str + " harf zaten acıldı");
          // }
            for (int i = 0; i < tahminEdilecekFilm.length(); i++) {
                if (film.get(index).charAt(i) == harf) {//tahmin listeki edilen harf filmde varsa
                    if (!tahminEdilecekFilm.toString().contains(film.get(index).substring(i, i + 1))) {
                        //tahmin edien harf listteki filmde var ama tahminedilecek (---)filmde yoksa doğru tahmin ettin
                        dogruTahminSayısı++;
                    }
                    tahminEdilecekFilm.setCharAt(i, harf);//dogru tahmin edilen harf tahmineilcekfilme indexe göre atandı

                }

            }
            if (tahminEdilecekFilm.toString().equalsIgnoreCase(film.get(index))) {
                System.out.println("tebrikler kazndınız");
                System.out.println("tahmin ettiğiniz film : " + tahminEdilecekFilm);
                break;
            }
            System.out.println(tahminEdilecekFilm);

        } while ((tahminSayısı - dogruTahminSayısı) != 2 * film.get(index).length());//yanlış sayısı verilen hakka ulaşana kadar do body calışır

        if ((tahminSayısı - dogruTahminSayısı) == 2 * film.get(index).length()) {
            System.out.println("yanlıs tahmin sayısı : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println("agam game over yine bekleriz....tahmin edemedigin film : " + film.get(index));
        }
    }
}

