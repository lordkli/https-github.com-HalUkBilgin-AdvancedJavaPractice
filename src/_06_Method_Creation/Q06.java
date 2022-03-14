package _06_Method_Creation;

public class Q06 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {


        birKereYazdir("javacılar çoook afilli arkadaşlar");

    }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default değeri "" atadık çünkü işleme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonuç metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }


        System.out.println(sonuc);
    }

}
