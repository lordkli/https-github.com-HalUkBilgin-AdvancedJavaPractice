package _01_veriables;

public class RegExpString {

    public static void main(String[] args) {

        // str.matches(pattern);
        // str'nin pattern'a uygun olup olmadigini kontrol eder. sonuc boolean döner

        // . (nokta) yalniz tek karakter demektir
        // ".s" toplam 2 karakter olmali, ilk karakter herhangi ikinci karakter s olmali
        System.out.println(". quantifier ....");
        System.out.println("as".matches(".s"));  // true, ilk karakter a ikincisi 2 toplam 2 karakter
        System.out.println("mst".matches(".s")); // false (mst 2 karakterden fazla)
        System.out.println("mas".matches("..s")); // true, 3 karakterli ve 3. karakter s

        // [abc]    yalniz bir karakter ve a, b veya  c olmali
        System.out.println("[abc] quantifier ....");
        System.out.println("a".matches("[a]")); // true, str yalniz bir adet a karakterinden olusmali
        System.out.println("ab".matches("[ab]")); // false, 1 karakter olmali a ya da b, 2 karakter var

        // [^abc]    a, b, c disinda herhangi bir karakter (negation)
        System.out.println("[^...] quantifier ....");
        System.out.println("a".matches("[^a]")); // false, bir karakter ancak a haric olmali
        System.out.println("c".matches("[^ab]")); // true, 1 karakter ve a ve b nin disinda
        System.out.println("abcd".matches("[abcd]")); // false, yalniz a, b, c veya d olmali
        System.out.println("c".matches("[abcd]")); // true, tek karakter ve a, b, c veya d
        System.out.println("baaaca".matches("[abc]")); // false,

        //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
        //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali
        System.out.println("[a-z] quantifier ....");
        System.out.println("c".matches("[a-z]")); // true, 1 karakter ve a-z arasinda
        System.out.println("Aa".matches("[a-zA-Z]")); // false, a dan 1 karakter ve a ve b nin disinda
        System.out.println("c".matches("[1-9]")); // false, 1 karakter ve 1-9 arasinda olmali


        // X?    X en fazla 1 defa kullanilabilir
        System.out.println("? quantifier ....");
        System.out.println("a".matches("[abc]?")); // true a, b, c bir defa kullanilabilir
        System.out.println("aaa".matches("[abc]?")); // false, a 1 den fazla kullanilmis
        System.out.println("".matches("[abc]?")); // true, a, b veya c en fazla 1 defa
        System.out.println("b".matches("[abc]?")); // false, a, b veya c en fazla 1 defa

        // X+        X en az 1 defa kullanilabilir
        System.out.println("+ quantifier ....");
        System.out.println("a".matches("[abc]+")); // true, a, b veya c en az bir defa
        System.out.println("aaa".matches("[abc]+")); // true, a 3 defa kullanilmis
        System.out.println("aaddta".matches("[abc]+")); // false, d ve t olmamali
        System.out.println("aaabbcccc".matches("[abc]+")); // true, a, b, c en az 1 defa kullanilmis

        // X*   X sifir veya daha fazla olmali
        System.out.println("* quantifier ....");
        System.out.println("abbbna".matches("[abc]*")); // true, a, b, c,  0 veya fazla olmali
        System.out.println("-----" + "aaa".matches("[abc]*")); // true, a, b, c,  0 veya fazla olmali
        System.out.println("".matches("[abc]*"));   // true, a, b, c 0 defa kullanilmis

        // X{n}      X yalniz n adet kullanilabilir
        // [a-zA-Z0-9]{6}  a-z, A-Z ve 0-9 arasi toplam 6 karakter olmali
        System.out.println("{n} quantifier ....");
        System.out.println("arun32".matches("[a-zA-Z0-9]{6}")); // true
        System.out.println("kkvarun32".matches("[a-zA-Z0-9]{6}")); // false 6 karakterden fazla
        System.out.println("JA2Uk2".matches("[a-zA-Z0-9]{6}")); // true
        System.out.println("arun$2".matches("[a-zA-Z0-9]{6}")); // false, $ olmamali


        // X{n,}      X  n veya daha fazla adet kullanilabilir
        // [a-zA-Z0-9]{6,}  a-z, A-Z ve 0-9 arasi toplam en az 6 karakter olmali
        System.out.println("{n,} quantifier ....");
        System.out.println("kkv32".matches("[a-zA-Z0-9]{6,}")); // false 6 karakterden az
        System.out.println("kkvarun32".matches("[a-zA-Z0-9]{6,}")); // true en az 6 karakterden fazla olabilir

        // X{n,m}      X  en az en fazla m adet kullanilabilir
        // [a-zA-Z0-9]{6,7}  a-z, A-Z ve 0-9 arasi toplam 6 veya 7 karakter olmali
        System.out.println("{n,} quantifier ....");
        System.out.println("+++++" + "kkv32e".matches("[a-zA-Z0-9]{6,7}")); // true
        System.out.println("kkv32ez6".matches("[a-zA-Z0-9]{6,7}")); // false, 8 karakterz


        System.out.println("by character classes and quantifiers ...");
        // ilk karakter 789 ve kalan 9 karakter 0-9 arasi toplam 10 karakter olmali,
        // [789]{1}  == [789]
        System.out.println("9953038949".matches("[789]{1}[0-9]{9}"));   // true
        System.out.println("9953038949".matches("[789][0-9]{9}"));      //true

        System.out.println("6953038949".matches("[789][0-9]{9}")); // false, ilk karakter 6
        System.out.println("99530389490".matches("[789][0-9]{9}")); // false, 11 karakter

    }
}

