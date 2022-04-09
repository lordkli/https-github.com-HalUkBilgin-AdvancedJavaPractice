package JavaProjects.Projects_03;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {


        System.out.println(camelcase());
    }
    public static String camelcase() {

      String  s1 = " I Live In Usa ";
              s1.trim().replaceAll("[ ]+", " ");

        String[] dizi = s1.trim().split(" ");

        String strDonen = "";

        for (String str : dizi) {
            strDonen += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }
        return strDonen.trim();



    }


}
